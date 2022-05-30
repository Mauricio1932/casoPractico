/**
 * CarritoDeCompras
 */
public class CarritoDeCompras {

    float precio; 
    int cantidad;
    String nombre;
    int codigoBar;

    public CarritoDeCompras(float precio, int cantidad, String nombre, int codigoBar) {
        this.precio = precio;
        this.cantidad = cantidad;
        this.nombre = nombre;
        this.codigoBar = codigoBar;
    }

    public String getNombre() {
        return nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getCodigoBar() {
        return codigoBar;
    }
}