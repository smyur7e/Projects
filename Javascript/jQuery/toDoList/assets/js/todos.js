// console.log("connected");

// check off specific todo's when clicking
// ..including any todo's added using the..
// ..input text field 
$("ul").on("click", "li",
    function() {
        $(this).toggleClass("completed");
    }
)
// $("li").click(
//     function() {
//         $(this).toggleClass("completed");
//     }
// )

// remove a to do whne the user clicks on the X before the li
$("ul").on("click", "span",
    function (event) {
        $(this).parent().fadeOut(500,
            function() {
                $(this).remove();
            });
        event.stopPropagation();
    });

// Add the input field value as a new todo item
$("input").keypress(
    function(event){
        if (event.which === 13) {
            $("ul").append("<li><span>X</span>  "
                + $(this).val()
                + "</li>");
            $(this).val("");
        }
    });