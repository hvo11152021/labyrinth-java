# Maze Game - Java

A simple Java-based maze game created using **Swing** and **AWT**.  
Players select a character and navigate through a grid-based maze, avoiding walls and aiming for the exit tile.

## Table of Contents

- [Project Overview](#project-overview)  
- [Features](#features)  
- [How It Works](#how-it-works)  
- [Support](#support)  
- [Contributing](#contributing)  

## Project Overview

This project simulates a **maze navigation game** where the player controls a character using the **WASD keys**.  
The maze is grid-based, with walls, floors, and an exit tile.  
The project was designed as part of a **high school programming project** to demonstrate object-oriented design and event-driven programming in Java.

## Features

- **Character selection**: Choose from multiple character sprites (white, orange, blue, green).  
- **Tile-based map system**: Walls, floors, and exit tiles are loaded dynamically from `Map.java`.  
- **Keyboard controls**: Move the character with `W`, `A`, `S`, `D`.  
- **Win condition**: Displays a pop-up message when the player reaches the exit.  
- **Modular structure**: Organized into classes:  
  - `MainMenu.java` (menu UI)  
  - `Map.java` (maze layout and tile images)  
  - `Character.java` (player entity and movement logic)  
  - `Maze.java` + `MyPanel.java` (game loop, rendering, and input handling)  

## How It Works

- **Map.java**  
  Contains the maze layout stored in a 2D array of strings (`w` for wall, `f` for floor, `e` for exit).  
  Loads tile images (`floor.png`, `wall.png`, `exit.png`) from the resources folder.

- **Character.java**  
  Initializes the character’s starting position at the top-left corner of the maze.  
  The `move(dx, dy)` method updates the character’s grid coordinates when valid moves are made.

- **Maze.java & MyPanel.java**  
  Responsible for drawing the maze, character, and handling **key input**.  
  When the character reaches the exit (`e` tile), a **“Congratulations!”** dialog appears and returns to the main menu.

- **MainMenu.java**  
  Provides the entry point of the game.  
  Players select their character from a dropdown and start the maze.

## Support

If you find a bug or have suggestions, please [open an issue](https://github.com/hvo11152021/labyrinth-java/issues/new).

## Contributing

Please contribute using [GitHub Flow](https://guides.github.com/introduction/flow/).  
Create a branch, add commits, and [open a pull request](https://github.com/hvo11152021/labyrinth-java/compare/).
