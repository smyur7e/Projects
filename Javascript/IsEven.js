//alert("I am isEven()");

function isEven(a) {
	var b = isInt(a);

	if (typeof b === "undefined" ||
		!b) {
		return undefined;
	}
	else if (a % 2 == 0) {
		return true;
	}
	else {
		return false;
	}
}

function nextValue(i) {				
	if (i === undefined) {
		return null;
	}
	else if (i === null) {
		return "";
	}
	else if ( i === "") {
		return "abcd";
	}
	else if (i === "abcd") {
		return "12.3";
	}
	else if (i === "12.3") {
		return "12";
	}
	else if (i === "12" ) {
		return "3";
	}
	else if (i === "3") {
		return "-1";
	}
	else if (i === "-1") {
		return "-2";
	}
	else if (i === "-2") {
		return "0";
	}
	else if (i === "0") {
		return 12.3;
	}
	else if (i === 12.3) {
		return 12;
	}
	else if (i === 12) {
		return 3;
	}
	else if (i === 3) {
		return -1;
	}
	else if (i === -1) {
		return -2;
	}
	else if (i === -2) {
		return 0;
	}
	else if (i === 0) {
		return NaN;
	}
	else {
		return "stop";
	}
}

function test_isEven() {
	for (var i = nextValue(i); i !== "stop"; i = nextValue(i))
	{
		// Testing function "isEven()"
		if (isEven(i) === undefined) {
			console.log(i + " is not a whole number!");
		}
		else if (isEven(i)) {
			console.log(i + " is even!");
		}
		else {
			console.log(i + " is odd!")
		}
	}
}
