public class CarritoDeCompra {
    private int codigoBar;
    private String nombre;
    private int precio;

    public CarritoDeCompra(int codigoBar,String nombre,int precio) { //Constructor para crear el objeto
        this.codigoBar=codigoBar;
        this.nombre=nombre;
        this.precio=precio;
    }
    
    public int getCodigoBar(){ return codigoBar;}
    public String getNombre(){ return nombre;}
    public int getPrecio(){ return precio;}

}
