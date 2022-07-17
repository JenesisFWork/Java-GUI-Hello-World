/*
    GUI Project:   Hello World - Using JavaFX Library

    Programmer: Jenesis Fabia
    Date: 4/19/2021
    Class: CIS084 Java
    
    First GUI Project
*/


package com.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.application.Platform;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.text.Font;

public class JavaHelloWorldFX extends Application {
    public static void main(String[] args) {
        launch(args); // Run this Application.
    }
    public void start(Stage stage) {
        // Create a Label that is displayed in the middle of the window
        Label message = new Label("First FX Application!");
        message.setFont(new Font(40));
        
        // Create buttons that can be clicked which change the message Label
        Button helloButton = new Button("Say Hello");
        // helloButton.setOnAction(e -> message.setText("Hello World!"));
        // change it from saying "Hello World!" to "Hello Jenesis!"
        helloButton.setOnAction(e -> message.setText("Hello Jenesis!"));

        // This is the button for the "success" button
        Button successButton = new Button("Success");
        successButton.setOnAction(e -> message.setText("Success"));
        
        Button goodbyeButton = new Button("Say Goodbye");
        // goodbyeButton.setOnAction(e -> message.setText("Goodbye!!"));
        // change it from "Goodbye!!" to "Goodbye Jenesis!!"
        goodbyeButton.setOnAction(e -> message.setText("Goodbye Jenesis!!"));
        
        Button quitButton = new Button("Quit");
        quitButton.setOnAction(e -> Platform.exit());
        
        // Create an HBox to hold the buttons
        // Added a success button
        HBox buttonBar = new HBox(20, helloButton, successButton, goodbyeButton, quitButton);
        buttonBar.setAlignment(Pos.CENTER);
        
        // Create a BorderPane named   root  
        //    to hold the message Label in center and the Buttons on the bottom
        BorderPane root = new BorderPane();
        root.setCenter(message);
        root.setBottom(buttonBar);
        
        // Create the displayable scene to hold root, set the title and show it
        Scene scene = new Scene(root, 450, 200);
        stage.setScene(scene);
        stage.setTitle("JavaFX Hello World");
        stage.show();
    } // end start();

} // end class HelloWorldFX
