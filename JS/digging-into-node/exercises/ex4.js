#!/usr/bin/env node

'use strict';

import util from 'util';
import path from 'path';
import fs from 'fs';
import { fileURLToPath } from 'url';

import sqlite3 from 'sqlite3';

import minimist from 'minimist';
import { get } from 'http';

const __dirname = path.dirname(fileURLToPath(import.meta.url));
// require("console.table");

// ************************************

const DB_PATH = path.join(__dirname, 'my.db');
const DB_SQL_PATH = path.join(__dirname, 'mydb.sql');

var args = minimist(process.argv.slice(2), {
  string: ['other'],
});

main().catch(console.error);

// ************************************

var SQL3;

async function main() {
  if (!args.other) {
    error("Missing '--other=..'");
    return;
  }

  // define some SQLite3 database helpers
  var myDB = new sqlite3.Database(DB_PATH);
  SQL3 = {
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

  var initSQL = fs.readFileSync(DB_SQL_PATH, 'utf-8');
  await SQL3.exec(initSQL);

  var other = args.other;
  var something = Math.trunc(Math.random() * 1e9);

  // ***********
  const otherID = await insertOrLookupOther(other);
  if (otherID) {
    let result = await insertSomething(otherID, something);

    if (result) {
      let records = await getAllRecords();
      if (records && records.length > 0) {
        console.table(records);
		return;
      }
    }
  }

  error('Oops!');
}

function error(err) {
  if (err) {
    console.error(err.toString());
    console.log('');
  }
}

async function insertOrLookupOther(other) {
  let result = await SQL3.get(
    `
			SELECT
				id
			FROM
				other
			WHERE
				data = ?
		`,
    other
  );

  if (result && result.id) {
    return result.id;
  } else {
    result = await SQL3.run(
      `
		INSERT INTO
			Other(data)
		VALUES
			(?)
	`,
      other
    );

    if (result && result.lastID) {
      return result.lastID;
    }
  }
}

async function insertSomething(otherID, something) {
  const result = await SQL3.run(
    `
		INSERT INTO
			Something(otherID, data)
		VALUES
			(?,?)
		`,
    otherID,
    something
  );

  if (result && result.changes > 0) {
    return true;
  }

  return false;
}

async function getAllRecords() {
  const result = await SQL3.all(
    `
			SELECT
				Other.data AS 'other',
				Something.data AS 'sommething'
			FROM
				Something JOIN Other
				ON (Something.otherID = Other.id)
			ORDER BY
				Other.id DESC, Something.data ASC
		`
  );

  if (result && result.length > 0) {
    return result;
  }
}
