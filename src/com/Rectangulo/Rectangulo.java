package com.Rectangulo;

public class Rectangulo {
    private double Base;
    private double Altura;

    public Rectangulo(){
        this.Base=0;
        this.Altura=0;
    }

    public Rectangulo(double base, double altura){
        this.Base=base;
        this.Altura=altura;
    }

    public double areaRectangulo(){
        return (this.Base*this.Altura);
    }

    public double getBase() {
        return Base;
    }

    public void setBase(double base) {
        Base = base;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double altura) {
        Altura = altura;
    }
}
