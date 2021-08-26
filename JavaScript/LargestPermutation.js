/*******
 * Inputs:
 *    k = number of swaps
 *    arr = array of values
 *
 * Limits:
 *    1 <= i <= unknown
 *    1 <= arr[i] <= 10**5
 *    1 <= k <= 10**9
 *
 * Tasks:
 *    determine the index of the highest k values
 *    determine the order that the values should be in
 *    swap the values according to the order
 */

function largestPermutation(k, arr) {
  if (k >= arr.length - 1) return arr.sort((a, b) => b - a);
  let sorted = [...arr].sort((a, b) => b - a);
  let idx;
  for (let i = 0; i < arr.length && k > 0; i++) {
    if (arr[i] !== sorted[i]) {
      idx = arr.indexOf(sorted[i]);
      [arr[i], arr[idx]] = [arr[idx], arr[i]];
      k--;
    }
  }
  return arr;
}

console.log(largestPermutation(3, [4, 2, 3, 5, 1])); // [ 5,4,3,2,1]
console.log(largestPermutation(2, [2, 1])); //[2,1]
console.log(largestPermutation(6, [2, 1])); //[2,1]
