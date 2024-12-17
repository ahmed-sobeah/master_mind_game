package com.example.fx_test;

import com.example.fx_test.core.SecretCode;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import javafx.stage.Stage;



import java.io.File;
import java.io.IOException;

import java.net.URL;
import java.util.*;




public class HelloController {
    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    private Button redbtn, greenbtn, bluebtn, yellowbtn ,purplebtn,brownbtn;
    @FXML
    private Button silverbtn1, silverbtn2, silverbtn3, silverbtn4;
    @FXML
    private Button box1,box2,box3,box4;
    ArrayList<String> guessedCode = new ArrayList<String>();
   SecretCode secretCode= new SecretCode();
    private String style;
    private boolean for1=false;
    private boolean for2=false;
    private boolean for3=false;
    private boolean for4=false;
    @FXML
    private Label attemptsleft,yourattempts;
    private int leftattemptsE= 9;
    private int leftattemptsN= 4;
    private int leftattemptsH= 2;
    private int yattemptsE= 1;
    private int yattemptsN= 1;
    private int yattemptsH= 1;





    public void switchToScene1(ActionEvent event) throws IOException {
        //please make sure to copy the file path reference     here
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Scene1.fxml"));
        root = fxmlLoader.load();
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToScene2(ActionEvent event) throws IOException {
        //please make sure to copy the file path reference     here
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Scene2.fxml"));
        root = fxmlLoader.load();
        stage  = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToEasyLevel(ActionEvent event) throws IOException {
        //please make sure to copy the file path reference     here
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("easy_level.fxml"));
        root = fxmlLoader.load();
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    // normal level
    public void switchTonormal(ActionEvent event) throws IOException {
        //please make sure to copy the file path reference     here
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("normal.fxml"));
        root = fxmlLoader.load();
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
    public void switchToHard(ActionEvent event) throws IOException {
        //please make sure to copy the file path reference     here
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hard.fxml"));
        root = fxmlLoader.load();
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
    public void setSilverBtn() {
        //Ahmed Sobeah
            if(for1 == false){
               silverbtn1.setStyle(style);
               for1=true;
               guessedCode.add(0,silverbtn1.getStyle());
            }else  if (for2 == false){
                silverbtn2.setStyle(style);
                for2=true;
                guessedCode.add(1,silverbtn2.getStyle());
            }else if (for3 == false){
                silverbtn3.setStyle(style);
                for3=true;
                guessedCode.add(2,silverbtn3.getStyle());
            }else if (for4 == false){
                silverbtn4.setStyle(style);
                for4=true;
                guessedCode.add(3,silverbtn4.getStyle());

            }

            else {
                return;
            }
        }
        public  void  selectColorRed() {
        //Ahmed sobeah
            style = redbtn.getStyle();
            setSilverBtn();
        }
        public  void  selectColorGreen() {
            //Ahmed sobeah
            style = greenbtn.getStyle();
            setSilverBtn();

        }
        public  void  selectColorBlue() {
            //Ahmed sobeah
            style = bluebtn.getStyle();
            setSilverBtn();


        }
        public  void  selectColorYellow() {
            //Ahmed sobeah
            style = yellowbtn.getStyle();
            setSilverBtn();


        }
    public  void  selectColorPurple() {
        //sohilaayman
        style =purplebtn.getStyle();
        setSilverBtn();

    }
    public void selectColorBrown() {
        //mohamed ahmed
        style = brownbtn.getStyle();
        setSilverBtn();


    }
    public void isBlackOrWhite(ArrayList<String> secretCode,ArrayList<String> guessedCode){
         if (Objects.equals(guessedCode.get(0), secretCode.get(0))){
             box1.setStyle("-fx-background-color: BLACK;");
         }else if (secretCode.contains(guessedCode.get(0))){
             box1.setStyle("-fx-background-color: WHITE;");
         }else {
             box1.setStyle("-fx-background-color: SIlVER;");
         }


            if (Objects.equals(guessedCode.get(1), secretCode.get(1))){
                box2.setStyle("-fx-background-color: BLACK;");
            }else if (secretCode.contains(guessedCode.get(1))){
                box2.setStyle("-fx-background-color: WHITE;");
            }else {
                box2.setStyle("-fx-background-color: SIlVER;");
            }


            if (Objects.equals(guessedCode.get(2), secretCode.get(2))){
                box3.setStyle("-fx-background-color: BLACK;");
            }else if (secretCode.contains(guessedCode.get(2))){
                box3.setStyle("-fx-background-color: WHITE;");
            }else {
                box3.setStyle("-fx-background-color: SIlVER;");
            }


            if (Objects.equals(guessedCode.get(3), secretCode.get(3))){
                box4.setStyle("-fx-background-color: BLACK;");
            }else if (secretCode.contains(guessedCode.get(3))){
                box4.setStyle("-fx-background-color: WHITE;");
            }else {
                box4.setStyle("-fx-background-color: SIlVER;");
            }



    }
    public void init(){
        for1=false;
        for2=false;
        for3=false;
        for4=false;
        silverbtn1.setStyle("-fx-background-color: SILVER;");
        silverbtn2.setStyle("-fx-background-color: SILVER;");
        silverbtn3.setStyle("-fx-background-color: SILVER;");
        silverbtn4.setStyle("-fx-background-color: SILVER;");
        guessedCode.clear();


    }
    public void setAttemptsForEasy(){
        String leftAttemptsSt= String.valueOf(leftattemptsE);
        String yourAttemptsSt= String.valueOf(yattemptsE);
        attemptsleft.setText(leftAttemptsSt);
        yourattempts.setText(yourAttemptsSt);
        leftattemptsE--;
        yattemptsE++;
    }
    public void setAttemptsForNormal(){
        String leftAttemptsSt= String.valueOf(leftattemptsN);
        String yourAttemptsSt= String.valueOf(yattemptsN);
        attemptsleft.setText(leftAttemptsSt);
        yourattempts.setText(yourAttemptsSt);
        leftattemptsN--;
        yattemptsN++;
    }
    public void setAttemptsForHard(){
        String leftAttemptsSt= String.valueOf(leftattemptsH);
        String yourAttemptsSt= String.valueOf(yattemptsH);
        attemptsleft.setText(leftAttemptsSt);
        yourattempts.setText(yourAttemptsSt);
        leftattemptsH--;
        yattemptsH++;
    }
    public void ifLoseForEasy(ActionEvent event) throws IOException{
        //please make sure to copy the file path reference     here
        if (leftattemptsE==-1){
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("lose.fxml"));
            root = fxmlLoader.load();
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
    }
    public void ifLoseForNormal(ActionEvent event) throws IOException{
        //please make sure to copy the file path reference     here
        if (leftattemptsN==-1){
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("lose.fxml"));
            root = fxmlLoader.load();
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
    }
    public void ifLoseForHard(ActionEvent event) throws IOException{
        if (leftattemptsH==-1){
            //please make sure to copy the file path reference     here
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("lose.fxml"));
            root = fxmlLoader.load();
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
    }
    public  void  onClickSubmitButtonForEasy(ActionEvent event) throws  IOException{
        setAttemptsForEasy();
        secretCode.createSecretCodeForEasy();
        System.out.println(secretCode.getSecretCode());
        System.out.println(guessedCode);
        isBlackOrWhite(secretCode.getSecretCode(),guessedCode);
        if (guessedCode.equals(secretCode.getSecretCode())){
            //please make sure to copy the file path reference     here
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("winner.fxml"));
            root = fxmlLoader.load();
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }else ifLoseForEasy(event);
        init();


        }
    public  void  onClickSubmitButtonForNormal(ActionEvent event) throws  IOException{
        setAttemptsForNormal();
        secretCode.createSecretCodeForNormal();
        System.out.println(secretCode.getSecretCode());
        System.out.println(guessedCode);
        isBlackOrWhite(secretCode.getSecretCode(),guessedCode);
        if (guessedCode.equals(secretCode.getSecretCode())){
            //please make sure to copy the file path reference     here
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("winner.fxml"));
            root = fxmlLoader.load();
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }else ifLoseForNormal(event);
        init();


        }
    public  void  onClickSubmitButtonForHard(ActionEvent event) throws  IOException{
        setAttemptsForHard();
        secretCode.createSecretCodeForHard();
        System.out.println(secretCode.getSecretCode());
        System.out.println(guessedCode);
        isBlackOrWhite(secretCode.getSecretCode(),guessedCode);
        if (guessedCode.equals(secretCode.getSecretCode())){
            //please make sure to copy the file path reference     here
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("winner.fxml"));
            root = fxmlLoader.load();
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }else ifLoseForHard(event);
        init();


        }


}