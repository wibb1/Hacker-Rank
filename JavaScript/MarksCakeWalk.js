function marcsCakewalk(calorie) {
  calorie.sort((a,b)=> b-a)
  let sum = 0
  for(let i=0; i<calorie.length; i++){
    sum += (2**i)*calorie[i]
  }
  return sum
}