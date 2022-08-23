package com.example.tareae1;

public abstract class Estudiante{
    private final String Carnet;
    private final String Nombre;
    private final String Correo;
    private final String Telefono;
    private final String NickName;
    private final String Tipo;
    private final double NotaPrEx;
    private final double NotaPrQ;
    private final double NotaPrT;
    private final double NotaP1;
    private final double NotaP2;
    private final double NotaP3;
    private final double notaPrProyectos;
    private final double notaPrEQT;
    private final double NotaFinal;


    public Estudiante(String carnet, String nombre, String correo, String telefono, String nickName, String tipo, double notaPrEx, double notaPrQ, double notaPrT, double notaP1, double notaP2, double notaP3, double notaPrProyectos,double notaPrEQT,double NotaFinal) {
        this.Carnet = carnet;
        this.Nombre = nombre;
        this.Correo = correo;
        this.Telefono = telefono;
        this.NickName = nickName;
        this.Tipo = tipo;
        this.NotaPrEx = notaPrEx;
        this.NotaPrQ = notaPrQ;
        this.NotaPrT = notaPrT;
        this.NotaP1 = notaP1;
        this.NotaP2 = notaP2;
        this.NotaP3 = notaP3;
        this.notaPrProyectos = notaPrProyectos;
        this.notaPrEQT = notaPrEQT;
        this.NotaFinal = NotaFinal;
    }


    public String getCarnet() {
        return Carnet;
    }
    public String getNombre() {
        return Nombre;
    }
    public String getCorreo() {
        return Correo;
    }
    public String getTelefono() {
        return Telefono;
    }
    public String getNickName() {
        return NickName;
    }
    public String getTipo() {
        return Tipo;
    }
    public double getNotaPrProyectos() {
        return notaPrProyectos;
    }
    public double getNotaPrEQT() {
        return notaPrEQT;
    }
    public double getNotaPrEx() {
        return NotaPrEx;
    }
    public double getNotaPrQ() {
        return NotaPrQ;
    }
    public double getNotaPrT() {
        return NotaPrT;
    }
    public double getNotaP1() {
        return NotaP1;
    }
    public double getNotaP2() {
        return NotaP2;
    }
    public double getNotaP3() {
        return NotaP3;
    }
    public double getNotaFinal() {
        return NotaFinal;
    }
}
