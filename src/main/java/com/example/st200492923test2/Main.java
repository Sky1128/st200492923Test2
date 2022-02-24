package com.example.st200492923test2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
        Pokedex pokedex = new Pokedex("Your Name");
        Pokemon pokemon1 = new Pokemon("Dracozolt", "unknown",60,60,60,880);
        Pokemon pokemon2 = new Pokemon("Copperajah", "both",80,80,50,879);
        Pokemon pokemon3 = new Pokemon("Morpeko", "both",50,50,30,878);
        Pokemon pokemon4 = new Pokemon("Morpeko", "both",40,60,40,877);
        Pokemon pokemon5 = new Pokemon("Indeedee", "male",40,40,40,876);
        Pokemon pokemon6 = new Pokemon("Eiscue", "both",50,50,70,875);
        Pokemon pokemon7 = new Pokemon("Bulbasaur", "both",30,30,30,001);
        Pokemon pokemon8 = new Pokemon("Ivysaur", "both",40,40,40,002);
        Pokemon pokemon9 = new Pokemon("Venusaur", "both",50,50,50,003);
        Pokemon pokemon10 = new Pokemon("Charmander", "both",30,40,30,004);

    }
}