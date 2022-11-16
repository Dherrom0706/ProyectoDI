package com.example.proyectodi.controladores;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class VideojuegoCotroller {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}