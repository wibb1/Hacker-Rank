/*
Knowns: 
k = the target value to be subtracted to find the pairs
arr = the array of values 

Constraints:
2 <= n <= 10**5
0 <= k <= 10**9
0 <= arr[i] <= 2**31-1
each arr[i] will be unique

Steps:
1 - sort the array.

2 - starting at the smallest value create an object from the array with the value in the array as the key.  Check the object to see if the value in the array minus k exists (is not undefined).  If it does assign true if it doesn't assign false

4 - loop through the object and see if the value is true or false, if true increment a counter by one.

*/

function pairs(k, arr) {
  arr.sort((a, b) => a - b);
  const obj = {};
  let counter = 0;
  for (let value of arr) {
    if(obj[value-k] !== undefined){
      obj[value] = true
    } else {
      obj[value] = false
    }
  }
  for (let property in obj) {
    if (obj[property]) {
      counter++;
    }
  }
  return counter;
}

let k = 2;
let arr = [1, 5, 3, 4, 2];

console.log(pairs(k, arr));
