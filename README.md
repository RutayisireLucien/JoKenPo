JoKenPo

A simple Rock-Paper-Scissors (JoKenPo) game built in Java (or Kotlin / using Gradle) — a fun little project for practicing game logic and app structure.

Table of Contents

About

Features

Tech Stack

Getting Started

Prerequisites

Installation & Running

Usage

Project Structure

Contributing

License

Contact

About

This project implements the classic Rock-Paper-Scissors (JoKenPo) game. Players can choose their move, compare with the computer’s move, and see who wins each round. It's a small but illustrative project to show program logic, decision branching, and user interaction.

Features

Play Rock, Paper, or Scissors against the computer

Simple game logic (win / lose / tie)

Random computer move generation

Basic console (or GUI) input/output

Can be extended with more features (score tracking, rounds, better UI)

Tech Stack
Layer	Technology / Tool
Language	Java (or Kotlin)
Build System	Gradle (Kotlin DSL)
IDE settings	.idea folder (for JetBrains IDEs)
Getting Started
Prerequisites

Java JDK (version 8, 11, or later)

Gradle (or use the included Gradle Wrapper)

(Optional) An IDE like IntelliJ IDEA, Eclipse, or VS Code with Java support

Installation & Running
```bash
git clone https://github.com/username/project.git
cd project
npm install
npm run dev
```

Usage

When you run the app, you'll be prompted (or see a UI) to pick Rock, Paper, or Scissors.

The computer randomly picks one too.

The choices are compared, and the result (win / lose / tie) is shown.

You can play multiple rounds if you build that functionality in.

Project Structure

Here’s an outline of the project folder layout:
```bash
JoKenPo/
├── .idea/                      # IDE-specific settings (can be ignored or .gitignored)
├── app/                        # Main application source code
│   └── <packages, classes>     # e.g. game logic, main class, utilities
├── build.gradle.kts            # Gradle build script
├── settings.gradle.kts
├── gradle.properties
├── gradlew
├── gradlew.bat
└── .gitignore
```

Contact

Author: Rutayisire Lucien

GitHub: https://github.com/RutayisireLucien
