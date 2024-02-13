package EjerciciosVectoresClases;
import java.util.Scanner;
public class Prg5_7Fran {

	public static void main(String[] args) {
		
		        Scanner tec= new Scanner(System.in);
		        final int MAX=100;
		        int opcion=0, posPalabraEsp,posPalabraIng, posPalabraFr;
		        String pEsp, pIng, pFr;
		        String esp[]= new String[MAX];
		        String ing[]= new String[MAX]; 
		        String fr[]=new String [MAX];  
		        boolean continuar=true;
		        String pregunta;
		        int i=0;

		        do{
		            getMenu1();
		            opcion= tec.nextInt();
		            switch(opcion){
		                case 1: 
		                    
		                    while(continuar==true){
		    
		                        System.out.println("Introduce la palabra en español");
		                        pEsp= tec.next();
		                        esp[i]=pEsp;
		                        
		                        System.out.println("Introduce la palabra en inglés");
		                        pIng= tec.next();
		                        ing[i]=pIng;
		    
		                        System.out.println("Introduce la palabra en francés");
		                        pFr=tec.next();
		                        fr[i]=pFr;
		                        i++;
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
		                        
		                        posPalabraEsp=buscarPalabra(esp, palabraBuscar, i);
		                        posPalabraIng=buscarPalabra(ing, palabraBuscar, i);
		                        posPalabraFr=buscarPalabra(fr, palabraBuscar, i);

		                
		                        if(posPalabraEsp>=0){
		                            System.out.println("Palabra encontrada en el idioma español");
		                            System.out.println("La palabra en ingles es " + ing[posPalabraEsp]);
		                            System.out.println("La palabra en frances es " + fr[posPalabraEsp]);
		                        }else if(posPalabraIng>=0){
		                                System.out.println("Palabra encontrada en el idioma ingles");
		                                System.out.println("La palabra en español es " + esp[posPalabraIng]);
		                                System.out.println("La palabra en frances es " + fr[posPalabraIng]);
		                        }else if(posPalabraFr>=0){
		                            System.out.println("Palabra encontrada en el idioma francés");
		                            System.out.println("La palabra en español es " + esp[posPalabraFr]);
		                            System.out.println("La palabra en ingles es " + ing[posPalabraFr]);
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

		    public static void getMenu1(){
		        System.out.println("Elige una opcion:");
		        System.out.println("1.Añadir una palabra");
		        System.out.println("2.Buscar una palabra en otro idioma");
		    }

		    public static int buscarPalabra(String []idioma, String palabra, int cantPalabras){
		        boolean encontrado=false;
		        int pos=-1;

		        for (int i = 0; i < cantPalabras && encontrado==false; i++){
		            if (idioma[i].equalsIgnoreCase(palabra)) {
		                encontrado=true;
		                pos=i;
		            }
		        }
		        return pos;
		    }

		    public static void mostrar(String[]idioma){
		        for(int i= 0; i<idioma.length;i++){
		            if(i!=idioma.length-1){
		                System.out.print(idioma[i] + ",");
		            }else{
		                System.out.print(idioma[i]);
		            }
		        }
		    }
	}


