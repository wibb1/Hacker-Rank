function processData(input) {
  const iArr1 = input.split("\n");
  const phonebook = {};

  function addEntry(entry) {
    let entryArr = entry.split(" ");
    phonebook[entryArr[0]] = entryArr[1];
  }

  function printEntry(name) {
    if (phonebook[name] === undefined) {
      return "Not found";
    } else {
      return `${name}=${phonebook[name]}`;
    }
  }

  for (let i = 1; i < parseInt(iArr1[0]) + 1; i++) {
    addEntry(iArr1[i]);
  }
  for (let i = parseInt(iArr1[0]) + 1; i < iArr1.length; i++) {
    console.log(printEntry(iArr1[i]));
  }
}

let input = "3\nsam 99912222\ntom 11122222\nharry 12299933\nsam\nedward\nharry";

processData(input);
