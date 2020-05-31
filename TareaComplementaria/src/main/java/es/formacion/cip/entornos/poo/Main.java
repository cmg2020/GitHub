package es.formacion.cip.entornos.poo;

/** Clase de arranque
 * Genreacion de datos, carga almacen
 * y se llama a la impresion del inventario
 */
public class Main {

    public static void main(String[] args) {

        // Creamos tienda, llenamos el almacen y mostramos el inventario:

        Tienda t = new Tienda();
        t.llenarAlmacen();
        t.mostrarInventario();        
    }
}
