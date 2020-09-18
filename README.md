# A 2D snake game using the java programming language.
### Description: This a simple 2D game. The main goal of this project is to apply the OOP concept and java GUI library.
## Table of Content
- [Project Features](#project-features)
- [Technical overview](#technical-overview)
- [Tools and Software Version used here](#tools-and-software-version-used-here)
- [Class & Method Explanation](#class--method-explanation)
- [Online Resources used](#online-resources-used)
- [Future Enhancements](#future-enhancements)

## Project Features:
- 2D game
- Gain points
- OOP, Thread programming
- JAVA GUI
    - ![image](https://github.com/samiul0112/2D_game/blob/master/project.gif)

### Technical overview:
#### Tools and Software Version used here:
- IntelliJ IDEA 2020.2.2 (Ultimate Edition) Build #IU-202.7319.50
- OpenJDK-14.0.1
- Java Swing
#### Class & Method Explanation:
- GameRunner:  This is the driver class of this project. Under this class, the main method will create the frame and other necessary environments for the game.
- SnakeView: This class will create a 2D grid which is the game board with the help of Square class.
- Square: Represent each cell of the game board.
- MoveReader: With the help of KeyAdapter class MoveReader class identify which key has been pressed and which valid move has to execute.
- SnakeApp: This class runs the game with the help of some methods they are:
    - internalMove: This method makes a snake move. The idea is it paints the tail coordinate of the snake with the background-color. On the other hand, the immediate background coordinate is painted with the snake’s color.
    - checkCollision: It checks that the head coordinate of a snake is on any coordinates that belong to the snake’s body but not on the head coordinate. When these kinds of situation occurred the game get terminated.
    - resizeSnake: If the head of the snake is on any food then it does increase the length of the snake by one.
    - delayTime: To calculate the snake length, score, set a new color, set food to a new position the game does need some time that’s why here delayTime method has been used.
    - BoardPoint: When a snake reaches a food’s position then the snake’s length gets increased by one and the game generates another random position to set the food. But the problem is, it has to make sure that the food’s position is not on the snake’s body.
#### Online Resources used:
- Reference:
    - [How to Write a Key Listener](https://docs.oracle.com/javase/tutorial/uiswing/events/keylistener.html)
    - [Java: The Complete Reference, Eleventh Edition, 11th Edition](https://www.oreilly.com/library/view/java-the-complete/9781260440249/)
    - [Java Threads Tutorial](https://youtu.be/TCd8QIS-2KI)
- Stackoverflow or Github links:
    - [N-Tuple Bandit Evolutionary Algorithm (NTBEA)](https://github.com/SimonLucas/ntbea/blob/master/java/src/utilities/JEasyFrame.java)
#### Future Enhancements:
- [ ] Will be upgraded into a 3D version.
- [ ] More than one food will be given at the same time.
- [ ] Different kinds of obstacles, boots, and extra lives will be given depending on the snake’s position on the board.
