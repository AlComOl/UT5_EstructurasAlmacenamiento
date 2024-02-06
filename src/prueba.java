import java.util.Scanner;

public class prueba {
    
    public static void main(String[] args) {
        
        int numeros[][]= {{1,2,3,4},{3,5,7},{1,2,3},{9,11,12,5}};

        obtenerMatriz(numeros);
        
    }

    public static void obtenerMatriz(int numeros[][]){
        
    	for(int i=0;i<numeros[3].length;i++) {//filas
    		System.out.print(" [ ");
    		for(int j=0;j<numeros[1].length;j++) {//columnas
    			System.out.print(numeros[i][j]);
    		}
    		System.out.println(" ] ");
    	}
    }

    
}