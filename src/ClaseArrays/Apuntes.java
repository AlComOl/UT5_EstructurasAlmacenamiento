package ClaseArrays;
import java.util.*;
import java.util.Arrays;

public class Apuntes {

	public static void main(String []args){
		Vector v4=new Vector();
		int [] v1 = {8, 5, 6, 2, 7};
		int [] v2 = {8, 5, 6, 2, 7};
		int [] v3 = {8, 5, 6, 2, 7};
		int [][] m1 = {{8, 5, 6, 2, 7},
		{8, 5, 6, 2, 7}};
		Arrays.sort(v1);//Ordena elementos del array
		System.out.println(Arrays.toString(v1));//lo muestra con toString
		Arrays.sort(m1[0]);
		System.out.println(Arrays.toString(m1[0]));
		Arrays.sort(v2);
		if (Arrays.equals(v1, v2))//compara los arrays 
		System.out.println("Iguales");
		else
		System.out.println("No iguales");
		v2=v1;
		if (Arrays.equals(v1,v2))
		System.out.println("Iguales");
		else
		System.out.println("No iguales");
		Arrays.fill(v3,10);//llena el array con el elemento en 2 posicion 10 
		System.out.println(Arrays.toString(v3));
		if (Arrays.binarySearch(v1, 6)>=0)
		System.out.println("EStá el valor");
		else
		System.out.println("EStá el valor");
		if (Arrays.binarySearch(v1, 9)>=0)
		System.out.println("EStá el valor");
		else
		System.out.println("NO está el valor");
		
		
//		for(int i=0; i<v4.size(); i++){
//			System.out.print(v4.elementAt(i)+"\t");
//			}
//			for(String x: v4){
//			System.out.print(x + "\t");
//			}
		}

}
