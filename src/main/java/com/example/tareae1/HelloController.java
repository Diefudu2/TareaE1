package com.example.tareae1;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ResourceBundle;
/**
 *Esta clase coloca los datos de la lista de Estudiantes en las cedas del TableView
 *
 */
public class HelloController implements Initializable{


    public VBox table;

    @FXML
    private TableColumn<Estudiante,String> columnCarnet;

    @FXML
    private TableColumn<Estudiante,String> columnNombre;

    @FXML
    private TableColumn<Estudiante,String> columnCorreo;

    @FXML
    private TableColumn<Estudiante,String> columnTelefono;

    @FXML
    private TableColumn<Estudiante,String> columnNickName;

    @FXML
    private TableColumn<Estudiante,String> columnTipo;

    @FXML
    private TableColumn<Estudiante, Double> columnNotaPrEx;

    @FXML
    private TableColumn<Estudiante, Double> columnNotaPrQ;

    @FXML
    private TableColumn<Estudiante, Double> columnNotaPrT;

    @FXML
    private TableColumn<Estudiante, Double> columnNotaP1;

    @FXML
    private TableColumn<Estudiante, Double> columnNotaP2;

    @FXML
    private TableColumn<Estudiante, Double> columnNotaP3;

    @FXML
    private TableColumn<Estudiante, Double> columnnotaPrProyectos;

    @FXML
    private TableColumn<Estudiante, Double> columnnotaPrEQT;

    @FXML
    private TableColumn<Estudiante, Double> columnnotaFinal;
    @FXML
    private TableView<Estudiante> tabla;

    private ObservableList<Estudiante> Students;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Students = FXCollections.observableArrayList(DatosCSV.getEstudiantes());

        columnCarnet.setCellValueFactory(new PropertyValueFactory<Estudiante, String>("Carnet"));
        columnNombre.setCellValueFactory(new PropertyValueFactory<Estudiante,String>("Nombre"));
        columnCorreo.setCellValueFactory(new PropertyValueFactory<Estudiante,String>("Correo"));
        columnTelefono.setCellValueFactory(new PropertyValueFactory<Estudiante,String>("Telefono"));
        columnNickName.setCellValueFactory(new PropertyValueFactory<Estudiante,String>("NickName"));
        columnTipo.setCellValueFactory(new PropertyValueFactory<Estudiante,String>("Tipo"));
        columnNotaPrEx.setCellValueFactory(new PropertyValueFactory<Estudiante,Double>("NotaPrEx"));
        columnNotaPrQ.setCellValueFactory(new PropertyValueFactory<Estudiante,Double>("NotaPrQ"));
        columnNotaPrT.setCellValueFactory(new PropertyValueFactory<Estudiante,Double>("NotaPrT"));
        columnNotaP1.setCellValueFactory(new PropertyValueFactory<Estudiante,Double>("NotaP1"));
        columnNotaP2.setCellValueFactory(new PropertyValueFactory<Estudiante,Double>("NotaP2"));
        columnNotaP3.setCellValueFactory(new PropertyValueFactory<Estudiante,Double>("NotaP3"));
        columnnotaPrProyectos.setCellValueFactory(new PropertyValueFactory<Estudiante,Double>("notaPrProyectos"));
        columnnotaPrEQT.setCellValueFactory(new PropertyValueFactory<Estudiante,Double>("notaPrEQT"));
        columnnotaFinal.setCellValueFactory(new PropertyValueFactory<Estudiante,Double>("notaFinal"));
        tabla.getItems().setAll(Students);

    }

}