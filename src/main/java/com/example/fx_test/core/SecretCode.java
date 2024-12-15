package com.example.fx_test.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class SecretCode {
   public  ArrayList<String> secretCodeForEasy=new ArrayList<String>(Arrays.asList("-fx-background-color: red;","-fx-background-color: blue;","-fx-background-color: green;","-fx-background-color: Yellow;" )); ;
   public  ArrayList<String> secretCodeForNormal=new ArrayList<String>(Arrays.asList("-fx-background-color: red;","-fx-background-color: blue;","-fx-background-color: green;","-fx-background-color: Yellow;","-fx-background-color: purple;" )); ;
   public  ArrayList<String> secretCodeForHard=new ArrayList<String>(Arrays.asList("-fx-background-color: red;","-fx-background-color: blue;","-fx-background-color: green;","-fx-background-color: Yellow;","-fx-background-color: purple;","-fx-background-color: brown;" )); ;
   public ArrayList<String> secretCode=new ArrayList<String>(Arrays.asList()); ;
public void createSecretCodeForEasy(){
    Random rndm = new Random();
    if (secretCode.isEmpty()) {
        for (int i = 0; i < 4; i++) {
            int rndmIndx = rndm.nextInt(secretCodeForEasy.size());
            String rndmElem = secretCodeForEasy.get(rndmIndx);
            secretCode.add(rndmElem);

        }
    }
    System.out.println(this.secretCode);

}
public void createSecretCodeForNormal(){
    Random rndm = new Random();
    if (secretCode.isEmpty()) {
        for (int i = 0; i < 4; i++) {
            int rndmIndx = rndm.nextInt(secretCodeForNormal.size());
            String rndmElem = secretCodeForNormal.get(rndmIndx);
            secretCode.add(rndmElem);

        }
    }
    System.out.println(this.secretCode);

}
public void createSecretCodeForHard(){
    Random rndm = new Random();
    if (secretCode.isEmpty()) {
        for (int i = 0; i < 4; i++) {
            int rndmIndx = rndm.nextInt(secretCodeForHard.size());
            String rndmElem = secretCodeForHard.get(rndmIndx);
            secretCode.add(rndmElem);

        }
    }
    System.out.println(this.secretCode);

}
public ArrayList<String> getSecretCode(){
    return this.secretCode;
}
}
