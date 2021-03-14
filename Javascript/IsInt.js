// function isInt(a) {

// 	if (Number(a) != a) {
// 		console.log("Not a Number");
// 	}
// 	else if (a % 10 == 0 ||
// 			a % 10 == 1 || a % 10 == -1 ||
// 			a % 10 == 2 || a % 10 == -2 ||
// 			a % 10 == 3 || a % 10 == -3 ||
// 			a % 10 == 4 || a % 10 == -4 ||
// 			a % 10 == 5 || a % 10 == -5 ||
// 			a % 10 == 6 || a % 10 == -6 ||
// 			a % 10 == 7 || a % 10 == -7 ||
// 			a % 10 == 8 || a % 10 == -8 ||
// 			a % 10 == 9 || a % 10 == -9
// 			) {
// 		console.log("It's and integer");
// 	} else {
// 		console.log("It's a decimal");
// 	}
// }


function isInt(a) {
	var b;

	// First check the parameter type
	if (typeof a == "number") { // is it a number?
		b = a;
	}
	else if (typeof a == "string") { // is a string?
		if (a.length == 0) { // is it empty
			return undefined;
		}
		else {
			b = Number(a);

			if (!(b == a)) { // is it really a number?
				return undefined;
			}
		}
	} else { // something that cannot be used
		return undefined;
	}

	if (b == Math.trunc(b) ) { // is it a whole number?
		return true;
	} else {
		return false;
	}
}
