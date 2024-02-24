package RepasoArrayListCadenas;
import java.util.*;

public class ClaseHasSet {

	public static void main(String[] args) {
//		Creamos hashSet de Strings
		HashSet<String> haset=new HashSet<String>();
		
//		Agregamos cadenas a la coleccion o hasset
		
		haset.add("Pepe");
		haset.add("Jose");
		haset.add("luis");
		
//Iteramos sobre el elemento de hashset y metemos dentro de un array los elementos
		String contiene[]=new String[haset.size()];
		int index=0;
		for(String elementos : haset) {
		/*String tipo de dato*/
		/*elementos contendra el valor del elemento actual de haset*/
		/*Haset es el objetos que hemos creado y que iteramos sobre el */	
		
		
		contiene[index++]=elementos;
		}
//		for(int i=0;i<contiene.length;i++) {
			
		System.out.println(Arrays.toString(contiene));
//		}
	}

}
