var age, sqrtAge, isInteresting;

age = prompt("Enter your age in years");
sqrtAge = Math.sqrt(age);
isInteresting = false;

if (age < 0) {
	console.log("You are not born yet!");
}
else if (age == 21) {
		console.log ("Happy 21st - you can drink now!");
		isInteresting = true;
}
else {
	if (age % 2 == 1) {
		console.log ("You are at an "
			+ "\"odd\" time in your life");
		isInteresting = true;
	};

	if (sqrtAge == Math.trunc(sqrtAge)) {
		console.log("Your age is a perfect square");
		isInteresting = true;
	};

	if (!isInteresting) {
		console.log("Your life this year is uninteresting");
	}
}