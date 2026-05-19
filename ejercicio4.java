import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] mascotas = new String[4][4];

        System.out.println("Ingresa 16 nombres de mascotas:");
        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 4; j++) {
                System.out.print("mascota[" + i + "][" + j + "]: ");
                mascotas[i][j] = sc.next();
            }

        System.out.println("\nFilas y columnas con índices impares:");
        for (int i = 1; i < 4; i += 2) {
            for (int j = 1; j < 4; j += 2)
                System.out.print(mascotas[i][j] + "\t");
            System.out.println();
        }

        sc.close(); //
    }
}