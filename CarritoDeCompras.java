/**
 * CarritoDeCompras
 */
public class CarritoDeCompras {

    int  precio; 
    String nombre;
    int codigoBar;

    public CarritoDeCompras(int codigoBar, String nombre, int precio) {
        this.precio = precio;
        this.nombre = nombre;
        this.codigoBar = codigoBar;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public int getCodigoBar() {
        return codigoBar;
    }
}