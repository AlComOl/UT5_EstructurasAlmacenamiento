package MetodosDeClasificacion;
import java.util.*;
//El vector tiene que estar ordenado 

public class Apuntes1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		final int N_EL = 5;
		
		
		
		
		for(int i = 1; i < v.length; i++) {
	        int x = v[i];
	        int j = i;
	        while (j > 0 && x < v[j-1]) {
	            v[j] = v[j-1];
	            j--;
	        }
	        v[j] = x;
	    }
		
		for (int i = 0; i<v.length;i++) {
		System.out.println(v[i]);
		}
}
}
