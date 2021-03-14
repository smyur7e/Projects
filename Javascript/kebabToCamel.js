// console.log("you are in \"toCamelCase.js\"");

function kebabToCamel(s) {

	if (typeof s !== "string") {
		return s;
	} else if (s == "") {
		return s;
	}

	//First character must be in lowercase;
	s = s.replace(s[0], s[0].toLowerCase());

	for (var i = s.indexOf("-");
		i > -1 && i < s.length;
		i = s.indexOf("-")
		) {

		var prefix = s.slice(0,i);
		var suffix = "";

		// Is there at least 1 more character after "-"?
		if ( i < s.length - 1) {
			suffix = s.slice(i+1);
			// Capitalise just the 1st character of the suffix
			suffix = suffix.replace(suffix[0], suffix[0].toUpperCase());	
		}

		s = prefix + suffix;
	}

	return s;
}