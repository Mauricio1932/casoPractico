import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Tienda {
    
    static Scanner teclado = new Scanner(System.in); //Entrada por teclado
    static CarritoDeCompras carritoObjeto;
    static List<CarritoDeCompras> carritoList = new LinkedList<CarritoDeCompras>();
    
    static String producto[][] = {{"1234","galleta","25"},
    {"3456","Cheetos","10"},
    {"2345","Jugo","15"},
    {"4567","Yogurt","16"},
    {"5678","Rocaleta","5"}};
    
    public static void main(String[]args){
        seleecionarProducto();
    }
    
    public static void seleecionarProducto() {
        int opcion=0;
        String nombreProducto;
        int codigo,precio;

        do{
            do {
                System.out.println("----------------------SELECIONE LA OPCION DESEADA-------------------");
                System.out.println("Num. seleccion\t Codigo\t producto\t Precio");
                for (int i=0; i<5; i++) {
                    System.out.println(i+"\t\t"+producto[i][0]+"\t"+producto[i][1]+"\t\t $"+producto[i][2]);
                }
                System.out.println("6.Mostrar los productos seleccionados");
                    System.out.println("opcion: ");
                    opcion = teclado.nextInt();

                if(opcion != 6 && opcion != 7){
                    nombreProducto = producto[opcion-1][1];
                    codigo = Integer.parseInt(producto[opcion-1][0]);
                    precio = Integer.parseInt(producto[opcion-1][2]);
                    System.out.println("Agregado "+ codigo);
                    carritoList.add(new CarritoDeCompras(codigo, nombreProducto, precio));
                }else if (opcion == 6){
                    visualizarPS();
                }
            } while (opcion <1 || opcion>7);
        }while(opcion!=7);;
    }

    public static void visualizarPS(){
        System.out.println("productos en carrito"); //Se quedaria hasta aca
        if (carritoList.size() >= 1) {
            System.out.println("\nCodigo\t producto\t Precio");
            for (CarritoDeCompras carritoDeCompras:carritoList) {
                System.out.println(carritoDeCompras.getCodigoBar() +"\t "+ carritoDeCompras.getNombre()+"\t "+carritoDeCompras.getPrecio());
            
            }
        } else {
            System.out.println("No hay productos en el carrito");
        }
    }

    public static void pagar() {
        Cajero caja = new Cajero();

        

    }
}
