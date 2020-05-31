import es.formacion.cip.entornos.poo.Articulo;
import es.formacion.cip.entornos.poo.Main;
import es.formacion.cip.entornos.poo.Tienda;
import org.junit.Assert;
import org.junit.Test;

public class TiendaTest{

    Tienda tienda = new Tienda();
    Main principal = new Main();
    Articulo articulos = new Articulo (1,  "Cero", 10.0);

    @Test
    public void shopTest() {

        Assert.assertNotNull("NULO!!", articulos.toString());
        Assert.assertNotNull("NULO!!", tienda);
        Assert.assertNotNull("NULO!!", principal);
        Assert.assertNotNull("NULO!!", articulos);
        Assert.assertNotNull("NULO!!", articulos.getId());
        Assert.assertNotNull("NULO!!", articulos.getNombre());
        Assert.assertNotNull("NULO!!", articulos.getPrecio());
    }
}
