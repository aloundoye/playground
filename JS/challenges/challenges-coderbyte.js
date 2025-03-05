const https = require('https');

https
  .get('https://coderbyte.com/api/challenges/json/wizard-list', (resp) => {
    let data = '';

    resp.on('data', (chunk) => {
      data += chunk;
    });

    resp.on('end', () => {
      try {
        const jsonData = JSON.parse(data);
        const processedData = processData(jsonData);
        console.log(processedData);
      } catch (error) {
        console.error(error.message);
      }
    });
  })
  .on('error', (error) => {
    console.error(error.message);
  });

function processData(data) {
  return processValue(data);
}

function processValue(value) {
  if (Array.isArray(value)) {
    const processedArray = value.map((item) => processValue(item));
    return deduplicateArray(processedArray);
  } else if (typeof value === 'object' && value !== null) {
    return sortObjectKeys(value);
  } else {
    return value;
  }
}

function sortObjectKeys(obj) {
  const sortedKeys = Object.keys(obj).sort((a, b) =>
    a.localeCompare(b, undefined, { sensitivity: 'base' })
  );

  const newObj = {};
  for (const key of sortedKeys) {
    const processedValue = processValue(obj[key]);
    if (!isEmptyValue(processedValue)) {
      newObj[key] = processedValue;
    }
  }
  return newObj;
}

function deduplicateArray(arr) {
  const seen = new Set();
  const result = [];
  for (const item of arr) {
    const key = typeof item === 'object' ? JSON.stringify(item) : item;
    if (!seen.has(key)) {
      seen.add(key);
      result.push(item);
    }
  }
  return result;
}

function isEmptyValue(value) {
  if (value === null || value === undefined || value === '') {
    return true;
  }
  if (Array.isArray(value)) {
    return value.every((element) => isEmptyValue(element));
  }
  if (typeof value === 'object') {
    return Object.values(value).every((val) => isEmptyValue(val));
  }
  return false;
}
