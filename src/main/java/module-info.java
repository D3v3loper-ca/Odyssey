module com.example.odyssey {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;


    opens com.example.odyssey to javafx.fxml;
    exports com.example.odyssey;
}