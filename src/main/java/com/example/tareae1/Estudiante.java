package com.example.tareae1;
/**
*Se crea la clase abstacta Estudiante
*Aqui se referencian los atributos de dicha clase y sus hijas
 */
public abstract class Estudiante{
    /**
    *El private al referenciar los atributos encapsula al dato lo cual genera que solo se pueda utilizar en esta clase
    *a ecepcion del protected que encapsula el atributo en la clase y sus clases hijas
     */
    private final String Carnet;//atributos del objeto
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
    private double notaPrProyectos;
    private double notaPrEQT;
    protected double NotaFinal;


    public Estudiante(String Carnet, String Nombre, String Correo, String Telefono, String NickName, String Tipo, double NotaPrEx, double NotaPrQ, double NotaPrT, double NotaP1, double NotaP2, double NotaP3, double notaPrProyectos,double notaPrEQT,double NotaFinal) {
        this.Carnet = Carnet;
        this.Nombre = Nombre;
        this.Correo = Correo;
        this.Telefono = Telefono;
        this.NickName = NickName;
        this.Tipo = Tipo;
        this.NotaPrEx = NotaPrEx;
        this.NotaPrQ =NotaPrQ;
        this.NotaPrT = NotaPrT;
        this.NotaP1 = NotaP1;
        this.NotaP2 = NotaP2;
        this.NotaP3 = NotaP3;
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

    public void setnotaPrProyectos(double NotaPrProyectos) {
        notaPrProyectos = NotaPrProyectos;
    }
    public void setnotaPrEQT(double NotaPrEQT) {
        notaPrEQT = NotaPrEQT;
}
    public void NotaFinal() {
        NotaFinal= 0.1 ;
    }
}
