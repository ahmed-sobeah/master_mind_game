package com.example.fx_test;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.scene.control.Button;
=======

import javafx.scene.paint.Color;
import javafx.stage.Stage;
import org.controlsfx.control.tableview2.filter.filtereditor.SouthFilter;


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
    private Button redbtn, greenbtn, bluebtn, yellowbtn, orangebtn, purplebtn, brownbtn;
    List<Button> colorButtonList = Arrays.asList(redbtn, greenbtn, bluebtn, yellowbtn, orangebtn, purplebtn, brownbtn);
    @FXML
    private Button silverbtn1, silverbtn2, silverbtn3, silverbtn4;
    ArrayList<Button> silverButtonList = new ArrayList<>(Arrays.asList(silverbtn1, silverbtn2, silverbtn3, silverbtn4));
    ArrayList<String> guessedCode = new ArrayList<String>();                                                                                                                                              //mohamed ahmed                     mohamed ahmed
    ArrayList<String> secretCode = new ArrayList<String>(Arrays.asList("-fx-background-color: red;", "-fx-background-color: blue;", "-fx-background-color: green;", "-fx-background-color: Yellow;", "-fx-background-color: orange;", "-fx-background-color: purple;", "-fx-background-color: brown;"));
    private Button activesilverbtn;
    private String style;
    private boolean for1 = false;
    private boolean for2 = false;
    private boolean for3 = false;
    private boolean for4 = false;


    public void switchToScene1(ActionEvent event) throws IOException {
        URL url = new File("D:\\WORK\\IJ\\master_mind_game\\src\\main\\java\\com\\example\\fx_test\\Scene1.fxml").toURI().toURL();
        root = FXMLLoader.load(url);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToScene2(ActionEvent event) throws IOException {
        URL url = new File("D:\\WORK\\IJ\\master_mind_game\\src\\main\\java\\com\\example\\fx_test\\Scene2.fxml").toURI().toURL();
        root = FXMLLoader.load(url);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToEasyLevel(ActionEvent event) throws IOException {
        createSecretCode(secretCode);
        URL url = new File("D:\\WORK\\IJ\\master_mind_game\\src\\main\\java\\com\\example\\fx_test\\easy_level.fxml").toURI().toURL();
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
    public void createSecretCode(ArrayList<String> secretCode) {
        Collections.shuffle(secretCode);
        System.out.println(secretCode);
    }

    public void setSilverBtn() {
        //Ahmed Sobeah
        if (for1 == false) {
            silverbtn1.setStyle(style);
            for1 = true;
            guessedCode.add(0, silverbtn1.getStyle());
        } else if (for2 == false) {
            silverbtn2.setStyle(style);
            for2 = true;
            guessedCode.add(1, silverbtn2.getStyle());
        } else if (for3 == false) {
            silverbtn3.setStyle(style);
            for3 = true;
            guessedCode.add(2, silverbtn3.getStyle());
        } else if (for4 == false) {
            silverbtn4.setStyle(style);
            for4 = true;
            guessedCode.add(3, silverbtn4.getStyle());
        } else {
            return;
        }
    }

    public void selectColorRed() {
        //Ahmed sobeah

        style = redbtn.getStyle();
        setSilverBtn();

    }

    public void selectColorGreen() {
        //Ahmed sobeah
        style = greenbtn.getStyle();
        setSilverBtn();


    }

    public void selectColorBlue() {
        //Ahmed sobeah
        style = bluebtn.getStyle();
        setSilverBtn();


    }

    public void selectColorYellow() {
        //Ahmed sobeah
        style = yellowbtn.getStyle();
        setSilverBtn();


    }

    public void selectColorOrange() {
        //mohamed ahmed
        style = orangebtn.getStyle();
        setSilverBtn();


    }

    public void selectColorPurple() {
        //mohamed ahmed
        style = purplebtn.getStyle();
        setSilverBtn();


    }

    public void selectColorBrown() {
        //mohamed ahmed
        style = brownbtn.getStyle();
        setSilverBtn();


    }

    public void onClickSubmitButton(ActionEvent event) throws IOException {
        if (guessedCode == secretCode) {
            URL url = new File("D:\\WORK\\IJ\\master_mind_game\\src\\main\\java\\com\\example\\fx_test\\winner.fxml").toURI().toURL();
            root = FXMLLoader.load(url);
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
    }

    /// /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// mohmed ahmed
    public void switchTohardLevel(ActionEvent event) throws IOException {
        createSecretCode(secretCode);
        URL url = new File("D:\\WORK\\IJ\\master_mind_game\\src\\main\\java\\com\\example\\fx_test\\hard_level.fxml").toURI().toURL();
        root = FXMLLoader.load(url);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


     




}