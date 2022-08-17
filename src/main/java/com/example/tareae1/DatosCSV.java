package com.example.tareae1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DatosCSV {

    public static void Datos() {
        String linea, Carnet, Nombre, Correo, Telefono, NickName, Tipo;
        double NotaPrEx,NotaPrQ,NotaPrT,NotaP1,NotaP2,NotaP3;


        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\andre\\Desktop\\java\\TareaE1\\src\\main\\java\\com\\example\\tareae1\\ejemploE.csv"));
            linea = br.readLine();
            while((linea=br.readLine()) !=null){
                String datos[] = linea.split(",");
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
                if (Tipo.equals("A")) {
                    EstudianteA estA = new EstudianteA(Carnet, Nombre, Correo, Telefono, NickName, Tipo, NotaPrEx, NotaPrQ, NotaPrT, NotaP1, NotaP2, NotaP3);
                    //System.out.println(Nombre);
                    estA.NotaProyectos();
                    estA.NotaFinal();

                }
                else {
                    EstudianteB estB = new EstudianteB(Carnet, Nombre, Correo, Telefono, NickName, Tipo, NotaPrEx, NotaPrQ, NotaPrT, NotaP1, NotaP2, NotaP3);
                    //System.out.println(Tipo);
                    estB.NotaPrEQT();
                    estB.NotaFinal();
                }
                }
        } catch(IOException ex){
            System.err.println(ex.getMessage());
        }

    }
}