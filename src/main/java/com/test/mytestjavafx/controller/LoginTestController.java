package com.test.mytestjavafx.controller;

import com.test.mytestjavafx.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginTestController {

    @FXML
    TextField nameTextField;

    @FXML
    public void login(ActionEvent event) throws IOException {

        String username = nameTextField.getText();

        FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("view/index.fxml"));
        Parent root = loader.load();
        IndexTestController indexTestController = loader.getController();
        indexTestController.displayName(username);
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}
