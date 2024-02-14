package Practica14224Alvaro;

import java.util.Random;
import java.util.Scanner;
public class Tarea2Matrices {
	

	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        Random random = new Random();
	        
	        int opcion;
	        int[][] carton = null;
	        
	        do {
	            mostrarMenu();
	            opcion = sc.nextInt();
	            switch (opcion) {
	                case 1:
	                    carton = generarCarton(random);
	                    mostrarCarton(carton);
	                    jugarBingo(sc, carton);
	                    break;
	                case 2:
	                    if (carton != null) {
//	                        marcarNumero(scanner, carton);
	                    } else {
	                        System.out.println("Genero el carton");
	                    }
	                    break;
	                case 3:
	                    if (carton != null) {
	                        mostrarCarton(carton);
	                    } else {
	                        System.out.println("No se ha generado carton.");
	                    }
	                    break;
	                case 4:
	                    System.out.println("Salgo adios");
	                    break;
	                default:
	                    System.out.println("No es valida la opcion");
	            }
	        } while (opcion != 4);
	        
	        
	    }

	    public static void mostrarMenu() {
	    /**********************************
	     * @author Alvaro Comenge 
	     * 
	     * muestra el menu
	     * 
	     * *******************************/
	        System.out.println("Menu:");
	        System.out.println("1- Generar carton y jugar");
	        System.out.println("2- Cntar números");
	        System.out.println("3- Mostrar ultimo carton generado");
	        System.out.println("4- Salir");
	        System.out.print("Elige una opcn: ");
	    }
	    
	    public static int[][] generarCarton(Random random) {
	    	/*************************************************
	    	 * @author Alvaro Comenge 
	    	 * 
	    	 * 
	    	 * @return genero el carton carton 
	    	 * iterio genero matriz de 3x9 pasando random
	    	 * Mientras el numero sea difenete 
	    	 * 
	    	 ********************************************/
	    
	        int[][] carton = new int[3][9];
	        for (int i = 0; i < carton.length; i++) {
	           /*recorreria cion un for y un whilwe*/
	        }
	        return carton;
	    }
	    
	    public static boolean existeNumeroEnColumna(int[][] carton, int columna, int numero) {
	     /*********************************************************************  
	      * @author aLVARO 
	      * 
	      * 	Esta funcion pasariamos carton coluna y numero y lo encontraria con true o false
	      * 
	      * 
	      **********************************************************************/
	    	boolean encontrado=false;
	    	for (int i = 0; i < carton.length; i++) {
	            if (carton[i][columna] == numero) {
	                encontrado=true;
	            }
	        }
	        return encontrado;
	    }
	    
	    public static int cuentaNumerosEnColumna(int[][] carton, int columna) {
	    	/***************************************************************
	    	 * @author Alvaro Comenge
	    	 * 
	    	 * @param pasamos la matriz que es carton
	    	 * 
	    	 * @param que es la columna para contar los numeros
	    	 * 
	    	 * 
	    	 ******************************************************************/
	    	int cont=0;
	        for (int i = 0; i < carton.length; i++) {
	            if (carton[i][columna] != -1) {
	                cont++;
	            }
	        }
	        return cont;
	    }
	    
	    public static void mostrarCarton(int[][] carton) {
	    	/********************************************
	    	 * @autor Alvaro Comenge
	    	 * 
	    	 * @param pasmos la matriz carton y nos la muestra
	    	 * 
	    	 * 
	    	 * 
	    	 * 
	    	 **********************************************/
	        for (int[] fila : carton) {
	            for (int num : fila) {
	                if (num != -1) {
	                    System.out.print(num + "\n");
	                } else {
	                    System.out.print("-\n");
	                }
	            }
	            System.out.println();
	        }
	    }
	    
	    public static void jugarBingo(Scanner scanner, int[][] carton) {
	    	/**************************************************************
	    	 * @autor Alvaro comenge
	    	 * 
	    	 * ESTYA FUNCION SERI APARA JUGAR AL BINFG
	    	 * 
	    	 * ************************************************************/
	        boolean bingo = false;
	        while (!bingo) {
	            System.out.println("Introduce el numero cantado ");
	            	/*aqui compararia el carton que le paso con el bingo */
	           
	                System.out.println("supongo qeu el carton no esta cantado");
	            }
	        
	    }
	    
	    
	    public static boolean marcarNumero(int[][] carton, int numero) {
	    	/*************************************************************
	    	 * @Alvaro Comenge 
	    	 * 
	    	 * Marcaria el numero 
	    	 * 
	    	 * no puedo termionar como true o false
	    	 * 
	    	 * 
	    	 * ************************************************************/
	        
	           
	        //recorreria con un bucle 
	        return false;
	    }
	    
	  
	    
	    
}
	    