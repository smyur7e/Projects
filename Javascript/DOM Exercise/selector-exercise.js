// console.log("You are in \"selector-exercise.js\"");

// Selecting first para ELEMENT id
var para1byElementId = document.getElementById("first");

// Selecting first para by ELEMENT class
var para1byElementClass = document.getElementsByClassName("special")[0];

// Selecting first para by CCS id selector
var para1byCSSIdSelector = document.querySelector("#first");

// Selecting first parat by CSS class selector
var para1byCSSClassSelector = document.querySelector(".special");

console.dir(para1byElementId);
console.dir(para1byElementClass);
console.dir(para1byCSSIdSelector);
console.dir(para1byCSSClassSelector);