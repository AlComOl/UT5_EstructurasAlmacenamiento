package EjerciciosGitHub;

public class Prg5_11 {

	public static void main(String[] args) {
		int fila[] = new int[5];
		
		cuadradoMagico(5);
		
		
		
	}
	
	public static void cuadradoMagico(int n) {
//		crear n arrays
		int m=1;
		for(int i=0;i<n;i++) {
			int fila[]=new int [n];
			for(int j=0;j<i;j++)
					fila[n/2]=m;
					m+=1;
					mostrarArray(fila);
				}
					
		}
		
	
	
	
	public static void mostrarArray(int array[]) {
	    System.out.print("[");
	    for (int i = 0; i < array.length; i++) {
	        System.out.print(array[i]);
	        if (i < array.length - 1) {
	            System.out.print(", ");
	        }
	    }
	    System.out.println("]");
	}
		
		
	}

