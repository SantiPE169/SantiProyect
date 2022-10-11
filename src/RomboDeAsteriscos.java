import java.util.Scanner;

public class RomboDeAsteriscos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        //pedir numero de base por pantalla
        int alto = sc.nextInt();
        //hacer bucle desde la base hacia arriba
        for (int i = 0; i < alto; i++) {
            for (int k = 0; k < alto - i - 1; k++) {
                System.out.print(" ");
                //desde el bucle hacemos que cada vez que pase por él haga un espacio
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print(" *");
                //hacemos que ponga el espacio asterisco las veces que se le indica
            }

            System.out.println("");
            //cada vez que haga esto se baja una línea

        }

        int bajo= alto;
        //hacemos que para abajo sea lo mismo que para arriba, solo que esta ya empieza por uno para saltar una línea
        for(int i=1; i<bajo;i++) {

            for(int k=0; k<i;k++){
                System.out.print(" ");
            }
            for(int j=0;j<bajo-i;j++){
                System.out.print(" *");
            }

            System.out.println("");
        }
    }
}