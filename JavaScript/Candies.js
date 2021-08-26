/************************
 * Inputs:
 *    n = size of the array
 *    arr = array of student ratings
 *    current = current value
 *    candies = the array of the candies 
 *
 * Limits:
 *    give at least 1 candy to each student
 *    student with higher rating will always get more candies
 *
 * Tasks:
 *    create an array for the number of candies
 *    iterate through arr by increasing index
 *        increase the value by one whenever the value increases
 *        set it to 1 if the value does not increase
 *    iterate through arr by decreasing index
 *        increase the value in the array whenever the value decreases
 *        set the value to 1 if the value increases
 *
 *
 *********************************/

function candies(n, arr) {
  let current = 1,
    totalCandy = [current];
  for (let i = 0; i + 1 < arr.length; i++) {
    if (arr[i + 1] > arr[i]) {
      current++;
    } else {
      current = 1;
    }
    totalCandy.push(current);
  }
  current = 1
  for (let i = arr.length - 1; i >= 0; i--) {
    if (current > totalCandy[i]) {
      totalCandy.splice(i, 1, current);
    }
    if (arr[i] < arr[i - 1]) {
      current++;
    } else {
      current = 1;
    }
  }
  return totalCandy.reduce((total, increase) => total + increase);
}
console.log(candies(8, [2, 4, 3, 5, 2, 6, 4, 5])); // 12

console.log(candies(10, [2, 4, 2, 6, 1, 7, 8, 9, 2, 1])); // 19

console.log(candies(10, [6, 4, 2, 6, 1, 7, 8, 9, 2, 1])); // 21

console.log(candies(8, [2, 3, 4, 5, 6, 7, 8, 9])); // 36

console.log(candies(8, [9, 8, 7, 6, 5, 4, 3, 2])); // 36
