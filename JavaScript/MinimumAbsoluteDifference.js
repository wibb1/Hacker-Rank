function minimumAbsoluteDifference(arr) {
  arr.sort((a, b) => a - b);
  let ans = Infinity,
    val;
  for (let i = 0; i < arr.length - 1; i++) {
    val = Math.abs(arr[i] - arr[i + 1]);
    if (val < ans) ans = val;
  }
  return ans;
}
