/*
multiple pointers / sliding window problem
Need to find the value where the sums to the right and left in the array are equal.  This can or cannot include the value you are on (it may be easier to include the value rather than exclude it.)

Knowns:
- an array of values

Constraints:
- 1<=n<=10**5
- 1<=arr[i]<=2*10**4
- 0<=i<=n

step 1 - if the length = 0 or 1 return "YES" (this may need to be corrected to return "NO" for 0)
step 2 - sum the array from arr[1] to arr[arr.length-1] and assign to right
step 3 - assign the arr[1] to the middle 
step 4 - assign the sum of arr[0] and arr[1] to the left
step 5 - test if the left === right if it does return "YES"
step 6 - if you make it through the entire array then return "NO"

*/

function balancedSums(arr) {
  if (arr.length <= 1) return "YES";
  let sum = 0;
  for (let value of arr) {
    sum += value;
  }
  let middle = arr[0];
  let left = 0;
  let right = sum - left - middle;
  for (let i = 1; i < arr.length; i++) {
    if (right === left) return "YES";
    left += middle;
    middle = arr[i];
    right -= middle;
  }
  return "NO";
}

console.log(
  balancedSums([5, 6, 8, 11]),
  balancedSums([1, 2, 3]),
  balancedSums([1, 2, 3, 3]),
  balancedSums([1, 1, 4, 1, 1]),
  balancedSums([2, 0, 0, 0]),
  balancedSums([0, 0, 2, 0])
);
