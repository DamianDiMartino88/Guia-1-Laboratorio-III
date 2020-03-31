package com.Cuadrado;

public class Cuadrado {
    private double Lado;

    public Cuadrado(){
        this.Lado=0;
    }

    public Cuadrado(double lado){
        this.Lado=lado;
    }

    public double areaCuadrado(){
        return Math.pow(this.Lado,2);
    }

    public double getLado() {
        return Lado;
    }

    public void setLado(double lado) {
        Lado = lado;
    }
}
