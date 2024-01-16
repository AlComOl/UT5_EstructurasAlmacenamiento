import java.util.*;

public class Apuntes_2_4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String nombres[]=new String[5];
		int notas[]=new int[6];
//		para Strings 
//		for (int b=0;b<5;b++) {
//			System.out.println("Introduce");
//			nombres[b]=sc.next();
//		}
//		para interos
		for(int c=0;c<6;c++) {
			System.out.println("introduce Enteros");
			notas[c]=sc.nextInt();
		}
		
//		for(int b=0;b<nombres.length;b++) {
			
//		System.out.println(nombres[3]+",");
//		}

	
	
//	POSICIONES ALTERNATIVAS DE PRINCIPIO A FIN 
	
//	for( int i =1 ;i<nombres.length;i+=2) {
//		
//		System.out.println(nombres[i]);
//	}
	
//Los elementos de la mitad izquierda, de principio a fin
	
//		for(int i = 0 ; i<nombres.length/2;i++) {
//			System.out.println(nombres[i]);
//		}
//Los elementos de la mitad derecha, de principio a fin	
		
//		for(int i=nombres.length/2+1;i<nombres.length;i++) {
//			System.out.println(nombres[i]);
//		}
//De todos los elementos del vector, del final al principio
		 final int nNotas=6;
		
//		for (int i=notas.length-1;i>=0;i--) {
//			System.out.println(notas[i]);
//			
		
//Posiciones alternativas, del final al principio
		
//		for(int i= notas.length-1;i>=0;i=i-2) {
//			System.out.println(notas[i]);
//		}
//Los elementos de la mitad izquierda, del final al principio
//		Notas.length-1 porque la dimension del array es uno mas que las posiciones.
//		for(int i=notas.length/2-1;i>=0;i--) {
//			System.out.println(notas[i]);
//		}
		
//Los elementos de la mitad derecha, del final al principio
		
		for(int i=notas.length-1;i>notas.length/2-1;i--) {
			System.out.println(notas[i]);
		}
	  }
	}

