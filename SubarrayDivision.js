// s = array of values
// d = the sum
// m = the length of the sum

// set up a loop that slices the length of m from s and returns the sum
// check if the sum is = to d, if it is increment the counter

function birthday(s, d, m) {
  let subS = [],
    val,
    count = 0;
  for (let i = 0; i < s.length - m + 1; i++) {
    subS = s.slice(i, m + i);
    val = subS.reduce((acc, ele) => {
      return acc + ele;
    }, 0);
    if (val === d) count++;
  }
  return count;
}

let ans = birthday([2, 2, 1, 3, 2], 4, 2);
console.log(ans);
