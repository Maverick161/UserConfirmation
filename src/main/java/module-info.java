module com.example.userconfirmation {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.userconfirmation to javafx.fxml;
    exports com.example.userconfirmation;
}