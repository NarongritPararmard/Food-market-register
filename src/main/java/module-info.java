module com.example.project_gui {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.project_gui to javafx.fxml;
    exports com.example.project_gui;
}