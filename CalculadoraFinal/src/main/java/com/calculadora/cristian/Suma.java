package com.calculadora.cristian;

public class Suma extends Operacion{

    double operacionSuma;

    public Suma(double n1, double n2) {

        super(n1, n2, '+');
        this.operacionSuma = n1 + n2;
        this.setRes(this.operacionSuma);
    }
}