package EjerciciosGitHub;
import java.util.*;
import java.util.Random;

/*****************************************************************************************
 * @author acome
 * 
 * @fecha 13/02/24
 * 
 * Realizar un programa que controle el sorteo de la lotería primitiva. Para simplificar
 * el programa, la combinación ganadora sólo constará de 3 números, y no hay ni reintegros 
 * ni número complementario. El programa deberá aceptar la combinación ganadora una sola vez
 * y posteriormente acertar los números de 10 boletos. Una vez aceptados los número de los
 * boletos, se deberá mostrar por pantalla los aciertos de cada uno de ellos. 
 * Realiza una segunda versión sin las limitaciones indicadas anteriormente.
 * 
 * 
 * 
 * ************************************************************************************/
public class Prg5_18 {

	public static void main(String[] args) {
		
		final int BOLETOS=10;
		final int COMBINACIONES=3;
		
		int sorteo[][]=new int [BOLETOS][COMBINACIONES];
		int boleto[]=new int[COMBINACIONES];
		int ganador[]=new int [COMBINACIONES];
		
		matrizBoletos(boleto,sorteo);
		
		
		System.out.println("Muestra los boletos el sorteo");
		mostrarMatriz(sorteo);
		
		generarGanador(ganador);
		System.out.println("Boleto ganador");
		mostrarArray(ganador);
		
		System.out.println("\n Aciertos respecto al boleto ganador ");	
			aciertosBoleto(sorteo,ganador);

	}
//CODIGO DE LA PIZARRA EMILIANO 	
		public static void matrizBoletos(int boleto[], int sorteo[][]) {
			Random random=new Random();
			
			for(int i=0;i<sorteo.length;i++) {	
				for(int j=0;j<sorteo[i].length;j++) { 
					int  numeroAlatorio=random.nextInt(10);
					 boolean repetido=false;
					 while(repetido==false) {
						 
						 for (int m=0;m<j&& repetido==true;m++) {
							 
							 if(sorteo[i][m]==numeroAlatorio) {
								 repetido=true;
							 }
						 }
						 if(repetido=true)
							 sorteo[i][j]=numeroAlatorio;
						 else {
							 numeroAlatorio=random.nextInt(10);
							 repetido=false;
						 }
					 }
				}
			}
		}
		

		public static int generarBoletos() {
			Random random=new Random();	
			return random.nextInt(10);
		}
		
		public static void generarGanador(int ganador[] ) {
			for(int i=0;i<ganador.length;i++) {
			 ganador[i]=generarBoletos();
			}
		}
		
		public static void aciertosBoleto(int sorteo[][], int ganador[]) {
		    for (int i = 0; i < sorteo.length; i++) {
		        int aciertos = 0;
		        boolean numerosEncontrados[] = new boolean[ganador.length]; // Para rastrear los números del boleto ganador encontrados en el sorteo actual
//		        No he podido poner la condicion del boleano en los bucles for
		        for (int j = 0; j < sorteo[0].length; j++) {
		            for (int k = 0; k < ganador.length; k++) {
		                if (sorteo[i][j] == ganador[k] && !numerosEncontrados[k]) { // Verifica si el número del sorteo coincide con el número del boleto ganador y no ha sido encontrado antes
		                    aciertos++;
		                    numerosEncontrados[k] = true; // Marca el número del boleto ganador como encontrado
		                }
		            }
		        }
		        System.out.println("\n El boleto " + i + " tiene acierto " + aciertos);
		    }
		}
		        
		       
		
	
		
		
	
		public static void mostrarArray(int v[]) {
				
				for (int i=0;i<v.length;i++) {
					System.out.print(v[i]);
					
				}
		}
		
		public static void mostrarMatriz(int v[][]) {
			
			for(int i=0;i<v.length;i++) {	
				System.out.print("[ ");
				for(int j=0;j<v[0].length;j++) {
					
					System.out.print(v[i][j]);
				}
				System.out.println(" ]");
			}
			
		}
}
