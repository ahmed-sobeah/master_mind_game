package com.example.fx_test;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.net.URL;
import java.util.*;

import static java.util.Collections.shuffle;


public class HelloController {
    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    private Button redbtn, greenbtn, bluebtn, yellowbtn;
    List<Button>colorButtonList = Arrays.asList(redbtn,greenbtn,bluebtn,yellowbtn);
    @FXML
    private Button silverbtn1, silverbtn2, silverbtn3, silverbtn4;
    ArrayList<Button> silverButtonList =new ArrayList<>( Arrays.asList(silverbtn1, silverbtn2, silverbtn3, silverbtn4));
    private Button activesilverbtn;
    private String style;
    private boolean for1=false;
    private boolean for2=false;
    private boolean for3=false;
    private boolean for4=false;


    public void switchToScene1(ActionEvent event) throws IOException {
        URL url = new File("\\Users\\Ahmed Sobeah\\dev\\fx_test\\src\\main\\java\\com\\example\\fx_test\\Scene1.fxml").toURI().toURL();
         root = FXMLLoader.load(url);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToScene2(ActionEvent event) throws IOException {
        URL url = new File("\\Users\\Ahmed Sobeah\\dev\\fx_test\\src\\main\\java\\com\\example\\fx_test\\Scene2.fxml").toURI().toURL();
        root = FXMLLoader.load(url);
        stage  = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToEasyLevel(ActionEvent event) throws IOException {
        URL url = new File("\\Users\\Ahmed Sobeah\\dev\\fx_test\\src\\main\\java\\com\\example\\fx_test\\easy_level.fxml").toURI().toURL();
        root = FXMLLoader.load(url);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    // easy level




//    public List<Color> setCode(){
//        List<> Collections.shuffle(colorButtonList);
//        return
//    }

    public void setSilverBtn() {
            if(for1 == false){
               silverbtn1.setStyle(style);
               for1=true;
            }else  if (for2 == false){
                silverbtn2.setStyle(style);
                for2=true;
            }else if (for3 == false){
                silverbtn3.setStyle(style);
                for3=true;
            }else if (for4 == false){
                silverbtn4.setStyle(style);
                for4=true;
            }else {
                return;
            }
        }

        private void setColorbtn(Button colorButton, String color) {
            colorButton.setOnAction((ActionEvent event) -> {
                if (activesilverbtn != null) {
                    activesilverbtn.setStyle("-fx-background-color: " + color + ";");
                }
            });
        }
        public  void  selectColorRed() {
            style = redbtn.getStyle();
            setSilverBtn();


        }
        public  void  selectColorGreen() {
            style = greenbtn.getStyle();
            setSilverBtn();


        }
        public  void  selectColorBlue() {
            style = bluebtn.getStyle();
            setSilverBtn();


        }
        public  void  selectColorYellow() {
            style = yellowbtn.getStyle();
            setSilverBtn();


        }


}