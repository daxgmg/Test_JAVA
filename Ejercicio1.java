import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Correctas: ");   int c = sc.nextInt();
        System.out.print("Incorrectas: "); int i = sc.nextInt();
        System.out.print("Vacías: ");      int v = sc.nextInt();
        System.out.println("Puntaje: " + (c * 5 + i * -2));
    }
}