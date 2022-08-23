package com.example.tareae1;

public class EstudianteA extends Estudiante {//EstudianteA es una clase hija de la clase Abstracta Estudiante


    public EstudianteA(String carnet, String nombre, String correo, String telefono, String nickName, String tipo, double notaPrEx, double notaPrQ, double notaPrT, double notaP1, double notaP2, double notaP3, double notaPrProyectos, double notaPrEQT, double NotaFinal) {
        super(carnet, nombre, correo, telefono, nickName, tipo, notaPrEx, notaPrQ, notaPrT, notaP1, notaP2, notaP3, notaPrProyectos, notaPrEQT, NotaFinal);
    PrQTE();
    NotaFinal();
    }
    public void PrQTE(){ //Metodo de la clase EstudianteA para obtener el promedio de los Quices, Tareas y examenes
        setnotaPrEQT((getNotaPrT() + getNotaPrQ() + getNotaPrEx()) / 3);

    }
    @Override
    public void NotaFinal(){//Sobreescribe la funcion NotaFinal de la clase Estudiantes para obtener la nota del estudiante
        NotaFinal = ((getNotaP1() + getNotaP2() + getNotaP3() + getNotaPrEQT())/4);
    }
}


