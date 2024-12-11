package com.test.mytestjavafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        try{
//            FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("event-test.fxml"));
            Parent root = FXMLLoader.load(getClass().getResource("view/ManageStudentScene.fxml"));
//            Parent root = fxmlLoader.load();
            Scene scene = new Scene(root);

            Image icon = new Image("GermLogo.png");
            stage.getIcons().add(icon);
            stage.setTitle("Hello!!!!");
            stage.setWidth(1280);
            stage.setHeight(720);
            stage.setResizable(false);
            stage.setScene(scene);
            stage.show();
        }   catch (Exception e){
            e.printStackTrace();
        }

    }
    public static void main(String[] args) {
        launch();
    }
}