module com.example.tsolution {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tsolution to javafx.fxml;
    exports com.example.tsolution;
}