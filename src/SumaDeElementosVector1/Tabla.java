package SumaDeElementosVector1;
/**************************************************
 * Autor: Álvaro Comenge
 * 
 * Entornos de Desarrollo
 * 
 * Version Emiliano Suma de elementos de un Vector
 * 
 * Fecha 1/01/24
 *
 ***************************************************/
import java.util.Scanner;

public class Tabla {

    Scanner sc = new Scanner(System.in);
    private int[] v;

    public Tabla(int n) {
        v = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Dame un entero");
            v[i] = sc.nextInt();
        }
    }

    public int tamanyo() {
        return v.length;
    }

    public int getValor(int i) {
        int valor = 0;
        if (i >= 0 && i < v.length) {
            valor = v[i];
        }
        return valor;
    }
//si no pongo esta funcion me da error
	public void mostrar() {
		
		
	}

}

