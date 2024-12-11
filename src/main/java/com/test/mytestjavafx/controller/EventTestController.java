package com.test.mytestjavafx.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.shape.Circle;

public class EventTestController {

    @FXML
    private Circle myCircle;
    private double x;
    private double y;

    public void up(ActionEvent e){
        myCircle.setCenterY(y-=20);
//        System.out.println("UP");
    }
    public void right(ActionEvent e){
        myCircle.setCenterX(x+=20);
//        System.out.println("RIGHT");
    }
    public void down(ActionEvent e){
        myCircle.setCenterY(y+=20);
//        System.out.println("DOWN");
    }
    public void left(ActionEvent e){
        myCircle.setCenterX(x-=20);
//        System.out.println("LEFT");
    }
}
