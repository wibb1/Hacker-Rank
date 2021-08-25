// function largestPermutation(k, arr) {
//   let max = Math.max(...arr);
//   for (let i = 0; i < k; i++) {
//     for(let j=0;j<arr.length;j++){
//       if (arr[j] === max-i){
//         [arr[i], arr[j]] = [arr[j], arr[i]]
//       }
//     }
//   }
//   return arr;
// }

function largestPermutation(k, arr) {
  let sorted = [...arr].sort((a, b) => b - a);
  let idx;
  const swap = (a,b) => {
      [arr[a], arr[b]] = [arr[b], arr[a]];
      k--;
  }
  for (let i = 0; i < arr.length; i++) {
    if (arr[i] !== sorted[i] && k > 0) {
      swap(i, arr.indexOf(sorted[i]))
    }
  }
  return arr;
}

// function largestPermutation(k, arr) {
//   const sorted = [...arr].sort((a, b) => b - a);
//   const swap = (a, b) => ([arr[a], arr[b]] = [arr[b], arr[a]]) && k--;

//   for (var i = 0; i < arr.length && k > 0; i++) {
//     if (arr[i] === sorted[i]) continue;
//     swap(i, arr.indexOf(sorted[i], i));
//   }

//   return arr;
// }

console.log(largestPermutation(1, [4, 2, 3, 5, 1])); // [ 5,4,3,2,1]
console.log(largestPermutation(2, [2, 1]));
