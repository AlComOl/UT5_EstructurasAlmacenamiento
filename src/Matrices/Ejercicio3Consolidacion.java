package Matrices;
import java.util.*;

public class Ejercicio3Consolidacion {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int alumnos[][]= {{2,2,3,4},{1,2,3,4},{1,2,3,4}};
		int sumCol[]=new int [4];
		
		
		alumnosPorAsignatura(alumnos,sumCol);
		
		obtenerArray(sumCol);
	}
//estaba errando la condicion del 1º bucle alumnos[0].length esto es lo que determinabva lo que sumamos
	public static void alumnosPorAsignatura(int alumnos[][],int sumCol[]) {
		/******************************************************************
		 * @author acome
		 * 
		 * @param matriz
		 * 
		 * @array cada elemnto es la suma de las columnas
		 * 
		 * ******************************************************************/
		int rdo=0;
		
		for(int i=0;i<alumnos[0].length;i++) {//manejas la filas
				
			for(int j=0;j<alumnos.length;j++) {//maneja las columnas
				
				sumCol[i]+=alumnos[j][i];
				
			}
			
		}
		 
	}
	
	public static void obtenerArray(int sumCol[]) {
		/**************************************
		 * @author acome
		 * @param array con em mismo tamaño 
		 * que las columnas de la matriz
		 * 
		 * Muestra valores del array
		 ****************************************/
	   
	    for (int i = 0; i < sumCol.length; i++) {
	    	 
	    	System.out.print(sumCol[i]+" ,");
	    	  
	       }
	      
	    }
	}

