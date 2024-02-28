package EjerciciosGitHub;
import java.util.Scanner;

/********************************************************************************************************
@author Álvaro Comenge

@fecha 27/2/24

@Descripción: Hacer un programa que elimine todas las ocurrencias de una subcadena dentro de una cadena.
*******************************************************************************************************/



public class CadenasPrg_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese texto");
        String ejemplo = sc.nextLine();

        System.out.println("Ingrese subcadena a buscar");
        String entrada = sc.nextLine();

        if (ejemplo.indexOf(entrada) != -1) {
            ejemplo = ejemplo.replaceAll(entrada, "");
            System.out.println(ejemplo);
        } else {
            System.out.println("Esa subcadena no se encuentra aqui");
        }
    }
}

