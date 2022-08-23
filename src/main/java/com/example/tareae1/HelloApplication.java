package com.example.tareae1;
/**
*
 *
*@author Andres Castro Moreno
*
 */
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.util.ArrayList;


public class HelloApplication extends Application {
    public ObservableList<Estudiante> Student = null;
    @Override
    public void start(Stage stage) throws Exception {
        ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
        DatosCSV datos = new DatosCSV(estudiantes);
        datos.Datos();

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 550, 200);
        stage.setTitle("Estudiantes");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch();
    }
}
