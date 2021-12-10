// provided length of array, array of integers, and divisor
// find values where where i<j and ar[i]+ar[j] % k === 0
// approach sort array then iterate through array and check for the if statements 



function divisibleSumPairs(n, k, ar) {
  let count = 0
  for (let i = 0; i < ar.length - 1; i++) {
      for (let j = i+1; j < ar.length; j++) {
          if ((ar[i] + ar[j]) % k === 0) {
              count++
          }
      }
  }
  return count
}