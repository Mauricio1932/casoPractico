import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Tienda {
    
    static Scanner teclado = new Scanner(System.in); //Entrada por teclado
    static CarritoDeCompras carritoObjeto;
    static List<CarritoDeCompras> carritoList = new LinkedList<CarritoDeCompras>();
    
    static String producto[][] = {{"1","galleta","25","0"},
    {"2","Jugo","15","0"},
    {"3","Cheetos","10","0"},
    {"4","Yogurt","16","0"},
    {"5","Rocaleta","5","0"}};
    
    public static void main(String[]args){
        seleecionarProducto();
    }
    
    public static void seleecionarProducto() {
        int suma = 0;
        int opcion=0;
        String nombreProducto;
        int codigo,precio;

        do{
            do {
                System.out.println("----------------------SELECIONE LA OPCION DESEADA-------------------");
                System.out.println("Codigo\t producto\t Precio");
                for (int i=0; i<5; i++) {
                    System.out.println("\t\t"+producto[i][0]+"\t"+producto[i][1]+"\t\t $"+producto[i][2]);
                }
                System.out.println("6.Mostrar los productos seleccionados");
                System.out.println("7 salir");
                    System.out.println("opcion: ");
                    opcion = teclado.nextInt();
                } while (opcion<1 || opcion >7);
                    if(opcion != 6 && opcion != 7){
                        nombreProducto = producto[opcion-1][1];
                        codigo = Integer.parseInt(producto[opcion-1][0]);
                        precio = Integer.parseInt(producto[opcion-1][2]);
                        System.out.println("Agregado "+ codigo);

                        carritoList.add(new CarritoDeCompras(codigo, nombreProducto, precio));
                            for (int j = 0; j < producto.length; j++) {
                                if(producto[j][1].equals(carritoList.get(opcion-1).getNombre())){
                                    System.out.println("iguales");
                                    suma  = Integer.parseInt(producto[j][3]);
                                    suma  = suma + 1;
                                    producto[j][3] = Integer.toString(suma);
                                    //System.out.println(producto[j][1] +" "+producto[j][3]);
                                }
                            }
                            
                    }else if (opcion == 6){
                        //visualizarPS();
                        pagar();
                    }
        }while(opcion != 7);
    }

    public static void visualiza(){
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
        int suma = 0, multiplicacion = 0, numero = 0, cantidad= 0;
        Cajero cajero;
        System.out.println("Codigo "+" "+" nombre");
        for (int i = 0; i < carritoList.size(); i++){

            for (int index = 0; index < carritoList.size(); index++) {
                if(carritoList.get(i).getNombre().equals( carritoList.get(index).getNombre())){
                    System.out.println("repite");
                }
            }
            System.out.println(carritoList.get(i).getCodigoBar()+"    "+carritoList.get(i).getNombre());
            for (int j = 0; j < producto.length; j++) {
                cantidad = Integer.parseInt(producto[j][3]);
                if (producto[j][1].equals(carritoList.get(i).getNombre()) && cantidad >= 1 ){
                    numero = Integer.parseInt(producto[j][3]);
                    multiplicacion = carritoList.get(i).getPrecio();
                    suma = suma + multiplicacion;
                }
            }
        }
        System.out.println("helo "+suma);
        cajero = new Cajero(suma);

        cajero.ticket();
    }
}
