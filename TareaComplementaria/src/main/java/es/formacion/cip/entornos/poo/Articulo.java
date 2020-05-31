package es.formacion.cip.entornos.poo;

/**
 * @author Cristian MG
 * @version 1.0
 */

public class Articulo{

    private int id;
    private String nombre;
    private double precio;

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    /**
     * @param id
     * @param nombre
     * @param precio
     */

    public Articulo(int id, String nombre, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;

    }

    /**
     * @return toString para impresion de datos
     */

    public String toString() {
        return "Id: " + id + " Nombre: " + nombre + " Precio: " + precio;
    }
}
