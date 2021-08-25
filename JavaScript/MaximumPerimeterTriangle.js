// find the triangle with the longest perimeter that is a triangle and not a line
// sort the values from high to low
// find the first values in the array where v0 < v1 + v2
// if there is not one of these then return -1 otherwise return v2, v1, v0

function maximumPerimeterTriangle(sticks) {
  let rtnArr = [-1];
  sticks.sort((a, b) => b - a);
  for (let i = 0; i < sticks.length; i++) {
    if (sticks[i] < sticks[i + 1] + sticks[i + 2]) {
      rtnArr = [sticks[i + 2], sticks[i + 1], sticks[i]];
      break;
    }
  }
  return rtnArr;
}
console.log(maximumPerimeterTriangle([1, 2, 3]));
