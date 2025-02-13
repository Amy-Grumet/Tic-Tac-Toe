# Multithreaded Tic-Tac-Toe
A Tic-Tac-Toe game implemented in Java that features an AI opponent powered by multithreading for a seamless and interactive player experience.

## Features
    - Concurrent Gameplay: Runs the human and AI players on separate threads, ensuring smooth and responsive gameplay. 
    - AI opponent: Employs the java.util.Random class to select valid and available moves on the board. 
    - Input Validation: Verifies that the user input is a number that is within range of the game board and has not already been played.
    
## Setup and Installation
    1. Clone the repository
            git clone https://github.com/Amy-Grumet/MultithreadedTic-Tac-Toe.git
            cd MultithreadedTic-Tac-Toe
    2. Compile the files
            javac *.java
    3. Run the game
            java Game
    
## How to Play
    1. The game is designed for a single human opponent to play against an AI model.
    2. You will first be prompted to enter the row you would like to place your marker. Then, you will be prompted to enter the column. 
    3. The AI challenger will then make a move. 
    4. The game continues until a win or draw is detected. 

## Project Structure 
    .
    ├── AI.java         # Contains logic for the AI opponent and runs on a separate thread to simulate decision-making
    ├── Board.java      # Manages the Tic-Tac-Toe board - handles move validation and board state
    ├── Game.java       # Main class 
    └── Player.java     # Manages human player interactions


## Potential Improvements
    1. Advanced AI Opponent: Utilize a minimax algorithm to create a smarter and more challenging opponent.
    2. Score Tracking: Maintain a leaderboard to keep track of results across multiple games.
    3. Two Player Mode: Integrate a human vs. human mode. 


