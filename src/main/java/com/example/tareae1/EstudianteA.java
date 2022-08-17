package com.example.tareae1;

public class EstudianteA extends Estudiante{
    private static double notaPrProyectos;
    private double notaFinal;


    public EstudianteA(String carnet, String nombre, String correo, String telefono, String nickName, String tipo, double notaPrEx, double notaPrQ, double notaPrT, double notaP1, double notaP2, double notaP3) {
        super(carnet, nombre, correo, telefono, nickName, tipo, notaPrEx, notaPrQ, notaPrT, notaP1, notaP2, notaP3);
        this.notaFinal = notaFinal;
        this.notaPrProyectos = notaPrProyectos;
    }
    public static void NotaProyectos(){
        int i = 3;
        System.out.println(notaPrProyectos=(Estudiante.getNotaP1()+getNotaP2()+getNotaP3())/i);
        System.out.println(getNotaP1());
    }
}

