package EjerciciosVectoresClases;

import java.util.*;

/****************************************************************************************
 * @author Álvaro Comenge
 * 
 * @fecha 18-2-24
 * @descripcion 
 * 
 * @descripcion Realiza un programa que gestiona de forma interactiva un diccionario de INGLES/FRANCES/ESPAÑOL. 
 * Se permitirá cargar el diccionario, elegir el diccionario de un idioma y realizar sucesivas consultas hasta
 *  que se introduzca un carácter especial.
 * 
 * @version arrays
 **************************************************************************************/

public class Prg5_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int CAPACIDAD = 50;
        int opcion = 0, cont = 0;
        boolean encontrado = false;

        String ingles[] = new String[CAPACIDAD];
        String espanol[] = new String[CAPACIDAD];
        String frances[] = new String[CAPACIDAD];
        String traductor[] = new String[2];

        do {
            getmenu();
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    cont++;//contador condicion bucles
                    introducePalabras(espanol, ingles, frances, sc, cont);
                    break;
                case 2:
                    System.out.println("Introducir palabra para traducir pulsa: \n 1-Espanol \n 2-Ingles \n 3-Frances");
                    int key = sc.nextInt();
                    switch (key) {
                        case 1:
                            encontrado = buscarPalabrasEspanol(espanol, ingles, frances, traductor, cont);
                            if (encontrado == true) {
                                mostrar(traductor);
                            } else if (encontrado == false) {
                                System.out.println("La palabra no esta en el diccionario");
                            }
                            break;
                        case 2:
                            cont++;
                            encontrado = buscarPalabrasIngles(espanol, ingles, frances, traductor, cont);
                            mostrar(traductor);
                            break;
                        case 3:
                            cont++;
                            encontrado = buscarPalabrasFrances(espanol, ingles, frances, traductor, cont);
                            if (encontrado == true) {
                                mostrar(traductor);
                            } else {
                                System.out.println("La palabra no esta en el diccionario");
                            }
                            break;
                        default:
                            break;
                    }
              
                default:
                    break;
            }
        } while (opcion != 3);
    }

    public static void getmenu() {
    	/********************************************************
    	 * @autor Álvaro Comenge
    	 * @descripcion Muestra el menú de opciones del programa.
    	 * 
    	 *********************************************************/
        System.out.println("Menu:");
        System.out.println("\n 1-Cargar dicionario");
        System.out.println("\n 2-Buscar palabras");
        System.out.println("\n 3-Salir");
    }

    public static void introducePalabras(String espanol[], String ingles[], String frances[], Scanner sc, int cont) {
    	/****************************************************************************************
    	 * /**
		 * @autor Álvaro Comenge
		 * @param espanol array de palabras en español
		 * @param ingles array de palabras en inglés
		 * @param frances array de palabras en francés
		 * @param sc objeto Scanner para entrada de datos
		 * @param cont contador de palabras ingresadas
		 * @descripcion Permite introducir palabras en los arrays de palabras en español, inglés y francés.
		 * 
    	 *****************************************************************************************/
    	
        boolean decision = true;
        String salir, pE, pI, pF;
        for (int i = 0; i < cont && decision == true; i++) {
            System.out.println("Introduce palabras");
            System.out.println("En espanol");
            pE = sc.next();
            espanol[i] = pE;

            System.out.println("En Ingles");
            pI = sc.next();
            ingles[i] = pI;

            System.out.println("En Frances");
            pF = sc.next();
            frances[i] = pF;
            System.out.println("Dejar de introducir palabras pulsa (s/n)");
            salir = sc.next();

            if (salir.equalsIgnoreCase("s")) {
                decision = false;
            }
        }
    }

    public static boolean buscarPalabrasEspanol(String espanol[], String ingles[], String frances[], String traductor[], int cont) {
    	/**************************************************************************************************************
    	 * @autor Álvaro Comenge
    	 * @param espanol array de palabras en español
    	 * @param ingles array de palabras en inglés
    	 * @param frances array de palabras en francés
    	 * @param traductor array donde se almacenará la traducción
    	 * @param cont contador de palabras ingresadas
    	 * @return true si la palabra se encuentra en el diccionario, false en caso contrario
    	 * @descripcion Busca una palabra en inglés y si la encuentra, almacena su traducción en el array 'traductor'.
    	 ***************************************************************************************************************/
        boolean encontrado = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce palabra");
        String palabra = sc.next();
        for (int i = 0; i < cont && encontrado == false; i++) {
            if (espanol[i] != null && espanol[i].equalsIgnoreCase(palabra)) {
                encontrado = true;
                traductor[0] = ingles[i];
                traductor[1] = frances[i];
            }
        }
        return encontrado;
    }

    public static boolean buscarPalabrasIngles(String espanol[], String ingles[], String frances[], String traductor[], int cont) {
    	/******************************************************************************************************
    	 * @autor Álvaro Comenge
    	 * @param espanol array de palabras en español
    	 * @param ingles array de palabras en inglés
    	 * @param frances array de palabras en francés
    	 * @param traductor array donde se almacenará la traducción
    	 * @param cont contador de palabras ingresadas
    	 * @return true si la palabra se encuentra en el diccionario, false en caso contrario
    	 * @descripcion Busca una palabra en inglés y si la encuentra, almacena su traducción en el array 'traductor'.
    	 *************************************************************************************************************/
    	
        boolean encontrado = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce palabra");
        String palabra = sc.next();
        for (int i = 0; i < cont && encontrado == false; i++) {
            if (ingles[i] != null && ingles[i].equalsIgnoreCase(palabra)) {
                encontrado = true;
                traductor[0] = espanol[i];
                traductor[1] = frances[i];
            }
        }
        return encontrado;
    }

    public static boolean buscarPalabrasFrances(String espanol[], String ingles[], String frances[], String traductor[], int cont) {
    	/**************************************************************************************************************
    	 * @autor Álvaro Comenge
    	 * @param espanol array de palabras en español
    	 * @param ingles array de palabras en inglés
    	 * @param frances array de palabras en francés
    	 * @param traductor array donde se almacenará la traducción
    	 * @param cont contador de palabras ingresadas
    	 * @return true si la palabra se encuentra en el diccionario, false en caso contrario
    	 * @descripcion Busca una palabra en francés y si la encuentra, almacena su traducción en el array 'traductor'.
    	 ****************************************************************************************************************/
        boolean encontrado = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce palabra");
        String palabra = sc.next();
        for (int i = 0; i < cont && encontrado == false; i++) {
            if (frances[i] != null && frances[i].equalsIgnoreCase(palabra)) {
                encontrado = true;
                traductor[0] = espanol[i];
                traductor[1] = ingles[i];
            }
        }
        return encontrado;
    }

    public static void mostrar(String traductor[]) {
    	 /*********************************************************************
    	 * @autor Álvaro Comenge
    	 * @param traductor array donde se almacena la traducción
    	 * @descripcion Muestra la traducción de la palabra en los 
    	 * distintos idiomas almacenada en el array 'traductor'.
    	 **********************************************************************/
        for (int i = 0; i < traductor.length; i++) {
            System.out.println(traductor[i]);
        }
        System.out.println("********************");
    }
}
