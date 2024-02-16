package Practica140224;
import java.util.*;
import java.util.Arrays;
import java.util.Random;
/********************************************************************
 * @author Álvaro Comenge
 * 
 * Practica Arrays Matrices Poliedros
 * 
 * Fecha 14/02/24
 ********************************************************************/
public class Tarea1 {

	public static void main(String[] args) {
		

	
		 
		        Scanner sc = new Scanner(System.in);
		        Random random = new Random();
		        
		        String continuar;
		        
		        do {
		            int num1[] = generarNumeroAleatorio(random);
		            int num2[] = generarNumeroAleatorio(random);
		            
		            mostrarNumeros(num1);
		            mostrarNumeros1(num2);
		            
		            int suma[] = sumarNumeros(num1, num2);
//		         
		            mostrarsuma(suma);
		            
		            System.out.println("Desea continuar? (s/n)");	           
		           continuar = sc.nextLine();//lo hago con char para no tener problemas con el next line
		           
		        } while (continuar.equalsIgnoreCase("s"));
		        
		        
		    }
		    
		    public static int[] generarNumeroAleatorio(Random random) {
		    	/*******************************************************
		    	 * @author Alvaro Comenge 
		    	 * 
		    	 * Genera un numero random pasandole random
		    	 * 
		    	 * Números aleatorios de 0 a 9
		    	 ******************************************************/
		        int numero[] = new int[4];
		        for (int i = 0; i < numero.length; i++) {
		            numero[i] = random.nextInt(10);  
		        }
		        return numero;
		    }
		    
		    public static void mostrarNumeros(int num1[]) {
		    	 /***************************************************
				    * @author Alvaro Comenge
				    * 
				    * Muestra num1 
				    * 
				    * ************************************************/
		        for (int i=0;i<num1.length;i++) {
		        
		                System.out.print(num1[i] + " ");
		            
		            }
		            System.out.println();
		        }
		    public static void mostrarNumeros1(int num2[]) {
		    	 /***************************************************
				    * @author Alvaro Comenge
				    * 
				    * Muestra num2
				    * 
				    * ************************************************/
		        for (int i=0;i<num2.length;i++) {
		        
		                System.out.print(num2[i] + " ");
		            
		            }
		            System.out.println();
		        }
		    public static void mostrarsuma(int suma[]) {
		   /***************************************************
		    * @author Alvaro Comenge
		    * 
		    * Muestra numeros sumados 
		    * 
		    * ************************************************/
		    	System.out.println("--------------");
		        for (int i=0;i<suma.length;i++) {
		        
		                System.out.print(suma[i] + " ");
		            
		            }
		            
		        }
		  
		    
//		  
		    
		    public static int[] sumarNumeros(int[] num1, int[] num2) {
		    	/**********************************************************
		    	 * @author Alvaro Comenge
		    	 * 
		    	 * Suma los numero num1 num2
		    	 * 
		    	 * 
		    	 * 
		    	 * 
		    	 * ********************************************************/
		        int suma[] = new int[4];
		        int acarreo = 0;
		        for (int i = num1.length - 1; i >= 0; i--) {//no lo tengo muy claro 
		            int sum = num1[i] + num2[i] + acarreo;
		            suma[i] = sum % 10;//el resto en el vector
		            acarreo = sum / 10;//el res de dicision al accareo para sumar siguiente
		        }
		        
		        if (acarreo > 0) {//si lo suma y lleva de atras(acarreo)
		            int sumaConAcarreo[] = new int[5];//vector nuevo donde metemos el numero mas grande
		            
		            sumaConAcarreo[0] = acarreo;//metemos en primer lugar el res division
		            for(int i=1;i<suma.length;i++) {// iteramos
		            	 sumaConAcarreo[i] = suma[i-1];//el error lo tenia aqui 
		            }
		           
		            suma= sumaConAcarreo;
		            
		        }
		        return suma;
		    }
		

	}


