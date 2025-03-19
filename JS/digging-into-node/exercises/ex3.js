#!/usr/bin/env node

'use strict';
import minimist from 'minimist';
import {CAF} from 'caf';

import path from 'path';
import fs from 'fs';
import { fileURLToPath } from 'url';
import { Transform } from 'stream';
import zlib from 'zlib';
import { error } from 'console';

const __filename = fileURLToPath(import.meta.url);
const __dirname = path.dirname(__filename);

const args = minimist(process.argv.slice(2), {
  boolean: ['help', 'in', 'out', 'compress', 'uncompress'],
  string: ['file'],
});

processFile = CAF(processFile);

function streamComplete(stream) {
  return new Promise((res) => {
    stream.on('end', res);
  });
}

const BASE_PATH = path.resolve(process.env.BASE_PATH || __dirname);

let OUTFILE = path.join(BASE_PATH, 'out.txt');
let cancellableToken = CAF.timeout(30, '\n\nTook too long');

if (args.help) {
  console.log('Help needed');
} else if (args.in || args._.includes('-')) {
  processFile(cancellableToken, process.stdin)
    .then(() => {
      console.log('complete!');
    })
    .catch((error) => {
      console.error(error);
    });
} else if (args.file) {
  const filepath = path.join(BASE_PATH, args.file);
  let stream = fs.createReadStream(filepath);
  processFile(cancellableToken, stream)
    .then(() => {
      console.log('complete!');
    })
    .catch((error) => {
      console.error(error);
    });
} else {
  console.error('Incorrect usage.\nHelp Needed');
}

function* processFile(signal, inStream) {
  let outStream = inStream;

  if (args.uncompress) {
    let gUnzipStream = zlib.createUnzip();
    outStream = inStream.pipe(gUnzipStream);
  }

  const upperStream = new Transform({
    transform(chunk, encoding, next) {
      this.push(chunk.toString().toUpperCase());
      next();
    },
  });

  outStream = outStream.pipe(upperStream);

  if (args.compress) {
    let gzipStream = zlib.createGzip();
    outStream = outStream.pipe(gzipStream);
    OUTFILE = `${OUTFILE}.gz`;
  }

  let targetStream;
  if (args.out) {
    targetStream = process.stdout;
  } else {
    targetStream = fs.createWriteStream(OUTFILE);
  }

  outStream.pipe(targetStream);

  signal.pr.catch(() => {
    outStream.unpipe(targetStream);
    outStream.destroy();
  });

  yield streamComplete(outStream);
}
