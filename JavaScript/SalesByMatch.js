"use strict";

var array1 = [1, 1, 3, 1, 2, 1, 3, 3, 3, 3];
var n1 = 10;
var array2 = [10, 20, 20, 10, 10, 30, 50, 10, 20];
var n2 = 9;
var n3 = 10;
var array3 = [1, 1, 1, 1, 1, 1, 1, 1, 1, 1];

console.log("Answer 1 is " + sockMerchant(n1, array1));
console.log("Answer 2 is " + sockMerchant(n2, array2));
console.log("Answer 3 is " + sockMerchant(n3, array3));
/*
 * Complete the 'sockMerchant' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER n
 *  2. INTEGER_ARRAY ar
 */

function sockMerchant(n, ar) {
  let unique = new Set(ar);
  let obj = {};
  for (const key of unique) {
    obj[key] = 0;
  }
  ar.forEach((value) => {
    obj[value]++;
  });
  let counter = 0;
  Object.keys(obj).forEach((key) => {
    counter += Math.floor(obj[key] / 2);
  });
  return counter;
}

// let sortedArr = ar.sort();
// console.log(sortedArr);
// let sortedValue = sortedArr[0];
// let count = 0;
// let pairCount = 0;
// sortedArr.forEach((value) => {
//   if (sortedValue === value) {
//     count += 1;
//     console.log("count =" + count);
//     if (count % 2 === 0) pairCount++;
//     console.log(`pairCount = ${pairCount}`);
//   } else {
//     sortedValue = value;
//     count = 1;
//   }
// });
//return pairCount;
