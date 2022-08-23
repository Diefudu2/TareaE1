package com.example.tareae1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * se crea una clase llamada DatosCSV para obtener los datos del archivo .csv y guardarlos en una lista de objetos
 * de la clase Estudiantes
 */
public class DatosCSV {
    public static ArrayList<Estudiante> estudiantes;

    public static ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }
    public DatosCSV(ArrayList<Estudiante> estudiantes) {
        if(estudiantes == null) {
            this.estudiantes = new ArrayList<Estudiante>();
        }
        else {
            this.estudiantes = estudiantes;
        }
    }

    public void Datos() {
        String linea, Carnet, Nombre, Correo, Telefono, NickName, Tipo, NotaPrEx, NotaPrQ, NotaPrT, NotaP1, NotaP2, NotaP3;
        double notaPrProyectos, notaPrEQT, NotaFinal;

        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\andre\\Desktop\\java\\TareaE1\\src\\main\\java\\com\\example\\tareae1\\ejemploE.csv"));
            linea = "";
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                Carnet = datos[0];
                Nombre = datos[1];
                Correo = datos[2];
                Telefono = datos[3];
                NickName = datos[4];
                Tipo = datos[5];
                NotaPrEx = datos[6];
                NotaPrQ = datos[7];
                NotaPrT = datos[8];
                NotaP1 = datos[9];
                NotaP2 = datos[10];
                NotaP3 = datos[11];
                notaPrProyectos = 0.0;
                notaPrEQT = 0.0;
                NotaFinal = 0.0;

                if (datos[5].equals("A")) {
                    EstudianteA est = new EstudianteA(Carnet, Nombre, Correo, Telefono, NickName, Tipo, Double.parseDouble(NotaPrEx), Double.parseDouble(NotaPrQ), Double.parseDouble(NotaPrT), Double.parseDouble(NotaP1), Double.parseDouble(NotaP2), Double.parseDouble(NotaP3), notaPrProyectos, notaPrEQT, NotaFinal);
                    this.estudiantes.add(est);//Aqui se instancian los objetos para las clases



                }
                else if (datos[5].equals("B")){
                    EstudianteB est = new EstudianteB(Carnet, Nombre, Correo, Telefono, NickName, Tipo, Double.parseDouble(NotaPrEx), Double.parseDouble(NotaPrQ), Double.parseDouble(NotaPrT), Double.parseDouble(NotaP1), Double.parseDouble(NotaP2), Double.parseDouble(NotaP3), notaPrProyectos, notaPrEQT, NotaFinal);
                    this.estudiantes.add(est);

                }
            }
        } catch (IOException est) {
            System.out.println("error");
            throw new RuntimeException(est);
            //System.err.println(est.getMessage());
        }

    }
}