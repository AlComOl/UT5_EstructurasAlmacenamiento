package Matrices;
import java.util.*;
public class EjercicioconsolidacionJulia {

	public static void main(String[] args) {
		
		        
		        final int FILAS=5;
		        final int COLUMNAS=4;
		        
		        int numeritos[][]=new int[FILAS][COLUMNAS];
		        
		        leerMatriz(numeritos, FILAS, COLUMNAS);
		        mostrarMatriz(numeritos,FILAS,COLUMNAS);
		        mayorymenorMatriz(numeritos,FILAS,COLUMNAS);
		        
		    }
		    
		    public static void leerMatriz(int numeritos[][], int FILAS, int COLUMNAS){
		    	Scanner sc=new Scanner(System.in);
		        for(int i=0;i<FILAS;i++){
		        	
		                for(int j=0;j<COLUMNAS;j++){
		                	
		                System.out.println("Dame los valores de las filas y las columnas: ");
		                numeritos[i][j]=sc.nextInt();
		                
		                }

		            }
		    
		    }
		    
		    public static void mostrarMatriz(int numeritos[][], int FILAS, int COLUMNAS){
		    
		        for(int i=0;i<FILAS;i++){
		        
		            for(int j = 0;j<COLUMNAS;j++){
		            
		                System.out.println("Matriz ["+i+"]["+j+"] = "+numeritos[i][j]);
		            
		            }
		        
		        }
		    
		    }
		    
		    public static void mayorymenorMatriz(int numeritos[][], int FILAS, int COLUMNAS){
		    
		        int numMax=numeritos[0][0];
		        int numMin=numeritos[0][0];
		        int filaMayor=0;
		        int filaMenor=0;
		        int columMayor=0;
		        int columMenor=0;
		        
		        for(int i=0;i<FILAS;i++){
		        
		            for(int j=0;j<COLUMNAS;j++){
		            
		                if(numeritos[i][j]>numMax){
		                
		                    numMax=numeritos[i][j];
		                    filaMayor=i;
		                    columMayor=j;
		                
		                }
		                else if(numeritos[i][j]<numMin){
		                
		                    numMin=numeritos[i][j];
		                    filaMenor=i;
		                    columMenor=j;
		                
		                }
		                
		            }
		        
		        }
		        
		                System.out.println("El mayor es: "+numMax);
		                System.out.println("En la fila: "+filaMayor+" y en la columna: "+columMenor);
		                System.out.println("El menor es: "+numMin);
		                System.out.println("En la fila: "+filaMenor+" y en la columna: "+columMenor);
		    
		    }
		    
		}	

	


