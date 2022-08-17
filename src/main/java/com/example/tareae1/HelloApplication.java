package com.example.tareae1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Que honda pa");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        //launch();
        DatosCSV.Datos();
        EstudianteA.NotaProyectos();
    }
}