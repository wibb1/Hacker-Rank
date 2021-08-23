def countingValleys(steps, path)
  # Write your code here
  count = 0
  sum = 0
  valley = 0
  oldval = 0
  while steps > 0
      path[count] == "U" ? sum += 1 : sum -= 1
      valley += 1 if sum == 0 && oldval == -1
      count += 1
      steps -= 1
      oldval = sum
  end
  return valley
end