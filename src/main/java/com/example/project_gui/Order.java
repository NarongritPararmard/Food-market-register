package com.example.project_gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;


public class Order {
    @FXML
    private Stage stage;
    public void Food(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Food.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new javafx.scene.Scene(fxmlLoader.load(), 1150, 800);

        stage.setScene(scene);
        stage.show();
    }


}
