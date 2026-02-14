ShootCycle class extends abstract Game(Template pattern) class:
- @override 4 method:
  - initializeGame(int numberOfPlayers);
  - endOfGame();
  - playSingleTurn(int playerIndex);
  - displayWinner();
- apply State pattern to set up initializeGame and implement playSingleTurn.  
### ShootCycle
Each player may perform up to 2 actions per turn. 
- Train: increases cycles by +1. 
- Shoot: awards a random amount of XP from 1 to 3.
- State Pattern (Player Levels)
- - 0–2 XP: Novice
- - 3-5 XP: Intermedia
- - 6-8 XP: Expert
- - ≥ 9 XP: Master(end game)
 
