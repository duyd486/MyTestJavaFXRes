package com.test.mytestjavafx.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloTestController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}