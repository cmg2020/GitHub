package com.calculadora.cristian;

import static java.lang.System.*;

public class Operacion{

    double n1;
    double n2;
    double res;
    char operacionSalida;

    public Operacion(double n1, double n2, char operacionSalida) {

        this.n1 = n1;
        this.n2 = n2;
        this.operacionSalida = operacionSalida;
    }

    public void mostrarResultado() {

        System.out.println(this.n1 + " " + this.operacionSalida + " " + this.n2 + " = " + this.res);
    }

    public double getRes() {
        return res;
    }

    public void setRes(double res) {
        this.res = res;
    }
}