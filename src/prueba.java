import java.util.Scanner;

public class Ej_6 {
    /*
     * @author: Francisco Verdeguer García
     * @version: 17/01/24
     * @description:Programa que lea un número positivo de 10 cifras y 
        compruebe si es capicua utilizando un vector de números  
        enteros de 10 componentes. Valida la entrada.
    */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        long vector[] = new long[10];
        boolean numCapi = false; 
        int i=0,j=0;
        long n1, aux;

        System.out.println("Ingresa el numero");
        n1 = tec.nextLong();
        aux = n1;
        for (int k = 0; k < vector.length; k++) {
            if(n1>0){
                vector[k] = n1%10;
                n1/=10;
                j++;
            }
        }

        while (i<j && numCapi == false) {
            if (vector[i] == vector[j-1]) {
                i++;
                j--;
            } else {
                numCapi = true;
            }
        }

        if (numCapi == true) {
            System.out.println("El numero " + aux + " no es capicua");
        } else {
            System.out.println("El numero " + aux + " es capicua");
        }

        tec.close();
    }
}