import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Puntos del cliente: ");
        int puntos = sc.nextInt();
        if (puntos < 1000)        System.out.println("Cliente Bronce");
        else if (puntos <= 3000)  System.out.println("Cliente Plata");
        else                      System.out.println("Cliente Oro");
    }
}