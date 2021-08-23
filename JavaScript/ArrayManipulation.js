function arrayManipulation(n, queries) {
  //run through the queries and place add the value into a new array at the start location and subtract after the end location.  At the end iterate through the numbers and add them together in order and find the highest value

  const ansArr = new Array(n).fill(0);
  let start,
    end,
    value,
    max = 0;
  for (let arr of queries) {
    start = arr[0] - 1;
    end = arr[1];
    value = arr[2];
    ansArr[start] += value;
    ansArr[end] += -value;
  }
  value = 0;
  for (let number of ansArr) {
    value += number;
    if (value > max) max = value;
  }
  return max
}

const ans = arrayManipulation(10, [[1,5,3],[4,8,7],[6,9,1]])

console.log(ans)

// function arrayManipulation(n, queries) {
//   // Write your code here
//   queries.sort()
//   const addValue = (start, end, value, obj) => {
//       for (let i = start; i <= end; i++) {
//           obj[i] += value
//       }
//   }
//   const newObj = (obj) => {
//       for (let i = 1; i < 11; i++) {
//           obj[i] = 0;
//       }
//   }

//   let object = {}
//   newObj(object)
//   let start, end, value
//   for (let item of queries) {
//       start = item[0]
//       end = item[1]
//       value = item[2]
//       addValue(start, end, value, object)
//   }
//   console.log(object)

//   let answer = 0
//   Object.entries(object).forEach(
//       ([key, num]) => { if (num > answer) answer = num }
//   )
//   return answer
// }
