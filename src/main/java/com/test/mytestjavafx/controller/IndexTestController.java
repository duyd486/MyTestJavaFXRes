package com.test.mytestjavafx.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class IndexTestController {

    @FXML
    Label nameLabel;

    public void displayName(String username){
        nameLabel.setText("Hello: " + username);
    }
}
