package com.test.mytestjavafx.controller;

import com.test.mytestjavafx.HelloApplication;
import com.test.mytestjavafx.model.Accounts;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.sql.ResultSet;

public class LoginController extends HelloApplication
{
    Image myImage = new Image("LoginImage.png");
    @FXML
    ImageView imgLogin = new ImageView(myImage);

    public void start(Stage stage){
        imgLogin.setImage(myImage);
    }

    @FXML
    private TextField txtEmail;
    @FXML
    private TextField txtPassword;

    @FXML
    public void btnLoginSubmit(ActionEvent event)
    {
        String email = txtEmail.getText();
        String password = txtPassword.getText();
        int check = 0;

        Accounts accounts = new Accounts();
        ResultSet login = accounts.login(email, password);

        try {
            while (login.next())
            {
                check++;
                if (check > 0)
                {
                    String username = login.getString("name");


                    FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("view/index.fxml"));
                    Parent root = fxmlLoader.load();

                    IndexTestController indexTestController = fxmlLoader.getController();
                    indexTestController.displayName(username);

                    Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                    Scene indexScene = new Scene(root, 1280, 720);
                    stage.setScene(indexScene);
                    stage.show();
                }
                return;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
