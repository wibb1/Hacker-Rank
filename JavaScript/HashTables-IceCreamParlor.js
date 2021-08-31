/*
Knowns:
trips = the total trips they will take
for each trip you will then get
cost = an array of the cost of ice cream flavors.
money = the money to spend for the trip

Constraints:
1<=t<=50
2<=money<=10**9
n<=n<=5*10**4
1<=cost[i]<=10**9

steps 
1 - make an object with the name of the number and the value of the index in an array.  If there is more than one value push it into the array

2 - if the value less money is in the object and it is not the same as the value then return the value of the first value of the array

3 - if value less money is equal to to the value but there are more than one of the indexes in the array then return the second value


*/
function whatFlavors(cost, money) {
  const obj = {};
  for (let i = 0; i < cost.length; i++) {
    if (!obj[cost[i]]) {
      obj[cost[i]] = [i];
    } else {
      obj[cost[i]].push(i);
    }
  }
  for (let i = 0; i < cost.length; i++) {
    if (obj[money - cost[i]]) {
      if (money - cost[i] === cost[i] && obj[cost[i]].length > 1) {
        console.log(`${i + 1} ${obj[money - cost[i]][1] + 1}`);
        break;
      } else if (money - cost[i] !== cost[i]) {
        console.log(`${i + 1} ${obj[money - cost[i]][0] + 1}`);
        break;
      }
    }
  }
}

let cost = [2, 2, 3, 2, 6, 7, 3, 9, 10, 20, 9, 8, 7, 090, 78, 54];
let money = 6;

whatFlavors(cost, money);
