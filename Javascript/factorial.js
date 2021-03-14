function factorial(a) {

	if (!isInt(a)) {
		return undefined;
	}

	var f = 1;
	for (var i = 1; i <= a; i++) {
		f = f * i;
	}

	return f;
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

function test_factorial() {
	for (var i = nextValue(i); i !== "stop"; i = nextValue(i))
	{
		var f = factorial(i);

		if (f === undefined) {
			console.log(i + "! is not defined");
		}
		else {
			console.log(i + "! = " + f);
		}
	}
}