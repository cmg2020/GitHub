package es.formacion.cip.entornos.poo;

/** Creacion de Almacen y carga de datos
 * Muestra inventario
 * Creacion de Tienda
 */

public class Tienda{

    private final static int MAX_ARTICULOS = 1000;
    private Articulo[] articulos;
    private int[] cantidades;
    private int numArticulos;

    public Tienda() {
        articulos = new Articulo[MAX_ARTICULOS];
        cantidades = new int[MAX_ARTICULOS];
    }

    public void mostrarInventario() {

        for (int i = 0; i < numArticulos; i++) {

            System.out.println(articulos[i].toString());
        }
    }

    public void llenarAlmacen() {
        articulos[0] = new Articulo(0, "Cero", 10.0);
        cantidades[0] = 12;
        articulos[1] = new Articulo(1, "Uno", 20.0);
        cantidades[1] = 9;
        articulos[2] = new Articulo(2, "Dos", 15.0);
        cantidades[2] = 10;
        articulos[3] = new Articulo(3, "Tres", 180.0);
        cantidades[3] = 15;
        articulos[4] = new Articulo(4, "Cuatro", 105.0);
        cantidades[4] = 4;
        articulos[5] = new Articulo(5, "Cinco", 99.0);
        cantidades[5] = 1;
        numArticulos = 6;
    }

}
