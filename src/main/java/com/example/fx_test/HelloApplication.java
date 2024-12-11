package com.example.fx_test;

import com.example.fx_test.core.FontManger;
import com.example.fx_test.core.StringManger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Reflection;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import javafx.css.CssParser;

import javax.swing.*;
import java.io.IOException;

public class HelloApplication extends Application {
    int counter=0;
    boolean isBlack=true;
    @Override
    public void start(Stage stage) throws IOException {

        StackPane root = new StackPane();
        root.setBackground(new Background(new BackgroundFill(Color.GREY,null,null)));
        Scene scene = new Scene(root,800,600);
        Text gameTitle = new Text(StringManger.gameTitle);
        gameTitle.setFill(isBlack? Color.BLACK:Color.DARKBLUE);

        gameTitle.setFont(FontManger.titleFont);
        gameTitle.setTextAlignment(TextAlignment.CENTER);
        StackPane.setAlignment(gameTitle,Pos.TOP_CENTER);
        Button startGameBtn = new Button(StringManger.startGame);

        root.getChildren().addAll(gameTitle,startGameBtn);
        stage.setTitle(StringManger.gameTitle);
        stage.setScene(scene);
        stage.show();


    }



    public static void main(String[] args) {
        launch();
    }
}