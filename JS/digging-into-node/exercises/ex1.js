#!/usr/bin/env node

'use strict';
import minimist from 'minimist';
import getStdin from 'get-stdin';

import path from 'path';
import fs from 'fs';
import util from 'util';
import { fileURLToPath } from "url";

const __filename = fileURLToPath(import.meta.url);
const __dirname = path.dirname(__filename);

const args = minimist(process.argv.slice(2), {
  boolean: ['help', 'in'],
  string: ['file'],
});

const BASE_PATH = path.resolve(process.env.BASE_PATH || __dirname);

if (args.help) {
  console.log('Help needed');
} else if (args.in || args._.includes('-')) {
  // TODO: handle stdin
  getStdin()
    .then(processFile)
    .catch((error) => {
      console.error(error);
    });
} else if (args.file) {
  const filepath = path.join(BASE_PATH, args.file);

  fs.readFile(filepath, (err, contents) => {
    if (err) {
      console.error('Something wrong happened:', err.toString());
    }
    processFile(contents);
  });
} else {
  console.error('Incorrect usage.\nHelp Needed');
}

function processFile(contents) {
  process.stdout.write(contents.toString().toUpperCase());
}
