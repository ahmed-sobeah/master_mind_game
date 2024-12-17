package com.example.fx_test;
import javafx.application.Application;

import javafx.fxml.FXMLLoader;

import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.stage.Stage;

import java.io.File;
import java.net.URL;


public class HelloApplication extends Application {
    @Override
    public void start(Stage stage)  {
try {

    FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Scene1.fxml"));
    Parent root = fxmlLoader.load();
    Scene scene = new Scene(root);
    stage.setScene(scene);
    stage.show();

}catch (Exception e){
    e.printStackTrace();
}
    }

    public static void main(String[] args) {
        launch();
    }
}