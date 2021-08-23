
function hourglassSum(arr) {
  let bigSum=-Infinity,
    j = 0, i = 0;
    
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
    // console.log("first ", i, j);
    i++;
    // console.log("second", i, j, sum, bigSum);
    if (i >= arr.length - 2 && j < arr[i].length - 2) {
      i = 0;
      j++;
    }
  }
  console.log(bigSum);
}

const arr1 =[
  [ 1, 1, 1, 0, 0, 0 ],
  [ 0, 1, 0, 0, 0, 0 ],
  [ 1, 1, 1, 0, 0, 0 ],
  [ 0, 0, 2, 4, 4, 0 ],
  [ 0, 0, 0, 2, 0, 0 ],
  [ 0, 0, 1, 2, 4, 0 ]
]

hourglassSum(arr1)

// 7, 4, 2, 0
// 4, 8, 10, 8
// 3, 6, 7, 6
// 3, 9, 19, 16