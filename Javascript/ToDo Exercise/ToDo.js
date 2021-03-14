// console.log("You are in Todo.js");

var Todo = [];

function addTodo(i) {
    if ( i != null) {
        Todo.push(i);
    }
}

function listTodo() {
    Todo.forEach(function(item, index) {
        if (index == 0) {
            console.log("************");
        }

        console.log(index + ": " + item);

        if (index == Todo.length - 1) {
            console.log("************");
        };
    });
}

function deleteTodo(i) {
    i = Number(i);

    if (i != null &&
        i >= 0 &&
        i < Todo.length)
    {
        console.log("Index value = " + i);
        var right = Todo.slice(Number(i+1));
        console.log(right);
        console.log(Todo.slice(i+1));
        var left = Todo.slice(0,i);
        console.log(left);
        Todo = left.concat(right);
    } else {
        console.log("Invalid index");
    }
}

function askTodo() {
    for (var choice = prompt("What would like to do?");
        choice != "quit";
        choice = prompt("What would you like to do?")
        )
    {
        if (choice == "new") {
            addTodo(prompt("Enter a new Todo"));
        } else if (choice == "list") {
            listTodo();
        } else if (choice == "delete") {
            deleteTodo(prompt("Enter the index of"
                + " the Todo you want removed"));
        }
    }
    console.log("Goodbye!");
}