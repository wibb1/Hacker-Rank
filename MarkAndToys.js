function maximumToys(prices, k) {
  // Write your code here
  let total = 0;
  prices.sort((a, b) => a - b);

  for (let i = 0; i < prices.length; i++) {
    if (total + prices[i] <= k) {
      total += prices[i];
    } else {
      return i;
    }
  }
}

let prices = [1, 2, 3, 4];
let k = 7;
