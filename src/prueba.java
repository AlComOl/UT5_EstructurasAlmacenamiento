
import java.util.*;

public class prueba{

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int v1[] = {2, 4, 6, 8, 10, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}; // tamaño 20
    int n, n1, n2 = 0, c_pos = 6; // inicializar c_pos en 6, ya que inicialmente hay 6 elementos en el vector

    do {
        System.out.println("\n 1.- introducir un elemento en el vector: " + "\n 2.- buscar un elemento" + "\n Elige opcion");
        n = sc.nextInt();

        switch (n) {
            case 1:
                System.out.println("Introducir valor en el vector:");
                n2 = sc.nextInt();
                if (c_pos >= v1.length) {
                    System.err.println("El vector está lleno");
                } else {
                    insertar(n2, v1, c_pos);
                    c_pos++; // Incrementar c_pos después de insertar el valor
                    for (int i = 0; i < v1.length; i++) {
                        System.out.print(v1[i] + " ,");
                    }
                }
                break;
            case 2:
                // Implementar la funcionalidad de búsqueda
                break;
            default:
                break;
        }
    } while (n != 0);
}

public static void insertar(int n, int v1[], int c_pos) {
    int i;
    for (i = c_pos - 1; i >= 0 && v1[i] > n; i--) {
        v1[i + 1] = v1[i];
    }
    v1[i + 1] = n;
}
}
