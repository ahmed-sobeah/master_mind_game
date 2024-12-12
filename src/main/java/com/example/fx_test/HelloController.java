package com.example.fx_test;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import javafx.scene.control.Button;


public class HelloController {
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void switchToScene1(ActionEvent event) throws IOException {
        URL url = new File("C:\\intelj\\Intellij\\master_mind_game\\src\\main\\java\\com\\example\\fx_test\\Scene1.fxml").toURI().toURL();
        Parent root = FXMLLoader.load(url);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToScene2(ActionEvent event) throws IOException {
        URL url = new File("C:\\intelj\\Intellij\\master_mind_game\\src\\main\\java\\com\\example\\fx_test\\Scene2.fxml").toURI().toURL();
        Parent root = FXMLLoader.load(url);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToEasyLevel(ActionEvent event) throws IOException {
        URL url = new File("C:\\intelj\\Intellij\\master_mind_game\\src\\main\\java\\com\\example\\fx_test\\easy_level.fxml").toURI().toURL();
        Parent root = FXMLLoader.load(url);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    // easy level
    public class EasyLevelController {
        @FXML
        private Button redbtn, greenbtn, bluebtn, yellowbtn;
        @FXML
        private Button silverbtn1, silverbtn2, silverbtn3, silverbtn4;

        private Button activesilverbtn;
        private void setSilverBtn(Button silverButton) {
            silverButton.setOnAction(event -> {
                activesilverbtn = silverButton;
            });
        }

        private void setColorbtn(Button colorButton, String color) {
            colorButton.setOnAction((ActionEvent event) -> {
                if (activesilverbtn != null) {
                    activesilverbtn.setStyle("-fx-background-color: " + color + ";");
                }
            });
        }

    }
}

