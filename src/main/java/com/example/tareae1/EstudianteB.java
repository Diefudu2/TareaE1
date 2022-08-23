package com.example.tareae1;

public class EstudianteB extends Estudiante {
    public EstudianteB(String carnet, String nombre, String correo, String telefono, String nickName, String tipo, double notaPrEx, double notaPrQ, double notaPrT, double notaP1, double notaP2, double notaP3, double notaPrProyectos, double notaPrEQT, double NotaFinal) {
        super(carnet, nombre, correo, telefono, nickName, tipo, notaPrEx, notaPrQ, notaPrT, notaP1, notaP2, notaP3, notaPrProyectos, notaPrEQT, NotaFinal);
        PrProyectos();
        NotaFinal();
    }


    public void PrProyectos () {
        setnotaPrProyectos((getNotaP1() + getNotaP2() + getNotaP3()) / 3);
    }
    @Override
    public void NotaFinal(){//NotaFinal es una Funcion utilizada por ambas clases donde se aprecia el polimorfismo de esta funcion
        NotaFinal = ((getNotaPrProyectos() + getNotaPrQ() + getNotaPrEx() + getNotaPrT())/4);
    }
}



