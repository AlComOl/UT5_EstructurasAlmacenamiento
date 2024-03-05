package ExamenEscrito2evaluacion;
import java.util.*;
public class E4 {

	public static void main(String[] args) {
		
		final int MAX=50;
		int num1=0,num2=0,num3=0;
		
		int [] fusion = new int [MAX+MAX];
		int [] v=new int [MAX];
		int [] v1=new int [MAX];
		
		System.err.println("Dame el vector(fin 0 -1)");
		
		num1=leerVector(v1);
	}

	public static int leerVector(int []v1) {
		Scanner sc=new Scanner(System.in);
		int n=0;
		int i, j, aux;
		for (i = 0;i<v1.length;i++) {
		
			System.out.println("introcuce valor para vector");
			
			 while(n!=-1) {
				 n=sc.nextInt();
				 if(n>=0) {
				  v1[i]= n;
				 }else {
					 System.out.println("el numero es negativo");
				 }
			 }
		}
		
		
		return ;
		}
		
		
//		for(i = 0; i < pos - 1; i++) {/* Se realizan N_EL-1 pasadas */
//			for(j = pos - 1; j > i; j--) { 
//				if (v[j-1] > v[j]) {
//					aux = v[j-1];
//					v[j-1] = v[j];
//					v[j] = aux;
//				}
//			}
//		}
	
}
