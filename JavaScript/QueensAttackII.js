/*
Known:
n = the length and width of the 2D array
k = the number of obstacles on the board
r_q = the row the queen is on
c_q = the column the queen is on
obstacles = array of two integer arrays representing the row then column of the obstacle

Constraints: 
0 <= n <= 10**5
0 <= k <= 10**5

Steps:
1 - create an object to hold the obstacles 
2 - create a function (straightLine) that takes the increase in the vertical and the increase in the horizontal and determines how many locations are in that direction before it hits an obstacle or the end of the board
3 - create a loop to cycle through the 8 directions and feed them to the straightLine function)
*/

function queensAttack(n, k, r_q, c_q, obstacles) {
  function genObj(obstacles) {
    const obj = {};
    for (let i = 0; i < obstacles.length; i++) {
      obj[`${obstacles[i][0]},${obstacles[i][1]}`] = true;
    }
    return obj;
  }

  const obj = genObj(obstacles);
  function straightLine(rowI, colI) {
    let y = r_q + rowI;
    let x = c_q + colI;
    while (x > 0 && x <= n && y > 0 && y <= n) {
      if (!obj[`${y},${x}`]) {
        console.log(`${y},${x}`)
        squares++;
      } else {
        console.log("out");
        return;
      }
      x += colI;
      y += rowI;
    }
  }

  let squares = 0;
  let directions = [
    [1, -1],
    [1, 0],
    [1, 1],
    [0, 1],
    [0, -1],
    [-1, -1],
    [-1, 0],
    [-1, 1]
  ];
  for (let i = 0; i < directions.length; i++) {
    straightLine(directions[i][0], directions[i][1]);
  }

  return squares;
}

console.log(
  queensAttack(5, 3, 4, 3, [
    [5, 5],
    [4, 2],
    [2, 3],
  ])
);
