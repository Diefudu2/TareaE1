package com.example.tareae1;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.util.ArrayList;


public class HelloApplication extends Application {
    public ObservableList<Estudiante> Student = null;
    @Override
    public void start(Stage stage) throws Exception {
        System.out.println(Student);
        ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
        DatosCSV datos = new DatosCSV(estudiantes);
        datos.Datos();

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 550, 200);
        stage.setTitle("Estudiantes");
        stage.setScene(scene);
        stage.show();
    }
}
