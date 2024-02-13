package EjerciciosVectoresClases;
import java.util.*;

	
	
	public class Prg5_7FranVersionMatrices {
	    public static void main(String[] args) {
	        Scanner tec= new Scanner(System.in);
	        final int MAX=100, IDIOMAS=3;
	        int opcion=0;
	        String vocabulario[][]= new String[MAX][IDIOMAS];
	        boolean continuar=true;
	        String pregunta;
	        int i=0;

	        do{
	            getMenu();
	            opcion= tec.nextInt();
	            switch(opcion){
	                case 1: 
	                    for(int j=0; j<MAX && continuar==true;j++){
	                        for(int k=0; k<IDIOMAS;k++,i++){
	                            if(k==0){
	                                System.out.println("Dame la palabra en español");
	                            }else if (k==1){
	                                System.out.println("Dame la palabra en inglés");
	                            }else{
	                                System.out.println("Dame la palabra en francés");
	                            }

	                            vocabulario[j][k]=tec.next();
	                            
	                        }
	                        System.out.println("¿Quieres introducir otra? si/no: ");
	                        pregunta=tec.next();

	                        if (pregunta.equalsIgnoreCase("no")){ 
	                            continuar=false;
	                        }
	                    }

	                    continuar=true;
	                    break;
	    
	                case 2: 
	                    String palabraBuscar;
	                    
	                    while(continuar==true){
	                        System.out.println("Dime la palabra que quieres buscar");
	                        palabraBuscar=tec.next();
	                        
	                        int []posiciones;

	                        posiciones=buscarPalabra(vocabulario, palabraBuscar, i);

	                        if(posiciones[0]==0){
	                            System.out.println("Palabra encontrada en el idioma español");
	                            System.out.println("La palabra en ingles es " + vocabulario[posiciones[0]+1][posiciones[1]]);
	                            System.out.println("La palabra en frances es " + vocabulario[posiciones[0]+2][posiciones[1]]);
	                        }else if(posiciones[0]==1){
	                            System.out.println("Palabra encontrada en el idioma inglés");
	                            System.out.println("La palabra en español es " + vocabulario[posiciones[0]-1][posiciones[1]]);
	                            System.out.println("La palabra en frances es " + vocabulario[posiciones[0]+1][posiciones[1]]);
	                        }else if(posiciones[0]==2){
	                            System.out.println("Palabra encontrada en el idioma francés");
	                            System.out.println("La palabra en español es " + vocabulario[posiciones[0]-2][posiciones[1]]);
	                            System.out.println("La palabra en ingles es " + vocabulario[posiciones[0]-1][posiciones[1]]);
	                        }else{
	                            System.out.println("No se ha encontrado la palabra en ningún idioma");
	                        }
	                        
	                        System.out.println("¿Quieres introducir otra? si/no: ");
	                        pregunta=tec.next();
	    
	                        if (pregunta.equalsIgnoreCase("no")){ 
	                            continuar=false;
	                        }
	                    }
	                    continuar=true;
	                    break;
	    
	                default:
	                    break;
	            } 
	        }while(opcion!=0);
	        tec.close();
	    }

	    public static void getMenu(){
	        System.out.println("Elige una opcion:");
	        System.out.println("1.Añadir palabra");
	        System.out.println("2.Buscar palabra");
	    }

	    public static int[] buscarPalabra(String [][]vocabulario, String palabra, int cantPalabras){
	        boolean encontrado=false;
	        
	        int []idiomas={-1,-1};

	        for (int i = 0; i < cantPalabras && encontrado==false; i++){
	            for(int j=0; j< vocabulario[0].length;j++){
	                if (vocabulario[i][j].equalsIgnoreCase(palabra)) {
	                    encontrado=true;
	                    idiomas[0]=i;
	                    idiomas[1]=j;
	                }
	            }

	        }

	        return idiomas;
	    }

	    public static void mostrar(String [][]vocabulario, int cantPalabras){
	        for (int i=0; i < cantPalabras; i++){
	            for(int j=0; j< vocabulario[0].length;j++){
	                System.out.print(vocabulario[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
	}