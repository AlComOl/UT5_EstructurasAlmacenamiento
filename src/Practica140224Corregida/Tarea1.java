package Practica140224Corregida;

import java.util.*;

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
		

	
		 
		        Scanner scanner = new Scanner(System.in);
		        Random random = new Random();
		        int numeroIntroducido[]=new int[5];
		        int suma[]=new int[5];
		        
		        char continuar;
		        
		        do {
		            int num1[] = generarNumeroAleatorio();
		            int num2[] = generarNumeroAleatorio();
		            
		            
		            mostrarsuma(num1);
		            
		            mostrarsuma(num2);
		            
		            
		            introduceNumero(numeroIntroducido,scanner);
		           
		            
		            
		            suma=sumarNumeros(num1,num2);
		            
		            mostrarsuma(suma);
		            
		            comprobar(suma,numeroIntroducido);
		           
		          
		            
		            System.out.println("¿Desea continuar? (s/n)");	           
		           continuar = scanner.next().charAt(0);//lo hago con char para no tener problemas con el next line
		        } while (continuar == 's');
		        
		        scanner.close();
		    }
			/*******************************************************
			 * @author Alvaro Comenge 
			 * 
			 * Genera un numero random pasandole random
			 * 
			 * Números aleatorios de 0 a 9
			 ******************************************************/
			public static int[] generarNumeroAleatorio() {
			    int numero[] = new int[4];
			    for (int i = 0; i < numero.length; i++) {
			        numero[i] = (int) (Math.random() * 10);  
			    }
			    return numero;
			}
				    
		    public static void mostrarNumeros(int num[]) {
		    	 for (int i=0;i<num.length;i++) {
				        
				                System.out.print(num[i] + " ");
				            
				            }
				            System.out.println();
		    }
		    /***************************************************
		    * @author Alvaro Comenge
		    * 
		    * Muestra numeros sumados 
		    * 
		    * ************************************************/
		    public static void mostrarsuma(int suma[]) {
		   
		    	
		        for (int i=0;i<suma.length;i++) {
		        
		                System.out.print(suma[i] + " ");
		            
		            }
		            System.out.println("\n");
		        }
		    
		    public static void comprobar( int suma[],int numeroIntroducido[]) {
		    	
		    	if(Arrays.equals(suma, numeroIntroducido)) {
		    		
		    		System.out.println("Los numeros son igules");
		    		
		    	}else {
		    		System.out.println("Los numeros no son iguales");
		    		
		    	}
		    	
		    	
		    	
		    	
		    }
		    
		    public static void introduceNumero(int numeroIntroducido[],Scanner sc) {
		    	
		    	 
		    	 for(int i=0;i<numeroIntroducido.length;i++) {
		    		 System.out.println("Introduce numero");
		    		 numeroIntroducido[i]=sc.nextInt();
		    		 
		    	 }
		    }
		  
		    /**********************************************************
	    	 * @author Alvaro Comenge
	    	 * 
	    	 * Suma los numero num1 num2
	    	 * 
	    	 * 
	    	 * 
	    	 * 
	    	 * ********************************************************/	
		    public static int[] sumarNumeros(int[] num1, int[] num2) {
		    	
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
		            for(int i=0;i<suma.length;i++) {// iteramos
		            	 sumaConAcarreo[i+1] = suma[i];//el error lo tenia aqui 
		            }
		           
		            suma= sumaConAcarreo;  
		        }
		       return suma;
		    }
		

	}

		

	
