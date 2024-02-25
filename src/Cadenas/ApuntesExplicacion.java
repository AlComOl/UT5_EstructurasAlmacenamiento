package Cadenas;
import java.util.*;

public class ApuntesExplicacion {

	public static void main(String[] args) {
	/*Características Generales: Una cadena de caracteres es una secuencia finita de 
	* caracteres. Pueden contener letras, dígitos y caracteres especiales como espacios
	* o símbolos. Se representan encerradas entre comillas dobles y su longitud se mide 
	* por la cantidad de caracteres que contienen.*/	
		
//		DECLARACION DE CADENAS
		
		String cadena1="Hola";
		String cadena2="Mundo";
		
		String concadenada=cadena1+" "+cadena2;
		System.out.println(concadenada);
//		OBTENER LA LONGITUD DE UNA CADENA
		int longitud=concadenada.length();
		System.out.println(longitud);

//		OBTENER UN CARACTER EN LA POSICION ESPECIFICADA
		int segundocaracter=concadenada.charAt(1);
		System.out.println("(o) en la tabla ASCII "+segundocaracter);
		
//		ENCONTRAR EL INDICE DE UN CARACTER O SUBCADENA
//		busca la primera occurrencia (la primera vez que aparece el caracter en este caso)
		int indexof =concadenada.indexOf("n");
		System.out.println(indexof);
		
//		REMPLAZAR CARACTERES
/*       concatenada: Es una cadena de texto en la que deseas realizar el reemplazo.

		replace("Mundo", "Gente"): Este método toma dos argumentos. El primer argumento, 
		"Mundo", es la subcadena que deseas reemplazar dentro de la cadena concatenada.
		 El segundo argumento, "Gente", es la subcadena con la que deseas reemplazar todas
		 las ocurrencias de la subcadena "Mundo".*/
		
		String reemplaza=concadenada.replace("Mundo", "Gente");
		System.out.println(reemplaza);
		
//		COMVERTIR EN MAYUSCULAS
		String convierteMayusculas=concadenada.toUpperCase();
		System.out.println(convierteMayusculas);
//		CONVERTIR EN MINUSCULAS
		
		String convierteMinusculas=convierteMayusculas.toLowerCase();
		System.out.println(convierteMinusculas);
		
		
//		MANIPULACION DE CADENAS CON STRINGBUILDER
		/*append(" Mundo"): Este método agrega el texto " Mundo" al final del StringBuilder,
		 *extendiendo la cadena existente. Después de esta operación, el StringBuilder contendrá
		 *"Hola Mundo".*/
		System.out.println("*********************StringBuilder*****************************");
//		para aplicar cualquiera de ellos hay que instanciar el objeto
		StringBuilder alvaro=new StringBuilder("Hola");
//		APPEND INSERTA AL FINAL
		alvaro.append("Mundos");
		System.out.println(alvaro);
		
//		INSERT LO INSERTA EN UNA POSICION ESPECIFICA
		alvaro.insert(4," a todos los ");
		System.out.println(alvaro);
//		BORRAR CARACTERES EN UN RANGO
		alvaro.delete(5, 16);
		System.out.println(alvaro);
//		REMPLAZA CARACTERES EN UN RANGO
//		primer numero es donde empieza a reemplazar hasta el 2 numero donde termian palabra que cambia
		alvaro.replace(7, 13,"Gente");
		System.out.println(alvaro);
//		el método toString muestra el resultado.
		System.out.println(alvaro.toString());
	
	
//	DIVISION DE CADENAS STRINGTOKENICER
	/*este código divide una frase en palabras y las imprime una por una en líneas separadas.
	*Es una forma útil de separar una cadena de texto en palabras individuales para su procesamiento posterior.*/
	
	System.out.println("**************************STRINGTOKENICER***********************************");
	String frase="Bienvenido a la programacion en java";
//	divide la frase en palabras
	StringTokenizer separacion=new StringTokenizer(frase);
	System.out.println(frase);
	while (separacion.hasMoreTokens()) {
        System.out.println(separacion.nextToken());
        
	}
        System.out.println("******************Ejemplo de cadena dividida*****************");
        
//  STRINGBUFFER       StringBuffer reverse()

        String strMain = "Alfa, Beta, Delta, Gamma, Sigma";
        String[] arrSplit = strMain.split(",");
        for (int i = 0; i <arrSplit.length; i++) {
        System.out.println(arrSplit[i]);
        }
        System.out.println("***********************************");
        /*Ejemplo: método Java string split () con expresiones regulares y longitud
		Considere una situación en la que solo necesita los primeros elementos ‘n’ después de la
		operación de división, pero quiere que el resto de la cadena permanezca como está. Un resultado
		como este-*/
        String[] arrSplit_2 = strMain.split(",", 3);
        for (int i = 0; i < arrSplit_2.length; i++) {
        System.out.println(arrSplit_2[i]);
        }
        
        System.out.println("***********************************");
        String strMain_1 = "Bienvenido a Guru99";
        String[] arrSplit_3 = strMain_1.split("\\s");
        for (int i = 0; i < arrSplit_3.length; i++) {
            System.out.println(arrSplit_3[i]);
        }
        	
        	
        
		
		
	}
}