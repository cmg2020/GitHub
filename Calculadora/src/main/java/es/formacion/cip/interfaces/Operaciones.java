package es.formacion.cip.interfaces;

/**
 * OPERACIONES realiza todas las operaciones basicas
 * de calculos: SUMA RESTA MULTIPLICACION DIVISION
 * @author Cristian Moreno G.
 * @version 25/02/2020
 **/

public class Operaciones{

    /**
     * Metodo SUMA:
     * Realiza la suma de dos numeros cargados en valor1 y valor2
     * @param valor1 primer operador
     * @param valor2 segundo operador
     * @return Valor devuelto en variable resultado
     */

    public static Double suma(Double valor1, Double valor2) {

        Double resultado;
        resultado = valor1 + valor2;

        return resultado;
    }
    /** Metodo RESTA
     * Realiza la resta de dos numeros cargados en valor1 y valor2
     * @param valor1 primer operador
     * @param valor2 segundo operador
     * @return Valor devuelto en variable resultado
     */

    public static Double resta(Double valor1, Double valor2) {

        Double resultado;
        resultado = valor1 - valor2;

        return resultado;
    }

    /**
     * Metodo DIVIDIR:
     * Realiza la division de dos numeros cargados en valor1 y valor2
     * Se realiza una comprobacion previa para evitar introducir un valor 0 en el divisor valor2
     * @param valor1 primer operador
     * @param valor2 segundo operador
     * @return Valor devuelto en variable resultado
     */

    public static Double dividir(Double valor1, Double valor2) {

        Double resultado;
        if (valor2 == null || valor2.equals(0.0))
            throw new NumberFormatException("El divisor no puede ser igual o menor a 0");
        resultado = valor1 / valor2;

        return resultado;
    }
    /**
     * Metodo MULTIPLICA:
     * Realiza la multiplicacion de dos numeros cargados en valor1 y valor2
     * @param valor1 primer operador
     * @param valor2 segundo operador
     * @return Valor devuelto en variable resultado
     */

    public static Double multiplica(Double valor1, Double valor2) {

        Double resultado;
        resultado = valor1 * valor2;

        return resultado;

    }
}
