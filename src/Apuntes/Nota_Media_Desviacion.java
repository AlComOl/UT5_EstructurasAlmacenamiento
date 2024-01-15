package Apuntes;
import java.util.*;
//2. Realiza un programa que acepta una nota de cada uno de los alumnos de un grupo, calcula la media y
//visualiza la desviación de las notas de cada alumno respecto a la media de clase:
public class Nota_Media_Desviacion {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		final int NumeroAlumnos=5;
		float suma=0,media=0,desviacion=0;
		float notas[]=new float[NumeroAlumnos];
		
		for(int i=0 ; i<NumeroAlumnos;i++) {
			System.out.println("Introduce numero");
			notas[i]=sc.nextFloat();
			suma+=notas[i];
		}

		media=suma/(float)NumeroAlumnos;
		
		System.out.println(media);
		for(int z=0;z<NumeroAlumnos;z++) {
			
		desviacion=media-notas[z];
		
		System.out.println(" \n La nota :"+notas[z] +"tiene una desviacion respecto la media de :"+desviacion);
		}
		
		
	}

}
