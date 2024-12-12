package com.example.fx_test;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;

import java.net.URL;
import java.util.Arrays;
import java.util.List;


public class HelloController {
 private Stage stage;
 private Scene scene;
 private Parent root;
    private Object Arrays;

    public void switchToScene1(ActionEvent event) throws IOException {
     URL url = new File("D:\\WORK\\IJ\\master_mind_game\\src\\main\\java\\com\\example\\fx_test\\Scene1.fxml").toURI().toURL();
     Parent root = FXMLLoader.load(url);
     stage = (Stage)((Node)event.getSource()).getScene().getWindow();
     scene = new Scene(root);
     stage.setScene(scene);
     stage.show();
 }
 public void switchToScene2(ActionEvent event)throws IOException{
     URL url = new File("D:\\WORK\\IJ\\master_mind_game\\src\\main\\java\\com\\example\\fx_test\\Scene2.fxml").toURI().toURL();
     Parent root = FXMLLoader.load(url);
     stage = (Stage)((Node)event.getSource()).getScene().getWindow();
     scene = new Scene(root);
     stage.setScene(scene);
     stage.show();
 }
 public void switchToEasyLevel(ActionEvent event)throws IOException{
     URL url = new File("D:\\WORK\\IJ\\master_mind_game\\src\\main\\java\\com\\example\\fx_test\\easy_level.fxml").toURI().toURL();
     Parent root = FXMLLoader.load(url);
     stage = (Stage)((Node)event.getSource()).getScene().getWindow();
     scene = new Scene(root);
     stage.setScene(scene);
     stage.show();
 }
 // easy level
//hard level


     private static final int ColorLength = 6;
     private static final int Attempts = 3;



}