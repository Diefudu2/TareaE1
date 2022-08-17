package com.example.tareae1;

public class EstudianteA extends Estudiante {
    private static double notaPrProyectos;
    private static double notaFinal;


    public EstudianteA(String carnet, String nombre, String correo, String telefono, String nickName, String tipo, double notaPrEx, double notaPrQ, double notaPrT, double notaP1, double notaP2, double notaP3) {
        super(carnet, nombre, correo, telefono, nickName, tipo, notaPrEx, notaPrQ, notaPrT, notaP1, notaP2, notaP3);
        this.notaFinal = notaFinal;
        this.notaPrProyectos = notaPrProyectos;
    }

    public static double NotaProyectos() {
        int i = 3;
        notaPrProyectos = (getNotaP1() + getNotaP2() + getNotaP3()) / i;
        return (notaPrProyectos);
    }

    public static double NotaFinal() {
        int i = 6;
        notaFinal = (getNotaP1() + getNotaP2() + getNotaP3() + getNotaPrEx() + getNotaPrQ() + getNotaPrT()) / i;
        return (notaFinal);
    }
        public static void getNp() {
            System.out.println("la nota Proyectos es: " + notaPrProyectos+ "\n NFinal: " + notaFinal);

        }
    }


