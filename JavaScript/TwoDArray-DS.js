
function hourglassSum(arr) {
  // Write your code here
  let bigSum=-Infinity,
    j = 0;
  let i = 0;
  while (i < arr.length - 2 && j < arr[i].length - 2) {
    let sum =
      arr[i][j] +
      arr[i][j + 1] +
      arr[i][j + 2] +
      arr[i + 1][j + 1] +
      arr[i + 2][j] +
      arr[i + 2][j + 1] +
      arr[i + 2][j + 2];
    if (sum > bigSum) bigSum = sum;
    console.log("first ", arr.length, arr[i].length, i, j);
    i++;
    console.log("second", sum, bigSum, i, j);
    if (i >= arr.length - 2 && j < arr[i].length - 2) {
      i = 0;
      j++;
    }
  }
  return bigSum;
}