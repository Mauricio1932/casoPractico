public class CarritoDeCompra {
    private int codigoBar;

    private String nombre;

    private float precio;

    public CarritoDeCompra(int codigoBar,String nombre,float precio) { //Constructor para crear el objeto
        this.codigoBar=codigoBar;
        this.nombre=nombre;
        this.precio=precio;
    }
    
    public int getCodigoBar(){ return codigoBar;}
    public String getNombre(){ return nombre;}
    public float getPrecio(){ return precio;}

}
