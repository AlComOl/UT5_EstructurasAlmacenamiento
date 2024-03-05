package ExamenEscrito2evaluacion;
import java.util.*;

public class E5 {

	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	int j=0,i=0;
	int m[][]=new int [3][3];
	int m1[][]=new int [3][3];
	
	System.out.println("Introduce elemento");
	for(i=0;i<m.length;i++) {
		

		
		for(j=0;j<m.length;j++) {
			
				m[i][j]=sc.nextInt();
			
		}
	}
	

	
	mostrarMatriz(m);
//	mostrarMatriz(m1);
System.out.println(matrizSimetrica(m));
	
	}
	
	public static boolean  matrizSimetrica(int m[][]) {
		int encontrado=0;
		boolean simetrica=false;
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m.length;j++) {
				if(m[i][j]==m[j][i]) {
					encontrado++;
				}
			}
		}
		if(encontrado==9) {
			simetrica=true;
		}else {
			simetrica=false;
		}
		
		return simetrica;
	}
	
	
	
	
	public static void mostrarMatriz(int m[][]) {
		int i=0,j=0;
		
		for(i=0;i<m.length;i++) {	
			System.out.print("[");
			for(j=0;j<m.length;j++) {
				System.out.print(m[i][j]+" ");
			
				
			}
	
			System.out.print("]");
		}
	}
}