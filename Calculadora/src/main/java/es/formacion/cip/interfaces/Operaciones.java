package es.formacion.cip.interfaces;

public class Operaciones{

    // SUMA ****
    public static Double suma(Double valor1, Double valor2) {

        Double resultado;
        resultado = valor1 + valor2;

        return resultado;
    }

    // RESTA ****
    public static Double resta(Double valor1, Double valor2) {

        Double resultado;
        resultado = valor1 - valor2;

        return resultado;
    }

    // DIVISION ****
    public static Double dividir(Double valor1, Double valor2) {

        Double resultado;
        if (valor2 == null || valor2.equals(0.0))
            throw new NumberFormatException("El divisor no puede ser igual o menor a 0");
        resultado = valor1 / valor2;

        return resultado;
    }

    // MULTIPLICACION ****
    public static Double multiplica(Double valor1, Double valor2) {

        Double resultado;
        resultado = valor1 * valor2;

        return resultado;

    }

}
