package com.example.userconfirmation;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;

public class Main extends Application {

    public void ReadFile(String path, String user, String pass) {
        BufferedReader buff = null;
        String line = "";
        String delimiter = ";";
        try{
            buff = new BufferedReader(new FileReader(path));
            while ((line = buff.readLine()) != null) {
                String[] file = line.split(delimiter);
                System.out.println("user");

                if (file[0].equals(user) && file[1].equals(pass)) ;
                System.out.println("Login Succesfull");
            }
        }
        catch (FileNotFoundException e){
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();

        }
    }
    public void start (Stage primaryStage) throws IOException {

        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/userconfirmation/uig.fxml")));
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();

    }





    public static void main(String[] args) {
        launch(args);
    }
}