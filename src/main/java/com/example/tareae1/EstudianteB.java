package com.example.tareae1;

public class EstudianteB extends Estudiante {
    private double notaPrEQT;
    private double notaFinal;


    public EstudianteB(String carnet, String nombre, String correo, String telefono, String nickName, String tipo, double notaPrEx, double notaPrQ, double notaPrT, double notaP1, double notaP2, double notaP3) {
        super(carnet, nombre, correo, telefono, nickName, tipo, notaPrEx, notaPrQ, notaPrT, notaP1, notaP2, notaP3);
        this.notaPrEQT = notaPrEQT;
        this.notaFinal = notaFinal;
    }

    public void NotaPrEQT() {
        int i = 3;
        notaPrEQT = (getNotaPrEx() + getNotaPrQ() + getNotaPrT()) / i;
        System.out.println(notaPrEQT);
    }
}


