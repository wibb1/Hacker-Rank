/*
The red region denotes the house, where `start` is the start point, and `end` is the endpoint. The apple tree is to the left of the house, and the orange tree is to its right.

Assume the trees are located on a single point, where the apple tree is at point `aTree`, and the orange tree is at point `oTree`.

When a fruit falls from its tree, it lands `d` units of distance from its tree of origin along the x-axis. *A negative value of `d` means the fruit fell `d` units to the tree`s left, and a positive value of `d` means it falls `d` units to the tree`s right. *

Given the value of `d` for `m` apples and `n` oranges, determine how many apples and oranges will fall on Sam's house (i.e. in the inclusive range `[s,t]`)?
*/

function countApplesAndOranges(start, end, aTree, oTree, dApples, dOranges) {
  function fruitFall(arr, tree) {
    let count = 0;
    for (let distance of arr) {
      if (tree + distance >= start && tree + distance <= end) count++;
    }
    console.log(count);
  }
  fruitFall(dApples, aTree);
  fruitFall(dOranges, oTree);
}

countApplesAndOranges(7, 11, 5, 15, [-2, 2, 1], [5, -6])
