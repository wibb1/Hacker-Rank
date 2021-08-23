// with separate callback function
function gradingStudents(grades) {
  function round5(val) {
    let rounded = Math.ceil(val / 5) * 5;
    if (rounded - val < 3 && rounded >= 40) {
      return rounded;
    } else {
      return val * 1;
    }
  }
  return grades.map((grade) => round5(grade));
}
console.log(gradingStudents([73, 67, 38, 33]));

// integrated callback function
function gradingStudents2(grades) {
  return grades.map((grade) => {
    let rounded = Math.ceil(grade / 5) * 5;
    if (rounded - grade < 3 && rounded >= 40) {
      return rounded;
    } else {
      return grade * 1;
    }
  });
}
console.log(gradingStudents2([73, 67, 38, 33]));
