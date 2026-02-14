ShootCycle class extends abstract Game(Template pattern) class:
- @override 4 method:
  - initializeGame(int numberOfPlayers);
  - endOfGame();
  - playSingleTurn(int playerIndex);
  - displayWinner();
- apply State pattern to set up initializeGame and implement playSingleTurn