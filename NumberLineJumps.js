// to pointers start at different locations and move forward at different speeds determine if they are at the same spot at the same time.  This is algebra - the values must cross (x2-x1)*(v2-v1)<0 and they have to do so at the same time (x2-x1) % (v1-v2) === 0

function kangaroo(x1, v1, x2, v2) {
  if ((x2 - x1) * (v2 - v1) < 0 && (x2 - x1) % (v1 - v2) === 0) {
    return "YES";
  }
  return "NO";
}

const ans = kangaroo(2, 1, 1, 2);

console.log(ans);
