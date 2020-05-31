package com.calculadora.cristian;

public class Resta extends Operacion{

    double operacionResta;

    public Resta(double n1, double n2) {

        super(n1, n2, '-');
        this.operacionResta = n1 - n2;
        this.setRes(this.operacionResta);
    }
}