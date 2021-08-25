function toys(w) {
  w.sort((a,b) => a-b);
  let answer = 1;
  let start = w[0];
  for (let i = 0; i < w.length; i++) {
    if (w[i] - 4 > start) {
      answer++;
      start = w[i];
    }
  }
  return answer;
}

console.log(toys([1, 2, 3, 21, 7, 12, 14, 21]));  // [[1,2,3], [7], [14], [21,21]]
