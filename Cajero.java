import java.util.List;

public class Cajero  {
    static int total;

    public Cajero(int total){
        this.total = total;
    }

    public static void ticket() {
        System.out.println("el precio a pagar es de: " + total);
    }

}
