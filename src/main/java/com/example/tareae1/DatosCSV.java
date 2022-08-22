package com.example.tareae1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

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
        String linea, Carnet, Nombre, Correo, Telefono, NickName, Tipo;
        double NotaPrEx, NotaPrQ, NotaPrT, NotaP1, NotaP2, NotaP3, notaPrProyectos, notaPrEQT, NotaFinal;

        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\andre\\Desktop\\java\\TareaE1\\src\\main\\java\\com\\example\\tareae1\\ejemploE.csv"));
            linea = "";
            //linea = br.readLine();
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                Carnet = datos[0];
                Nombre = datos[1];
                Correo = datos[2];
                Telefono = datos[3];
                NickName = datos[4];
                Tipo = datos[5];
                NotaPrEx = Double.parseDouble(datos[6]);
                NotaPrQ = Double.parseDouble(datos[7]);
                NotaPrT = Double.parseDouble(datos[8]);
                NotaP1 = Double.parseDouble(datos[9]);
                NotaP2 = Double.parseDouble(datos[10]);
                NotaP3 = Double.parseDouble(datos[11]);
                notaPrProyectos = 0.0;
                notaPrEQT = 0.0;
                NotaFinal = 0.0;

                if (datos[5].equals("A")) {
                    EstudianteA estA = new EstudianteA(Carnet, Nombre, Correo, Telefono, NickName, Tipo, NotaPrEx, NotaPrQ, NotaPrT, NotaP1, NotaP2, NotaP3, notaPrProyectos, notaPrEQT, NotaFinal);
                    this.estudiantes.add(estA);
                    //System.out.println(Nombre);



                } else if (datos[5].equals("B")){
                    EstudianteB estB = new EstudianteB(Carnet, Nombre, Correo, Telefono, NickName, Tipo, NotaPrEx, NotaPrQ, NotaPrT, NotaP1, NotaP2, NotaP3, notaPrProyectos, notaPrEQT, NotaFinal);
                    this.estudiantes.add(estB);
                    //System.out.println(Tipo);

                }
            }
        } catch (IOException estA) {
            throw new RuntimeException(estA);
            //System.err.println(estA.getMessage());
        }

    }
}