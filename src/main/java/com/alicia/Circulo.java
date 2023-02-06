package com.alicia;

public class Circulo {
    private int radio;

    public Circulo(int radio) {
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
    

    public double calcularArea(){
        return Math.PI*Math.pow(radio, 2);
    }

    public double calcularPErimetro(){
        return 2*Math.PI*radio;
    }
}
