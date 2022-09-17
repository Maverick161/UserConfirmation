package com.example.userconfirmation;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class UserController implements Initializable {

    @FXML
    private TextField textUser;
    @FXML
    private PasswordField passwordText;
    @FXML
    private Button loginButton;
    @FXML
    private void eventKey(KeyEvent event){
        Object evt = event.getSource();
        if(evt.equals(textUser)){
            if(event.getCharacter().equals(" ")){
                event.consume();
            }
        } else if (evt.equals(passwordText)) {
            if(event.getCharacter().equals(" ")){
                event.consume();
            }
        }
    }
    @FXML
    private void eventAction(ActionEvent event){
        Object evt = event.getSource();
        if(evt.equals(loginButton)) {
            if (!textUser.getText().isEmpty() && !passwordText.getText().isEmpty()) {
                String user = textUser.getText();
                String pass = passwordText.getText();

                ///en el video se usa swing para poder hacer funcionar el JOptionPane
                /// apartir de aca el video empieza a usar base de datos
            }///else{
            ///JOptionPane.showMessageDialog(null,"Log In ERROR","Warning", JOptionPane.WARNING_MESSAGE);

        }

    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}