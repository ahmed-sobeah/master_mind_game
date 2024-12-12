package com.example.fx_test;

import com.example.fx_test.core.FontManger;
import com.example.fx_test.core.StringManger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.stage.Stage;

import java.io.File;
import java.net.URL;


public class HelloApplication extends Application {
    @Override
    public void start(Stage stage)  {
try {
    URL url = new File("C:\\intelj\\Intellij\\master_mind_game\\src\\main\\java\\com\\example\\fx_test\\Scene1.fxml").toURI().toURL();
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