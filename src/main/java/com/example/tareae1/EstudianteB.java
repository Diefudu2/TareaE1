package com.example.tareae1;

public class EstudianteB extends Estudiante {
    private static double notaPrEQT;
    private static double notaFinal;


    public EstudianteB(String carnet, String nombre, String correo, String telefono, String nickName, String tipo, double notaPrEx, double notaPrQ, double notaPrT, double notaP1, double notaP2, double notaP3) {
        super(carnet, nombre, correo, telefono, nickName, tipo, notaPrEx, notaPrQ, notaPrT, notaP1, notaP2, notaP3);
        this.notaPrEQT = notaPrEQT;
        this.notaFinal = notaFinal;
    }

    public static double NotaPrEQT() {
        int i = 3;
        notaPrEQT = (getNotaPrEx() + getNotaPrQ() + getNotaPrT()) / i;
        //System.out.println("El b "+notaPrEQT);
        return(notaPrEQT);
    }
    public static double NotaFinal() {
        int i = 6;
        notaFinal = (getNotaP1() + getNotaP2() + getNotaP3() + getNotaPrEx() + getNotaPrQ() + getNotaPrT()) / i;
        System.out.println("la nota varia es: " + notaPrEQT+ "\n NFinal: " + notaFinal);
        return (notaFinal);
    }
}


