package com.argonnet;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


/**
 * Application to solve graph problem
 */
//TODO - Argon - 10.06.2016 : EVENTUALLY - Use the user number in the algorythm and do the minus 1 in the GraphMatrix class.

public class GraphiXApp extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("View/MainView.fxml"));
        primaryStage.setTitle("GraphiX");
        primaryStage.setScene(new Scene(root, 1000, 800));
        primaryStage.show();
    }


}