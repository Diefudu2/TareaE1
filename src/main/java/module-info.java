module com.example.tareae1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tareae1 to javafx.fxml;
    exports com.example.tareae1;
}