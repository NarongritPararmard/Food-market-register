package com.example.project_gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class FoodController {

    @FXML
    public Label nameLabel;

    @FXML
    Stage stage;

    public void displayname(String username){
        nameLabel.setText(username);
    }

    public void padthai(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Padthai.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new javafx.scene.Scene(fxmlLoader.load(), 1150, 800);
        stage.setScene(scene);
        stage.show();
    }

    public void noodle(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Noodle.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new javafx.scene.Scene(fxmlLoader.load(), 1150, 800);
        stage.setScene(scene);
        stage.show();
    }
    public void somtam(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Somtam.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new javafx.scene.Scene(fxmlLoader.load(), 1150, 800);
        stage.setScene(scene);
        stage.show();
    }
    public void shrimp(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Shrimp.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new javafx.scene.Scene(fxmlLoader.load(), 1150, 800);
        stage.setScene(scene);
        stage.show();
    }
    public void spring(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Springroll.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new javafx.scene.Scene(fxmlLoader.load(), 1150, 800);
        stage.setScene(scene);
        stage.show();
    }

    public void chickengreen(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Chickengreen.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new javafx.scene.Scene(fxmlLoader.load(), 1150, 800);
        stage.setScene(scene);
        stage.show();
    }
    public void hamburger(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Hamburger.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new javafx.scene.Scene(fxmlLoader.load(), 1150, 800);
        stage.setScene(scene);
        stage.show();
    }
    public void tomyumkung(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Tomyamkung.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new javafx.scene.Scene(fxmlLoader.load(), 1150, 800);
        stage.setScene(scene);
        stage.show();
    }


}
