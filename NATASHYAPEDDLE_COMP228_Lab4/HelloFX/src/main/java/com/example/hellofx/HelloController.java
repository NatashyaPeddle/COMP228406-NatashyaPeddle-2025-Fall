package com.example.hellofx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import java.util.List;
import java.util.Random;

public class HelloController {
    @FXML
    private Label welcomeText;

    private final List<String> greetings = List.of(
            "Hello world",
            "Welcome",
            "Nice to meet you"
    );

    private final Random random = new Random();

    @FXML
    protected void onHelloButtonClick() {
        String randomGreeting = greetings.get(random.nextInt(greetings.size()));
        welcomeText.setText(randomGreeting);
    }
}
