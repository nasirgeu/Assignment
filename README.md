---

# Magical Arena

Magical Arena is an engaging turn-based battle game implemented in Java, where players face off against each other until one emerges victorious by depleting their opponent's health points.

## Problem Statement
Design a program to simulate matches in the Magical Arena between two players. Each player is characterized by their health, strength, and attack attributes, all positive integers. The simulation should determine the winner of the match based on the rules described above. The program should take input for the attributes of both players and simulate the match until one player's health drops to 0. Finally, it should output the winner of the match.

## Features

- **Player Attributes**: Players have attributes such as health, strength, and attack, which determine their effectiveness in combat.
- **Turn-Based Combat**: Engage in thrilling turn-based battles where strategy and luck play crucial roles in determining the outcome.
- **Dice Rolls**: Attacks and defenses are resolved using dice rolls, adding an element of unpredictability to each encounter.
- **Dynamic Damage Calculation**: Damage inflicted and defended is calculated dynamically based on player attributes and dice rolls.
- **Game End Conditions**: The game ends when one player's health reaches 0, declaring the other player as the winner.

## Solution & Approach

### Class Diagram

![Class Diagram](https://github.com/bhartik021/swiggy-assignment/assets/75694208/f378c177-15ca-497a-b548-0c9af182bb81)

### Project Structure

The project structure is organized as follows:

```
swiggyAssignment
├── out
│   └── production
│       └── swiggyAssignment
│           └── main
│               └── java
│                   └── com
│                       └── swiggy
│                           └── magicalarena
│                               ├── classes
│                               │   ├── Audience.class
│                               │   ├── BattleContext.class
│                               │   ├── BattleMain.class
│                               │   └── Wizard.class
│                               ├── enums
│                               │   └── GameStatus.class
│                               └── interfaces
│                               |   ├── GameObserver.class
│                               |   └── TeamMember.class
|                               └──  Main.java 
├── src
│   ├── main
│   │   └── java
│   │       └── com
│   │           └── swiggy
│   │               └── magicalarena
│   │                   ├── classes
│   │                   │   ├── Audience.java
│   │                   │   ├── BattleContext.java
│   │                   │   ├── BattleMain.java
│   │                   │   └── Wizard.java
│   │                   ├── enums
│   │                   │   └── GameStatus.java
│   │                   └── interfaces
│   │                   |   ├── GameObserver.java
│   │                   |   └── TeamMember.java
|   |                   └──  Main.java 
│   └── test
│       └── java
│           └── com
│               └── swiggy
│                   └── magicalarena
│                       └── testing
│                           ├── MainTesting.java
│                           └── PlayerTest.java
└── swiggyAssignment.iml

```

- `src/main/java`: Contains the main source code files.
   - `com.swiggy.magicalarena.classes`: Includes Java classes for the game logic.
   - `com.swiggy.magicalarena.enums`: Defines enums for game status.
   - `com.swiggy.magicalarena.interfaces`: Contains interfaces for game observers and team members.
- `src/test/java`: Includes test source code files for unit testing.
- `swiggyAssignment.iml`: Information about the project module.

## Getting Started

Follow these instructions to get a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

- Java Development Kit (JDK)
- JDK version 22.0.1
- IntelliJ IDEA
- Junit4

### Installation

1. Clone the repository to your local machine:

   ```
   git clone https://github.com/nasirgeu/swiggyMagicalArenaAssignment.git
   ```

2. Navigate to the project directory:

   ```
   cd swiggyMagicalArenaAssignment
   ```

3. Build the project using Maven:

   ```
   mvn clean install
   ```

### Usage

To run the Magical Arena game:

1. Run the `Main.java` file located in `src/main/java/com/swiggy/magicalarena/classes` as a Java application.

2. Follow the on-screen instructions to initialize the players and start the game.

## How to Play

1. Player Initialization: Two players are created with initial attributes (health, strength, and attack).
2. Turn-Based Combat: Players take turns attacking and defending.
3. Dice Rolls: Each player rolls a 6-sided die for attack and defense.
4. Damage Calculation: Damage is calculated based on the dice rolls and player attributes.
5. Game End: The game continues until one player's health reaches 0.

## How to Run Unit Tests

1. Navigate to the test directory:

   ```
   cd src/test/java/com/swiggy/magicalarena/testing
   ```

2. Run the `PlayerTest.java` and `MainTesting.java` files as JUnit test cases to test the functionality of player classes and game mechanics.


## Acknowledgments

- Special thanks to the Swiggy team for providing the assignment and opportunity to work on this project.
---
