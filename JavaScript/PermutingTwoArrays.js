
function twoArrays(k, A, B) {
  A.sort((a,b)=> b-a)
  B.sort((a,b)=>a-b)
  let answer = true
  for(let i =0;i<A.length; i++){
      if (A[i]+B[i]<k){
          answer = false
      }
  }
  return answer ? "YES" : "NO"
}