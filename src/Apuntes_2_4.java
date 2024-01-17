import java.util.Scanner;

//import java.util.*;

public class Apuntes_2_4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		Iniciar vectores 
//		int v=100;
//		
//		byte[] temperatura=new byte[v];
//		
//		for(int i=0;i<temperatura.length;i++) {
//		System.out.println(temperatura[i]);}
//		String nombres[]=new String[6];
//		double notas[]=new double[4];
//		para Strings 
//		for ( int b=0;b<4;b++) {
//			System.out.println("Introduce");
//			notas[b]=sc.nextDouble();
//		}
//		para interos
//		for(int c=0;c<6;c++) {
//			System.out.println("introduce Enteros");
//			notas[c]=sc.nextInt();
//		}
		
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
		
//		for(int i=nombres.length/2;i<nombres.length;i++) {
//			System.out.println(nombres[i]);
//		}
//De todos los elementos del vector, del final al principio
//		 final int nNotas=6;
		
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
		
//		for(int i=notas.length-1;i>notas.length/2-1;i--) {
//			System.out.println(notas[i]);
//		}
	

//int alum_nota=0;
//final int NUM_ALUM=4;
//boolean encontrado = false;
//int alum=4;
//double nota_bus=3;
//while (alum < NUM_ALUM && encontrado == false)
//if (nota_bus == notas[alum]) { /* encuentra un alumno con la nota */
//encontrado = true; /* terminar búsqueda, podría hacerse con un break*/
// alum_nota= alum; /* guardo el alumno que la tiene */
//}
//else alum++; /* si no lo encuentra mirar al siguiente */
//if (encontrado == true) System.out.println ("El alumno con nota "+ nota_bus+ " es "+ alum_nota);
//else System.out.println ( "NO EXISTE ALUMNO CON LA NOTA "+ nota_bus);

//		String smr1[]=new String[20]; 
//	
//		for (int i=0;i<smr1.length;i++) {
//			 System.out.println("Introcuce nombres");
//			 smr1[i]=sc.next(); 
//		}
//		for(int i=0;i<smr1.length;i++) {
//			System.out.println(smr1[i]);
//		}
		int usuario []= {1,2,3,4,5,6};
		
		usuario[2]=500;
		
		System.out.println(usuario[2]);
		}
	  }
		