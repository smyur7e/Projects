// Constructor
function Teacher(first, last, age, gender, interests, subject) {
  Person.call(this, first, last, age, gender, interests);

  this.subject = subject;
}

// Teacher has a different greeting
Teacher.prototype.greeting = function() {
  var prefix;

  if (this.gender === "male" || this.gender === "Male" || this.gender === "m" || this.gender === "M") {
    prefix = "Mr.";
  } else if (this.gender === "female" || this.gender === "Female" || this.gender === "f" || this.gender === "F") {
    prefix = "Mrs.";
  } else {
    prefix = "Mx.";
  }

  alert("Hello. My name is " + prefix + " " + this.name.last + ", and I teach " + this.subject + ".");
}

// Teacher"s prototype is Person...
Teacher.prototype = Object.create(Person.prototype);

// Teacher"s prototype"s constructor is Teacher
Object.defineProperty(Teacher.prototype, "constructor", {
  value: Teacher,
  enumerable: false,
  writable: true
});
