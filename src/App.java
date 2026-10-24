import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int cantidad_xiomi = 0;
        int cantidad_iphone = 0;
        int cantidad_samsung = 0;
        Scanner sc = new Scanner(System.in);
        

        for (int index = 1; index <= 20; index++) {
            int opcion = 0;
            System.out.println ( "Seleccione el producto que desea comprar: 1 para Xiomi 18 Fold. 2 para Iphone Duo. 3 para Samsung Fold 8");
            System.out.print("Escriba la opción: ");
            opcion = sc.nextInt();
            if ( opcion == 1) {
             System.out.print("Gracias por comprar Xiomi: ");    
                cantidad_xiomi++;
            } else if (opcion == 2) {
             System.out.print("Gracias por comprar Iphone: ");   
                cantidad_iphone ++;
            } else if (opcion == 3) {
              System.out.print("Gracias por comprar Samsung: ");  
                cantidad_samsung ++;
            } else {
                System.out.println ("No contamos con esa referencia");
            }
            
        }
        System.out.println("Ventas del Xiomi 18 Fold: " + cantidad_xiomi);
        System.out.println("Ventas del Iphone Duo: " + cantidad_iphone);
        System.out.println("Ventas del Samsung Fold 8: " + cantidad_samsung);

        sc.close();
    }

}
