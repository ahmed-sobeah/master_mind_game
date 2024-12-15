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
    //please make sure to copy the file path reference     here
    URL url = new File("C:\\Users\\Ahmed Sobeah\\dev\\fx_test\\src\\main\\java\\com\\example\\fx_test\\Scene1.fxml").toURI().toURL();
    Parent root = FXMLLoader.load(url);
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