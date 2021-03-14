// console.log("You are in \"ReturnFunction.js\"");

function getFunc(funcName) {
	if (funcName == "isEven") {
		return isEven;
	} else if (funcName == "factorial") {
		return factorial;
	}
}