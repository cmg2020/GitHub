package es.formacion.cip.interfaces;

import org.junit.Assert;
import org.junit.Test;

/**
 * OPERACIONESTEST realiza pruebas unitarias sobre todas las operaciones basicas
 * de calculos de la clase OPERACIONES (SUMA RESTA MULTIPLICACION DIVISION)
 * Se usa JUnit 4.12 a traves de MAVEN
 *
 * @author Cristian Moreno G.
 * @version 25/02/2020
 **/

public class OperacionesTest{

    @Test
/**
 * Metodo Test sumaSimpleTest:
 * Realiza test de comprobacion de NO NULO y RESULTADO INCORRECTO
 * @param valor1 primer operador
 * @param valor2 segundo operador
 */
    public void sumaSimpleTest() {

        Double valor1 = Double.valueOf(2);
        Double valor2 = Double.valueOf(4);
        Double resultado;
        resultado = Operaciones.suma(valor1, valor2);
        Assert.assertNotNull("El resultado no puede ser nulo...", resultado);
        Assert.assertEquals("El resultado no es correcto...", 6, (double) resultado, 0.0);
    }

    @Test
    /**
     * Metodo Test dividirSimpleTest:
     * Realiza test de comprobacion de NO NULO y RESULTADO INCORRECTO
     * @param valor1 primer operador
     * @param valor2 segundo operador
     */

    public void dividirSimpleTest() {

        Double valor1 = Double.valueOf(4);
        Double valor2 = Double.valueOf(2);
        Double resultado;
        resultado = Operaciones.dividir(valor1, valor2);
        Assert.assertNotNull("El resultado no puede ser nulo...", resultado);
        Assert.assertTrue("El resultado no es correcto...", resultado == 2);
    }

    @Test
    /**
     * Metodo Test dividirDecimalTest:
     * Realiza test de comprobacion de NO NULO y RESULTADO INCORRECTO
     * @param valor1 primer operador
     * @param valor2 segundo operador
     */

    public void dividirDecimalTest() {

        Double valor1 = 4.0;
        Double valor2 = 8.0;
        Double resultado;
        resultado = Operaciones.dividir(valor1, valor2);
        Assert.assertNotNull("El resultado no puede ser nulo...", resultado);
        Assert.assertTrue("El resultado no es correcto...", resultado == 0.5);
    }

    @Test
/**
 * Metodo Test restaSimpleTest:
 * Realiza test de comprobacion de NO NULO y RESULTADO INCORRECTO
 * @param valor1 primer operador
 * @param valor2 segundo operador
 */
    public void restaSimpleTest() {

        Double valor1 = Double.valueOf(5);
        Double valor2 = Double.valueOf(3);
        Double resultado = Operaciones.resta(valor1, valor2);
        Assert.assertNotNull("El resultado no puede ser nulo", resultado);
        Assert.assertTrue("El resultado no es el esperado", resultado == 2);
    }

    @Test
    /**
     * Metodo Test multiplicaSimpleTest:
     * Realiza test de comprobacion de NO NULO y RESULTADO INCORRECTO
     * @param valor1 primer operador
     * @param valor2 segundo operador
     */

    public void multiplicaSimpleTest() {

        Double valor1 = Double.valueOf(4);
        Double valor2 = Double.valueOf(2);
        Double resultado = Operaciones.multiplica(valor1, valor2);
        Assert.assertNotNull("El resultado no puede ser nulo...", resultado);
        Assert.assertTrue("El resultado no es correcto...", resultado == 8);
    }

}