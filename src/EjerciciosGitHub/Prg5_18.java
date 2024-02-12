package EjerciciosGitHub;

import java.util.Random;

/*****************************************************************************************
 * @author acome
 * 
 * @fecha 12/02/24
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
	
		public static void matrizBoletos(int boleto[], int sorteo[][]) {
			Random random=new Random();
			
			for(int i=0;i<sorteo.length;i++) {	
				for(int j=0;j<sorteo[0].length;j++) { 
					 sorteo[i][j]=generarBoletos(boleto);
				}
			}
		}
		
		
		public static int generarBoletos(int boleto[]) {
			Random random=new Random();	
			return random.nextInt(10);
		}
		
		public static void generarGanador(int ganador[] ) {
			for(int i=0;i<ganador.length;i++) {
			 ganador[i]=generarBoletos(ganador);
			}
		}
		
		public static void aciertosBoleto(int sorteo[][], int ganador[]) {
			
			for(int i=0;i<sorteo.length;i++) {
				int aciertos=0;

				
				for(int j=0;j<sorteo[0].length;j++) {
					
					
					if(sorteo[i][j]==ganador[j]) {
						aciertos++;
					}
				
				}
				System.out.println("\n El boleto "+ i+" tiene acierto "+aciertos);
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
