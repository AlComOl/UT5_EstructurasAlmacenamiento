package Apuntes;
import java.util.*;
public class InicializarVector {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
//		Con una constante que ponemos dentro del vector
		final int NumeroPoscionesvector=10;
		
		int v[]=new int [NumeroPoscionesvector];
		
//		con un numero lo ponemos dentro del vector tenimos las posiciones del vector
//		el vector empieza a contar desde o , si tenemos 10 posiciones la posicion 1 sera la 0 
		
//		int a []=new int[10];

	
//	para ver la posiciones del vector lo veremos con un FOR
//	for(int i=0;i<10;i++) {
//		System.out.println(a[i]);
//	}
	
// para meter numero dentro del vector lo haremos con un FOR
//	int n[]=new int[10];
//	for(int y=0;y<10;y++) {
//		System.out.println("Introcuce numero");
//		
//		 n[y]=sc.nextInt();
//	}
//sacariamos de nuevo lo del intector del vector
//	for(int z=0;z<10;z++) {
//		
//		System.out.println(n[z]);
//	}
	
//	podemos iniciar un vectror que es un String con nombres 
	
	String nombres[]=new String[5];
	
	for (int b=0;b<5;b++) {
		System.out.println("Introduce");
		nombres[b]=sc.next();
	}
	
	for(int b=0;b==2;b++) {
		
	System.out.println(nombres[b] +",");
	}
	
	
}
}