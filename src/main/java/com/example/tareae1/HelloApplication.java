package com.example.tareae1;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.util.ArrayList;


public class HelloApplication extends Application {
    public ObservableList<Estudiante> Student;
    @Override
    public void start(Stage stage) throws Exception {
        ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
        DatosCSV datos = new DatosCSV(estudiantes);
        datos.Datos();
        Student = FXCollections.observableArrayList(DatosCSV.getEstudiantes());
        System.out.println(DatosCSV.getEstudiantes());

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 620, 340);
        stage.setTitle("Que honda pa");
        stage.setScene(scene);
        stage.show();
    }

}
