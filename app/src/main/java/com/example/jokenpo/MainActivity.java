package com.example.jokenpo;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Button;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private static final int WINNING_SCORE = 5;

    private TextView resultText;
    private TextView scoreText;
    private ImageButton rockButton, paperButton, scissorsButton;
    private Button resetButton;

    private int playerScore = 0;
    private int cpuScore = 0;
    private boolean gameOver = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        rockButton = findViewById(R.id.imageButton);
        paperButton = findViewById(R.id.imageButton2);
        scissorsButton = findViewById(R.id.imageButton3);
        resultText = findViewById(R.id.textView);
        scoreText  = findViewById(R.id.scoreText);
        resetButton = findViewById(R.id.resetButton);

        View.OnClickListener choiceClickListener = new View.OnClickListener() {
            @Override public void onClick(View v) {
                if (gameOver) return;

                Choices userChoice = null;
                int id = v.getId();
                if (id == R.id.imageButton) {
                    userChoice = Choices.ROCK;
                } else if (id == R.id.imageButton2) {
                    userChoice = Choices.PAPER;
                } else if (id == R.id.imageButton3) {
                    userChoice = Choices.SCISSORS;
                }

                if (userChoice != null) handleUserChoice(userChoice);
            }
        };

        rockButton.setOnClickListener(choiceClickListener);
        paperButton.setOnClickListener(choiceClickListener);
        scissorsButton.setOnClickListener(choiceClickListener);

        resetButton.setOnClickListener(v -> resetGame());

        updateScoreboard();
        resultText.setText("Make your choice!");

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    private void handleUserChoice(Choices userChoice) {
        Choices[] values = Choices.values();
        int randomIndex = new java.util.Random().nextInt(values.length);
        Choices computerChoice = values[randomIndex];

        String roundResultText;
        if (userChoice == computerChoice) {
            roundResultText = "Draw!";
        } else if (
                (userChoice == Choices.ROCK && computerChoice == Choices.SCISSORS) ||
                        (userChoice == Choices.PAPER && computerChoice == Choices.ROCK) ||
                        (userChoice == Choices.SCISSORS && computerChoice == Choices.PAPER)
        ) {
            roundResultText = "You Win!";
            playerScore++;
        } else {
            roundResultText = "You Lose!";
            cpuScore++;
        }

        resultText.setText(
                "You chose: " + userChoice +
                        "\nComputer chose: " + computerChoice +
                        "\n" + roundResultText
        );

        updateScoreboard();


        if (playerScore >= WINNING_SCORE || cpuScore >= WINNING_SCORE) {
            gameOver = true;
            String winnerMsg = (playerScore > cpuScore) ? "🎉 You win the match!" : "🤖 CPU wins the match!";
            resultText.setText(resultText.getText() + "\n" + winnerMsg);
            setChoiceButtonsEnabled(false);
        }
    }

    private void updateScoreboard() {
        scoreText.setText("You: " + playerScore + "  —  CPU: " + cpuScore +
                "  (first to " + WINNING_SCORE + ")");
    }

    private void setChoiceButtonsEnabled(boolean enabled) {
        rockButton.setEnabled(enabled);
        paperButton.setEnabled(enabled);
        scissorsButton.setEnabled(enabled);
        rockButton.setAlpha(enabled ? 1f : 0.4f);
        paperButton.setAlpha(enabled ? 1f : 0.4f);
        scissorsButton.setAlpha(enabled ? 1f : 0.4f);
    }

    private void resetGame() {
        playerScore = 0;
        cpuScore = 0;
        gameOver = false;
        updateScoreboard();
        resultText.setText("Game reset. Make your choice!");
        setChoiceButtonsEnabled(true);
    }
}