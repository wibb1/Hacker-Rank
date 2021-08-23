### There is a large pile of socks that must be paired by color. Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are.

# Example

There is one pair of color 1 and one of color 2. There are three odd socks left, one of each color. The number of pairs is 2.

# Function Description

Complete the sockMerchant function in the editor below.

sockMerchant has the following parameter(s):

* int n: the number of socks in the pile
* int ar[n]: the colors of each sock

# Returns

* int: the number of pairs
* Input Format

The first line contains an integer  "n", the number of socks represented in "ar".
The second line contains "n" space-separated integers, "ar[i]", the colors of the socks in the pile.

# Constraints
1 <= n <=100
1 <= ar[i] <= 100 where 0 <= i < n

# Sample Input

STDIN                       Function
-----                       --------
9                           n = 9
10 20 20 10 10 30 50 10 20  ar = [10, 20, 20, 10, 10, 30, 50, 10, 20]

# Sample Output

3

# Explanation

10-10, 10-10, 20-20, 50, 30, 20

There are three pairs of socks.

# sudo

sort the original array
count until there is a number change
feed count / 2 rounded down to the total

sortedArr = arr.sort();
let sortedValue = sortedArr[0];
let count = 0;
let pairCount = 0;
sortedArr.forEach((value) => {
  if sortedValue === value {
    count+=.5
  } else {
      pairCount += Math.floor(count)
      storedValue = value
      count = 0.5
  }
})
return pairCount



iterate through the array and look for the hash key value, if found add 0.5 to the value of the hash



objectArray = {10: 2, 20: 1.5, 30: 0.5, 50: 0.5}

Math.floor(value) to turn float to integer which will eliminate the half value