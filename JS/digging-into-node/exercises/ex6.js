#!/usr/bin/env node

'use strict';

import util from 'util';
import path from 'path';

import express from 'express';
import sqlite3 from 'sqlite3';
import { fileURLToPath } from 'url';

const __dirname = path.dirname(fileURLToPath(import.meta.url));

// ************************************

const DB_PATH = path.join(__dirname, 'my.db');
const WEB_PATH = path.join(__dirname, 'web');
const HTTP_PORT = 8039;

var delay = util.promisify(setTimeout);

// define some SQLite3 database helpers
//   (comment out if sqlite3 not working for you)
var myDB = new sqlite3.Database(DB_PATH);
var SQL3 = {
  run(...args) {
    return new Promise(function c(resolve, reject) {
      myDB.run(...args, function onResult(err) {
        if (err) reject(err);
        else resolve(this);
      });
    });
  },
  get: util.promisify(myDB.get.bind(myDB)),
  all: util.promisify(myDB.all.bind(myDB)),
  exec: util.promisify(myDB.exec.bind(myDB)),
};

const app = express();

main();

// ************************************

function main() {
  // TODO: define routes
  app.use(express.static('web'));

  app.get('/', (req, res) => {
    res.sendFile(path.join(WEB_PATH, 'index.html'));
  });

  app.get('/api', async (req, res) => {
    const records = await getAllRecords();
    res.status(200).send(JSON.stringify(records));
  });

  app.use((req, res) => {
    res.status(404).sendFile(path.join(WEB_PATH, '404.html'));
  });
  app.listen(HTTP_PORT);
  console.log(`Listening on http://localhost:${HTTP_PORT}...`);
}

// *************************
// NOTE: if sqlite3 is not working for you,
//   comment this version out
// *************************
async function getAllRecords() {
  var result = await SQL3.all(
    `
		SELECT
			Something.data AS "something",
			Other.data AS "other"
		FROM
			Something
			JOIN Other ON (Something.otherID = Other.id)
		ORDER BY
			Other.id DESC, Something.data
		`
  );

  return result;
}

// *************************
// NOTE: uncomment and use this version if
//   sqlite3 is not working for you
// *************************
// async function getAllRecords() {
// 	// fake DB results returned
// 	return [
// 		{ something: 53988400, other: "hello" },
// 		{ something: 342383991, other: "hello" },
// 		{ something: 7367746, other: "world" },
// 	];
// }
