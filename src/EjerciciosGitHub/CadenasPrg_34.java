package EjerciciosGitHub;
import java.util.*;
/************************************************************************
 * @author Álvaro Comenge 
 * 
 * @fecha 27/2/24
 * 
 * @descripcion Realiza una función que convierta una cadena en número y 
 * otra que convierta un número en cadena.
 * 
 * *********************************************************************/
public class CadenasPrg_34 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu;

        do {
            getMenu();
            menu = sc.nextInt();
            switch (menu) {
                case 1:
                   System.out.println(numeroACadena(sc)); 
                   break;
                case 2:
                	System.out.println(deCadenaANumero(sc));
                    break;
                
            }
        } while (menu != 0);
    }
    /*******************************
     * @descripcion es el menu
     * 
     **********************************/
    public static void getMenu() {
        System.out.println("1. Convertir un numero a cadena");
        System.out.println("2. Convertir una cadena a numero");
        System.out.println("0. Salir");
    }
    /****************************************************
     * @param scanner
     * @return cadena
     * @descripcion  con el metodo valueOf()pasamos el numero a cadena
     ****************************************************/
    public static String numeroACadena(Scanner sc) {
    	int numero=0;
    	String cadena;
    	 System.out.println("Dame el numero");
         numero = sc.nextInt();
     
         cadena = String.valueOf(numero);
        
    	return cadena;
    }
    
    /****************************************************
     * @param scanner
     * @return numero
     * @descripcion //Si introducimos una cadena para convertirla en numero
     *  lo que ocurre es que lanza un excepcion.
     *  try {//la manera de manejarla es try cach que es como si fuera un condicional
     *  catch (NumberFormatException e) {//si lanza un excepcion devuelve un error 
     ****************************************************/
    public static int deCadenaANumero(Scanner sc) {
    	String cadena;
    	int numero = 0;
    	 System.out.println("Dame la cadena");
         cadena = sc.next();
        
          
         try {//sino hay excepción
             numero = Integer.valueOf(cadena);

             System.out.println("la cadena String que hemos introducido ahora es un numero integer " + numero);
            
         } catch (NumberFormatException e) {//Si hay excepción 
             System.out.println("Error: La cadena no se puede convertir a numero");
         }
    	
    return	numero;
    }
}
