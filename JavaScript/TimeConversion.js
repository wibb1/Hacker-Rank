function timeConversion(s) {
  let merid = s.slice(-2)
  let sArr = s.slice(0,-2).split(':')
  if(merid === 'PM' && parseInt(sArr[0]) != 12){
      sArr[0] = parseInt(sArr[0])+12
  } else if(merid === 'AM' && parseInt(sArr[0]) === 12){
      sArr[0] = '00'
  }
  return sArr.join(':')
}