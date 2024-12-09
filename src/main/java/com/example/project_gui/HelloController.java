package com.example.project_gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private Label myLabel;

    @FXML
    private TextField myTextField;
    @FXML
    private TextField mytextField2;

    @FXML
    private Button mybutton;
    @FXML
    String username;
    @FXML
    int password;
    @FXML
    private Stage stage;
    private Parent root;

    public void login(ActionEvent event) throws IOException {
        try{
            username = myTextField.getText();
            password = Integer.parseInt(mytextField2.getText());

            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Food.fxml"));
            root = fxmlLoader.load();

            FoodController user = fxmlLoader.getController();
            user.displayname(username);

            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            Scene scene = new javafx.scene.Scene(root);
            stage.setScene(scene);
            stage.show();

        }catch (Exception e){
            e.printStackTrace();
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Error");
            alert.setHeaderText("Password incorrect!");
            alert.setContentText("Password must be an integer.");
            alert.showAndWait();
        }

    }




}