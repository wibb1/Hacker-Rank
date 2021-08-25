function gridChallenge(grid) {
  let arr = [];
  let lowArr = new Array(grid[0].length).fill("a");
  for (let str of grid) {
    arr = str.split("").sort();
    for (let i = 0; i < lowArr.length; i++) {
      if (arr[i] < lowArr[i]) {
        return "NO";
      }
      lowArr[i] = arr[i];
    }
  }
  return "YES";
}

