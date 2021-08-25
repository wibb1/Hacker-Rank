// k is the number of important losses
// L is the array of lucks => loss increases luck win decreases luck
// T is an array of importance where 1 is important and 0 is unimportant
//  goals
// we will always lose unimportant contests adding their luck
// we will only win the lowest luck important contests (sort by luck value)
// contests is an array of contests with its luck and importance values in a subarray

function luckBalance(k, contests) {
  let luck = 0;
  const highLuck = [];
  for (let i = 0; i < contests.length; i++) {
    if (contests[i][1] === 1) {
      highLuck.push(contests[i][0]);
    }
    luck += contests[i][0];
  }
  highLuck.sort((a, b) => a - b);
  console.log(highLuck, luck)
  for (let i = 0; i <= highLuck.length - k - 1; i++) {
    luck -= highLuck[i]*2;
  }
  return luck;
}

let k = 3;
let contests = [
  [5, 1], //5
  [2, 1], //2
  [1, 1],
  [8, 1], //8
  [10, 0], //10
  [5, 0], //5
];

console.log(luckBalance(k, contests));
