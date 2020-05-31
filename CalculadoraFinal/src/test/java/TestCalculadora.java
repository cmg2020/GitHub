import com.calculadora.cristian.Division;
import com.calculadora.cristian.Multiplicacion;
import com.calculadora.cristian.Resta;
import com.calculadora.cristian.Suma;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestCalculadora{

    Double valor1;
    Double valor2;
    Double resultadoEsperado;

    @Before
    public void before() {
        valor1 = 12.0;
        valor2 = 6.0;
    }

    @Test
    public void sumaTest() {
        resultadoEsperado = 18.0;
        Suma operacion = new Suma(valor1, valor2);
        Double res = operacion.getRes();
        verificarResultado(res, resultadoEsperado);
    }

    @Test
    public void restaTest() {
        resultadoEsperado = 6.0;
        Resta operacion = new Resta(valor1, valor2);
        Double res = operacion.getRes();
        verificarResultado(res, resultadoEsperado);
    }

    @Test
    public void multiplicacionTest() {
        resultadoEsperado = 72.0;
        Multiplicacion operacion = new Multiplicacion(valor1, valor2);
        Double res = operacion.getRes();
        verificarResultado(res, resultadoEsperado);
    }

    @Test
    public void divisionTest() {
        resultadoEsperado = 2.0;
        Division operacion = new Division(valor1, valor2);
        Double res = operacion.getRes();
        verificarResultado(res, resultadoEsperado);
    }

    @Test
    public void divisionPorCeroTest() {
        valor2 = 0.0;
        resultadoEsperado=0.0;
        try {
            Division operacion = new Division(valor1, valor2);
            Double res = operacion.getRes();
            verificarResultado(res, resultadoEsperado);
        } catch (Exception e) {
            Assert.assertNotNull("NULO!!!", e.getMessage());
            Assert.assertTrue("ERROR!", e.getMessage().contains("Division por 0"));
        }
    }

    public void verificarResultado(Double resultado, Double resultEsperado) {
        Assert.assertNotNull("NULO!!!", resultado);
        Assert.assertTrue("ERROR!", resultado.equals(resultEsperado));
    }
}