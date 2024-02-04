import java.util.*;

public class Prg5_6FUN {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=10;
		int v[]=new int[10];
		
		cargarVector(v);
		System.out.println(capicua(v,t));
		sc.close();
		}
	
		public static void cargarVector(int v[]) {
		/******************************************
		 * @author acome
		 * 
		 * @param v[ ] cargar vector v[]
		 * 
		 ******************************************/
			Scanner sc=new Scanner(System.in);
			
			for(int i=0;i<v.length;i++) {
				 System.out.println("Introduce elementos");
				v[i]=sc.nextInt();
				
			}
			sc.close();
		}
	
		public static boolean capicua(int v[],int n) {
		/*********************************************
		 * @author acome
		 *	Metodo capicua:Encuantra si el numero es capicua
		 * @param v[]=vector con t de tamaño
		 * @param t es el tamaño  del vector
		 *
		 *********************************************/
			int i,j;
			boolean numCapi=true;
			for(i=0,j=n-1;i<j&&numCapi==true;i++,j--) {
				if(v[i]!=v[j-1])
					numCapi=false;
			}
			return numCapi;
		}
	}
