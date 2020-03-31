package com.Triangulo;

public class Triangulo {
    private double LadoA;
    private double LadoB;
    private double LadoC;

    public Triangulo(){
        this.LadoA=0;
        this.LadoB=0;
        this.LadoC=0;
    }

    public Triangulo(double ladoa, double ladob, double ladoc){
        this.LadoA=ladoa;
        this.LadoB=ladob;
        this.LadoC=ladoc;
    }

    public double areaTriangulo(){
        double altura=Math.sqrt(Math.pow(this.LadoB,2)-Math.pow((this.LadoA/2),2));
        return ((this.LadoB*altura)/2);
    }

    public double getLadoA() {
        return LadoA;
    }

    public void setLadoA(double ladoA) {
        LadoA = ladoA;
    }

    public double getLadoB() {
        return LadoB;
    }

    public void setLadoB(double ladoB) {
        LadoB = ladoB;
    }

    public double getLadoC() {
        return LadoC;
    }

    public void setLadoC(double ladoC) {
        LadoC = ladoC;
    }
}
