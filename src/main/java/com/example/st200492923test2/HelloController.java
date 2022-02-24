package com.example.st200492923test2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class HelloController implements Initializable {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label attackLabel;

    @FXML
    private Label defenseLabel;

    @FXML
    private Label genderLabel;

    @FXML
    private Label hpLabel;

    @FXML
    private Label numberLabel;

    @FXML
    private Label nameLabel;

    private Pokemon pokemonobj;
    @FXML
    void initialize() {
        assert attackLabel != null : "fx:id=\"attackLabel\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert defenseLabel != null : "fx:id=\"defenseLabel\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert genderLabel != null : "fx:id=\"genderLabel\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert hpLabel != null : "fx:id=\"hpLabel\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert nameLabel != null : "fx:id=\"nameLabel\" was not injected: check your FXML file 'hello-view.fxml'.";


    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        nameLabel.setText(pokemonobj.getName());
        numberLabel.setText(Integer.toString(pokemonobj.getPokemonNumber()));
        hpLabel.setText(Integer.toString(pokemonobj.getHp()));
        genderLabel.setText((pokemonobj.getGender()));





    }
}
