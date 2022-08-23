package com.example.tareae1;

public class EstudianteA extends Estudiante {


    public EstudianteA(String carnet, String nombre, String correo, String telefono, String nickName, String tipo, double notaPrEx, double notaPrQ, double notaPrT, double notaP1, double notaP2, double notaP3, double notaPrProyectos, double notaPrEQT, double NotaFinal) {
        super(carnet, nombre, correo, telefono, nickName, tipo, notaPrEx, notaPrQ, notaPrT, notaP1, notaP2, notaP3, notaPrProyectos, notaPrEQT, NotaFinal);
    PrQTE();
    }
    public void PrQTE(){
        setnotaPrEQT((getNotaPrT() + getNotaPrQ() + getNotaPrEx()) / 3);
    }
}


