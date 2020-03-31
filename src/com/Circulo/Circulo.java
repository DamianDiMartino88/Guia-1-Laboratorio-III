package com.Circulo;

public class Circulo {
    private double Radio;

    public Circulo(){
        this.Radio=0;
    }

    public Circulo(double radio){
        this.Radio=radio;
    }

    public double getRadio() {
        return Radio;
    }

    public double areaCirculo(){
        return ((3.14)*Math.pow(this.Radio,2));
    }
    public double longitudCirculo(){
        return(2*3.14*this.Radio);
    }


    public void setRadio(double radio) {
        Radio = radio;
    }
}
