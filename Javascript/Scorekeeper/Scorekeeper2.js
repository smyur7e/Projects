// Player constructor
function Player(playerIndex) {
	this.button =  document.getElementById("p" + playerIndex);
	this.span = document.getElementById("p" + playerIndex + "Wins");
	this.wins = 0;

	this.button.addEventListner("click", addWin);

	this.addWin = function() {
		this.wins++;
		this.updateScore();
	}

	this.setScore = function() {
		this.span.textContent = this.wins;
	}
}



// Declare/Initialise global variables
var maxReached = false;
var gamesNum = document.getElementById("gamesNum").value;
gamesHeaderChange(gamesNum);

// Event handler for change in games play
function gamesNumChange(e) {
		gamesNum = e.target.value;
		gamesHeaderChange(gamesNum);
}

// Sets maximum number of games
function gamesHeaderChange(number) {
		var gamesHeader = document.getElementById("gamesHeader");

		gamesHeader.textContent = number;
		reset();
}

// Click handler for "Reset" button
function reset() {
		maxReached = false;

  var players = document.querySelectorAll("#p1, #p2");

		for (i = 0; i < players.length; i++) {
				var playerId = players[i].getAttribute("id");
				var playerWinsSpan = document.getElementById(playerId + "Wins");

				playerWinsSpan.textContent = 0;
				playerWinsSpan.style.color = "initial";
		}
}

// Click event handler for any "Player" button
function playerClick(event) {
		var playerId = event.target.getAttribute("id");

		// Get <span> element and current score for player wins
		var playerWinsSpan = document.getElementById(playerId + "Wins");
		
		if (!maxReached) {
				var playerWins = ++playerWinsSpan.textContent;

				if (playerWins == gamesNum) {
						maxReached = true;
						playerWinsSpan.style.color = "green";
				}
		}
}