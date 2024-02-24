
package RepasoArrayListCadenas;

import java.util.ArrayList;
import java.util.*;
import java.util.Iterator;

public class ClaseArrayList {
	   

    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	
///////////////////Declarar un arrayList/////////////////////////

/*Los arrayList se pueden declarar sin especificar el tipo de dato pero no es recomendable*/
        ArrayList nombreArray=new ArrayList();
/*Declararlo especificando el tipo de dato*/
        ArrayList<String> daw1=new ArrayList<String>();
    /*declarara  tipoDato   NombreArrayList    */
        
/*para ver el tamaño del arraylist meter dentro de una variable*/
        
       int nElemnetos=daw1.size();
       
       
/*añadir elementos al arrayList*/
       		
       daw1.add(0,"juan");
       daw1.add(1, "jose");
       
     
/*añadir elementos en una posicion especifica*/
       /*esto se puede hacer si al arrayList esta ya definido con las posiciones llenas o nulas*/
       
//       daw1.add(5,"Jose");
 
       
/*Obtener un elemento de la colleccion*/
       
       daw1.get(0);
       System.out.println(daw1.get(1)); 
       
/* Eliminar un elemento de la coleccion*/
       
//       daw1.remove(1);
     
     
     
/*Eliminar todos los elementos de la coleccion*/
     
//     daw1.clear();
     
     
/*Modificar el elementos de una posicion por otro elemento*/
     
     daw1.set(1,"Alvaro");
     System.out.println(daw1);
     
     if(daw1.contains("Alvaro")) {
    	 System.out.println("se ha encontrado el elemento");
    	 
     } 
/////////////////////////////////RECORRER ARRAYSLIST////////////////////////
    	 
    	 /*Con un bucle for*/
    	 System.out.println("******************FOR****************");
    	 for(int i=0;i<daw1.size();i++) {
    		 System.out.println(daw1.get(i));
    	 }
    	 /*Con un bucle foreach*/
     
     System.out.println("******************FOREACH****************");
    	 for(String elementos:daw1) {//tipo|| variable que representa el elemento || nombreArray
    		 
    		 System.out.println(elementos);
    	 }
    	 
/**Si el array contiene obgetos de distintos tipos o desconocemos el tipo*/
    	 
    	 System.out.println("******************object***************");
    	 
    	 for(Object o:daw1) {
    		 System.out.println(o); 
    	 }
    	 
 /////////////////////////////////ITERATOR///////////////////////////
    	 /*Un  Iterator en Java es una interfaz que proporciona un mecanismo para recorrer secuencialmente los elementos de
    	 una colección. Permite iterar sobre una colección (como un  ArrayList, un HashSet, etc.) y acceder a sus elementos de
    	  manera ordenada, uno por uno.*/
    	System.out.println("****************************************ITERATOR***************************************"); 
    	 Iterator it= daw1.iterator();//hay que crear un Iterator para el array.
    	 /*La funcion de hasNext es verificar si hay mas elementos sobre en la coleccion que esta iterator iterando(devuelve true o false)*/
    	 while(it.hasNext())//hasNext lo que hace es para el bucle si no hay mas elementos
    	 System.out.println(it.next());//next lo que hace es mostrarlos.
    	 
    	 
////////////COPIAR ARRAY LIST/////////////////////////////////////////////////////////
    	 System.out.println("*****************************COPIAR ARRAY LIST***************************************");
    	 ArrayList<String> daw=new ArrayList<String>(daw1);
    	 
    	 for(String elemento:daw) 
    	 
    	 System.out.println(daw);
    	 
    	 System.out.println("Esta clonando daw1 en daw2");
    	System.out.println(clone(daw1));
    	 }
    public static Object clone(ArrayList<String> daw1) {
	   	 ArrayList<String> daw2 = new ArrayList<String>();
	   	 daw2=(ArrayList<String>) daw1.clone();
	   	 
	   	 return daw2;

	}
     	 
   
}
 

