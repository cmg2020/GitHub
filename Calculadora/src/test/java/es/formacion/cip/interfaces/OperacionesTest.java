package es.formacion.cip.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class OperacionesTest{

    @Test

    public void sumaSimpleTest() {

        Double valor1 = Double.valueOf(2);
        Double valor2 = Double.valueOf(4);
        Double resultado;
        resultado = Operaciones.suma(valor1, valor2);
        Assert.assertNotNull("El resultado no puede ser nulo...", resultado);
        Assert.assertEquals("El resultado no es correcto...", 6, (double) resultado, 0.0);
    }

    @Test

    public void dividirSimpleTest() {

        Double valor1 = Double.valueOf(4);
        Double valor2 = Double.valueOf(2);
        Double resultado;
        resultado = Operaciones.dividir(valor1, valor2);
        Assert.assertNotNull("El resultado no puede ser nulo...", resultado);
        Assert.assertTrue("El resultado no es correcto...", resultado == 2);
    }

    @Test

    public void dividirDecimalTest() {

        Double valor1 = 4.0;
        Double valor2 = 8.0;
        Double resultado;
        resultado = Operaciones.dividir(valor1, valor2);
        Assert.assertNotNull("El resultado no puede ser nulo...", resultado);
        Assert.assertTrue("El resultado no es correcto...", resultado == 0.5);
    }

    @Test

    public void restaSimpleTest() {

        Double valor1 = Double.valueOf(5);
        Double valor2 = Double.valueOf(3);
        Double resultado = Operaciones.resta(valor1, valor2);
        Assert.assertNotNull("El resultado no puede ser nulo", resultado);
        Assert.assertTrue("El resultado no es el esperado", resultado==2);
    }

    @Test

    public void multiplicaSimpleTest() {

        Double valor1 = Double.valueOf(4);
        Double valor2 = Double.valueOf(2);
        Double resultado = Operaciones.multiplica(valor1, valor2);
        Assert.assertNotNull("El resultado no puede ser nulo...", resultado);
        Assert.assertTrue("El resultado no es correcto...", resultado==8);
    }

}
