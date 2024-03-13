package ExEscrito2Eva6324;
/*Diremos que una matriz eata rellenada en mosaico, si las filas pares (0,2,4...)
 *estan rellenas altenativamente con "X"(el caracter X en mayuscula)y "O"(el caracter O en mayuscula)
 *y las impares (1,3,5,...);
 *realice un programa en Java, que rellene una matriz de nxn con el valor n pedido al usuario(como maximo 
 *(20x20)en la cuadricula.
 * */
public class Tarea3 {

	public static void main(String[] args) {
		int n=20;
		
		char[][] matriz=new char [n][n];
		
		rellenarMatriz(matriz);
		
		mostrarMatriz(matriz);
	}
	
	public static void rellenarMatriz(char matriz[][]) {
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[0].length;j++) {
				if(i%2==0 && j%2!=0 || i%2!=0 && j%2==0) {
					matriz[i][j]='X';
				}else {
					matriz[i][j]='O';
				}
			}
		}
	}
	
	public static void mostrarMatriz(char matriz[][]) {
		
		for(int i=0;i<matriz.length;i++) {
			System.out.print("[");
			for(int j=0;j<matriz[0].length;j++) {
				System.out.print(matriz[i][j]);
			}
			System.out.println("]");
		}
				
	}

}
