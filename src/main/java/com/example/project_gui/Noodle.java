package com.example.project_gui;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Noodle implements Initializable {
    @FXML
    private TableColumn<Nutrients, Double> amount;

    @FXML
    private Label nameLabel1;


    @FXML
    private TableColumn<Nutrients, String> nutrients;
    @FXML
    ComboBox<Integer> comb;
    @FXML
    private TableView<Nutrients> table;

    ObservableList<Nutrients> list = FXCollections.observableArrayList(
            new Nutrients("CarboHydrate", 63.00),
            new Nutrients("Protein", 10.00),
            new Nutrients("Fat", 16.00)
    );

    @FXML
    void Select(ActionEvent event){
        Integer i = comb.getSelectionModel().getSelectedItem();
        int a = i * 129;
        nameLabel1.setText(String.valueOf(a) + " Baht");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){
        amount.setCellValueFactory(new PropertyValueFactory<Nutrients,Double>("amount"));
        nutrients.setCellValueFactory(new PropertyValueFactory<Nutrients,String>("nutrient"));
        table.setItems(list);

        ObservableList<Integer> list2 = FXCollections.observableArrayList(1,2,3,4,5,6,7,8,9,10);
        comb.setItems(list2);
    }

    @FXML
    Stage stage;
    @FXML
    void Food(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Food.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new javafx.scene.Scene(fxmlLoader.load(), 1150, 800);
        stage.setScene(scene);
        stage.show();
    }
    public void Food1(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("QRcode.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new javafx.scene.Scene(fxmlLoader.load(), 1150, 800);
        stage.setScene(scene);
        stage.show();
    }
}
