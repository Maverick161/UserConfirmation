package com.example.userconfirmation;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Main extends Application {


    public void start (Stage primaryStage) throws IOException {

        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/userconfirmation/uig.fxml")));
        //Parent root = FXMLLoader.load(getClass().getResource("C:/Users/ffuch/OneDrive/Documents/TEC 2022 Semestre II/Algoritmos y Datos/UserConfirmation/src/main/resources/com/example/userconfirmation/uig.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();

    }





    public static void main(String[] args) {
        launch(args);
    }
}