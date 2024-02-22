package EjerciciosGitHub;
import java.util.*;
/***************************************************************************
 * @autor Álvaro Comenge
 * 
 * @fecha 21/02/24
 * 
 * @descripcion Ingresar una frase y modificarla convirtiendo el primer carácter
 *  de cada palabra si esta fuera una letra, de minúsculas a mayúsculas.
 * 
 * 
 * *************************************************************************/
public class CadenasPrg_10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduce la frase");
		String frase=sc.nextLine();
		
	System.out.println(aMayuscula1caracter(frase));
		sc.close();
	}

	
	public static String aMayuscula1caracter(String cadena) {
		/******************************************************
		 * @author acome
		 * @param cadena frase que introducimos por teclado
		 * 
		 * @descripcion conviete las primeras letras de cada plabra 
		 * a mayuscula 
		 * 
		 * 
		 * 
		 * ****************************************************/
	    StringBuilder cadenaMayusculas = new StringBuilder();
	    boolean primeraLetra = true; // Bandera para indicar si es la primera letra de una palabra
	    
	    for (int i = 0; i < cadena.length(); i++) {
	        char caracterActual = cadena.charAt(i);
	        
	        if (primeraLetra==true) {
	            cadenaMayusculas.append(Character.toUpperCase(caracterActual)); // Convertir la primera letra a mayúscula
	            primeraLetra = false; // Cambiar el estado 
	        } else {
	            cadenaMayusculas.append(caracterActual); // Mantener el carácter tal como esta
	        }
	        
	        // Verificar si el carácter actual es un espacio en blanco o un carácter de puntuación
	        if (Character.isWhitespace(caracterActual) || Character.isWhitespace(caracterActual)) {
	            primeraLetra = true; // Establecer la bandera en verdadero para la próxima letra
	        }
	    }
	    
	    return cadenaMayusculas.toString();
	}
		
		
}
