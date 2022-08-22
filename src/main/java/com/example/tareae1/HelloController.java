package com.example.tareae1;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable{


    @FXML
    private TableView<Estudiante> table;

    @FXML
    private TableColumn<Estudiante,String> Carnet;

    @FXML
    private TableColumn<Estudiante,String> Nombre;

    @FXML
    private TableColumn<Estudiante,String> Correo;

    @FXML
    private TableColumn<Estudiante,String> Telefono;

    @FXML
    private TableColumn<Estudiante,String> NickName;

    @FXML
    private TableColumn<Estudiante,String> Tipo;

    @FXML
    private TableColumn<Estudiante, Double> NotaPrEx;

    @FXML
    private TableColumn<Estudiante, Double> NotaPrQ;

    @FXML
    private TableColumn<Estudiante, Double> NotaPrT;

    @FXML
    private TableColumn<Estudiante, Double> NotaP1;

    @FXML
    private TableColumn<Estudiante, Double> NotaP2;

    @FXML
    private TableColumn<Estudiante, Double> NotaP3;

    @FXML
    private TableColumn<Estudiante, Double> notaPrProyectos;

    @FXML
    private TableColumn<Estudiante, Double> notaPrEQT;

    @FXML
    private TableColumn<Estudiante, Double> notaFinal;
    private ObservableList<Estudiante> Students;



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Students = FXCollections.observableArrayList(DatosCSV.getEstudiantes());

        Carnet.setCellValueFactory(new PropertyValueFactory<Estudiante,String>("Carnet"));
        Nombre.setCellValueFactory(new PropertyValueFactory<Estudiante,String>("Nombre"));
        Correo.setCellValueFactory(new PropertyValueFactory<Estudiante,String>("Correo"));
        Telefono.setCellValueFactory(new PropertyValueFactory<Estudiante,String>("Telefono"));
        NickName.setCellValueFactory(new PropertyValueFactory<Estudiante,String>("NickName"));
        Tipo.setCellValueFactory(new PropertyValueFactory<Estudiante,String>("Tipo"));
        NotaPrEx.setCellValueFactory(new PropertyValueFactory<Estudiante,Double>("NotaPrEx"));
        NotaPrQ.setCellValueFactory(new PropertyValueFactory<Estudiante,Double>("NotaPrQ"));
        NotaPrT.setCellValueFactory(new PropertyValueFactory<Estudiante,Double>("NotaPrT"));
        NotaP1.setCellValueFactory(new PropertyValueFactory<Estudiante,Double>("NotaP1"));
        NotaP2.setCellValueFactory(new PropertyValueFactory<Estudiante,Double>("NotaP2"));
        NotaP3.setCellValueFactory(new PropertyValueFactory<Estudiante,Double>("NotaP3"));
        notaPrProyectos.setCellValueFactory(new PropertyValueFactory<Estudiante,Double>("notaPrProyectos"));
        notaPrEQT.setCellValueFactory(new PropertyValueFactory<Estudiante,Double>("notaPrEQT"));
        notaFinal.setCellValueFactory(new PropertyValueFactory<Estudiante,Double>("notaFinal"));

        table.getItems().setAll(Students);
    }

}