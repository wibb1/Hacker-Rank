/*

find the missing values between two arrays.

Knowns:
arr = array with missing values
barr = array with all the values
n is the size of arr
m is the size of brr
max(brr) - min(brr) <= 100

Notes: 
the frequency of the values must also match
return the missing numbers
only include the missing number once, even if it is missing several times
the difference between the max and min numbers in the lists are <= 100  - this could be a counting sort problem

Constraints:
- the first array is the array with the missing numbers, the second has all the numbers - you do not have to check against each other for missing values - only one has missing values
- 

Steps
1 - create array for counting sort starting at the min in brr and going to the min + 101 to capture all the values possible
2 - feed the number of values in brr into the counting sort array 
3 - iterate through the arr and find the value in the counting sort array and subtract one - when the value reaches -1 then pass the value to the answer array
4 - 



*/

function missingNumbers(arr, brr) {
  // create counting sort array
  let bMin = Math.min(...brr);
  let countArr = new Array(100).fill(0);
  let answer = [];
  for (let value of arr) {
    countArr[value - bMin]++;
  }
  for (let value of brr) {
    countArr[value - bMin]--;
    if (countArr[value - bMin] === -1) answer.push(value);
  }
  return answer.sort((a,b) => a-b);
}

console.log(
  missingNumbers(
    [203, 204, 205, 206, 207, 208, 203, 204, 205, 206],
    [203, 204, 204, 205, 206, 207, 205, 208, 203, 206, 205, 206, 204]
  )
);
