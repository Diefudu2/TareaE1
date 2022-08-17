package com.example.tareae1;

public class Estudiante {
    private String Carnet;
    private String Nombre;
    private String Correo;
    private String Telefono;
    private String NickName;
    private String Tipo;
    private double NotaPrEx;
    private double NotaPrQ;
    private double NotaPrT;
    private static double NotaP1;
    private static double NotaP2;
    private static double NotaP3;

    public Estudiante(String carnet, String nombre, String correo, String telefono, String nickName, String tipo, double notaPrEx, double notaPrQ, double notaPrT, double notaP1, double notaP2, double notaP3) {
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
    public double getNotaPrEx() {
        return NotaPrEx;
    }
    public double getNotaPrQ() {
        return NotaPrQ;
    }
    public double getNotaPrT() {
        return NotaPrT;
    }
    public static double getNotaP1() {
        return NotaP1;
    }
    public static double getNotaP2() {
        return NotaP2;
    }
    public static double getNotaP3() {
        return NotaP3;
    }

}
