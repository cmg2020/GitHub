package com.calculadora.cristian;

public class Calculadora{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double n1 = 10;
        double n2 = 5;

        //Suma
        Suma sum = new Suma(n1, n2);
        sum.mostrarResultado();

        //Resta
        Resta res = new Resta(n1, n2);
        res.mostrarResultado();

        //Multiplicacion
        Multiplicacion mul = new Multiplicacion(n1, n2);
        mul.mostrarResultado();

        //Division
        Division div = new Division(n1, n2);
        div.mostrarResultado();
    }
}
