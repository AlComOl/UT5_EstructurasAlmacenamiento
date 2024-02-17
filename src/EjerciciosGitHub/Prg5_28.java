package EjerciciosGitHub;
import java.util.*;
/**************************************************************************************************
 * 
 * @author Álvaro Comenge
 * 
 * @Fecha 17/02/24
 * 
 * @descripcion 
 *  Se desean eliminar los espacios en blanco de una frase dada terminada en un punto.
 *  Realizar un programa que lea la frase y que posteriormente la imprima sin los espacios en blanco.
 *  
 * ***************************************************************************************************/
public class Prg5_28 {

	public static void main(String[] args) {
		String sinespacios;
		String frase="El Instituto IES Fuente de San Luis esta en Valencia.";
		
		sinespacios=reemplazar(frase);
		
		System.out.println(sinespacios);
		
		
		
		

	}
	
	
		public static String reemplazar(String frase) {
			/********************************************************
			 * @author acome
			 * @param frase
			 * @descripcion quita caracter de espacios con replaceAll
			 * ******************************************************/
			
			frase=frase.replaceAll(" ", "");
			
			return frase;
			
		}

}
