package com.upchiapas.practica02;
import com.upchiapas.practica02.models.Cajero;
import com.upchiapas.practica02.models.CarritoDeCompra;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Tienda {

    static Scanner teclado = new Scanner(System.in); //Entrada por teclado

    static CarritoDeCompra objetoCarritoDeCompra;
    private static CarritoDeCompra listaProducto[];


    public static void main(String[]args){
        seleecionarProducto();
    }

    public static void seleecionarProducto() {
        listaProducto = new CarritoDeCompra[5];
        CarritoDeCompra producto1= new CarritoDeCompra(1234, "Galleta", 25);
        CarritoDeCompra producto2= new CarritoDeCompra(2345, "Jugo", 15);
        CarritoDeCompra producto3= new CarritoDeCompra(3456, "Cheetos", 10);
        CarritoDeCompra producto4= new CarritoDeCompra(4567, "Yogurt",16 );
        CarritoDeCompra producto5= new CarritoDeCompra(5678, "Rockaleta", 5);

        int opcion=0; List<CarritoDeCompra> carrito=new LinkedList<CarritoDeCompra>();

        do{
            for (int i=0; i<1; i++) {
                System.out.println("----------------------SELECIONE LA OPCION DESEADA-------------------");
                System.out.println("Carrito No."+i);
                System.out.println("1.  "+producto1.getCodigoBar()+" Nombre del producto: "+producto1.getNombre()+" Precio: "+producto1.getPrecio());
                System.out.println("2.  "+producto2.getCodigoBar()+" Nombre del producto: "+producto2.getNombre()+" Precio: "+producto2.getPrecio());
                System.out.println("3.  "+producto3.getCodigoBar()+" Nombre del producto: "+producto3.getNombre()+" Precio: "+producto3.getPrecio());
                System.out.println("4.  "+producto4.getCodigoBar()+" Nombre del producto: "+producto4.getNombre()+" Precio: "+producto4.getPrecio());
                System.out.println("5.  "+producto5.getCodigoBar()+" Nombre del producto: "+producto5.getNombre()+" Precio: "+producto5.getPrecio());
                System.out.println("6.Mostrar los productos seleccionados");
            }
                    System.out.println("opcion: ");
                    opcion=teclado.nextInt();
             switch (opcion) {
                case 1:
                carrito.add(new CarritoDeCompra(1234,"Galleta",25) );
                    break;
                case 2:
                    carrito.add(new CarritoDeCompra(2345,"Jugo",115));
                    break;
                case 3:
                    carrito.add(new CarritoDeCompra(3456,"Cheetos",10));
                    break;
                 case 4:
                    carrito.add(new CarritoDeCompra(4567,"Yogurt",16));
                     break;
                 case 5:
                     carrito.add(new CarritoDeCompra(5678,"Rockaleta",5));
                     break;
                 case 6:
                     opcion=7;
                     visualizarPS(opcion,carrito);
                     break;
                 case 7:
                     System.out.println("GRACIAS POR UTILIZAR MI SISTEMA");
                     break;
                 default:
                     System.out.println("Opcion incorrecta");
                     break;
            }
        }while(opcion!=7);;
    }
        public static CarritoDeCompra visualizarPS(int opcion, List <CarritoDeCompra>carrito){
        for (CarritoDeCompra carritoDeCompra:carrito) {
            System.out.println("Producto-------->"+" Codigo de barras: "+carritoDeCompra.getCodigoBar()+" Nombre: "+carritoDeCompra.getNombre()+" Precio: "+carritoDeCompra.getPrecio());
        }
            Cajero cajero =new Cajero(); //Inicializacion
            return objetoCarritoDeCompra;for (CarritoDeCompra carritoDeCompra : carrito) {
                cajero.totalApagar(List<Cajero> carrito); //Manda a llmar el metodo de la clase cajero
            }


        }
}
