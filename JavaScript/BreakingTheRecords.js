function breakingRecords(scores) {
  // Write your code here
  let min = scores[0]
  let max = scores[0]
  let best = 0
  let worst = 0
  for (let i of scores) {
      if (i > max) {
          best++
          max = i
      }
      if (i < min) {
          worst++
          min = i
      }
  }
  return [best, worst]
}