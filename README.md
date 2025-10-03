# JoKenPo

A simple **Rock-Paper-Scissors** (JoKenPo) game built in Java — a fun little project for practicing game logic and app structure.

## Table of Contents
- [About](#about)
- [Features](#features)
- [Tech Stack](#tech-stack)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation & Running](#installation--running)
- [Usage](#usage)
- [Project Structure](#project-structure)
- [Contact](#contact)

## About
This project implements the classic Rock-Paper-Scissors (JoKenPo) game. Players can choose their move, compare with the computer’s move, and see who wins each round. It's a small but illustrative project to show program logic, decision branching, and user interaction.

## Features
- Play Rock, Paper, or Scissors against the computer  
- Simple game logic (win / lose / tie)  
- Random computer move generation  
- Basic console input/output  
- Can be extended with more features (score tracking, rounds, better UI)

## Tech Stack
| Layer | Technology / Tool |
|---|---|
| Language | Java |
| Build System | Gradle (Kotlin DSL) |
| IDE | IntelliJ IDEA (recommended) |

## Getting Started

### Prerequisites
- Java JDK (8, 11, or later)  
- Gradle (or use the included Gradle Wrapper)  
- (Optional) IntelliJ IDEA, Eclipse, or VS Code with Java support  

### Installation & Running

1. **Clone the repository**
    ```bash
    git clone https://github.com/RutayisireLucien/JoKenPo.git
    cd JoKenPo
    ```

2. **Build the project**
    ```bash
    ./gradlew build
    ```

3. **Run the app**
    ```bash
    ./gradlew run
    ```

## Usage
- Run the app and choose **Rock**, **Paper**, or **Scissors**.  
- The computer makes a random choice.  
- The winner is determined and displayed.  
- Repeat to play multiple rounds.

## Project Structure
```text
JoKenPo/
├── .idea/                   # IDE-specific settings
├── app/                     # Main application source code
│   └── ... (classes, logic)
├── build.gradle.kts         # Gradle build script
├── settings.gradle.kts
├── gradle.properties
├── gradlew
├── gradlew.bat
└── .gitignore
```

## Contact
Author: Rutayisire Lucien

GitHub: [RutayisireLucien](https://github.com/RutayisireLucien)
