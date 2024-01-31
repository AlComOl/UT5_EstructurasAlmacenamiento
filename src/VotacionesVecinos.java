import java.util.*;
/**********************************************************************
 * Autor : Alvaro Comenge;
 * 
 * Votaciones a la comunidad de vecinos
 * 
 * fefcha: 31/01/2024
 ***********************************************************************/

public class VotacionesVecinos {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Introduce el numero de puertas");
        int n = sc.nextInt();
        int[] votos = votaciones(n);
        int puertaGanadora = puertaGanadora(votos);
        System.out.println("La puerta ganadora es: " + puertaGanadora);
    }

    public static int[] votaciones(int n) {
    	/**********************************************************************
    	 * Autor : Alvaro Comenge;
    	 * 
    	 *FUNCION: cuenta la frecuencia y conprueba que haya un voto por piso
    	 * 
    	 *
    	 ***********************************************************************/
        boolean comp[] = new boolean[n]; // registro si cada piso ha votado
        int vota[] = new int[n]; // almaceno los votos de cada piso
        
        for (int piso = 1; piso <= n; piso++) { // itero por los pisos
            System.out.println("Introduce el piso que vota:");
            int numPiso = sc.nextInt();
            
            if (numPiso >= 1 && numPiso <= n) { // Verifica si el  piso es valido
                if (!comp[numPiso - 1]) { // Verifica si el piso no ha votado
                    System.out.println("El piso " + numPiso + "vota ");
                    int voto = sc.nextInt();
                    
                    if (voto >= 1 && voto <= n) { // Verifica que el voto sea valido
                        vota[numPiso - 1] = voto;
                        comp[numPiso - 1] = true; // Marca el piso como votado
                    } else {
                        System.out.println("Voto invalido. Introduce un numero valido");
                        piso--; // Resta 1 al contador de piso para repetir la iteracion
                    }
                } else {
                    System.out.println("El piso " + numPiso +"ya ha votado.");
                    piso--; // Resta 1 al contidor de piso para repetir la iteracion
                }
            } else {
                System.out.println("Piso invalido. Introduce el numero valido");
                piso--; // Resta 1 al contador de piso para repetir la iteracion
            }
        }
        
        return vota;
    }

    public static int puertaGanadora(int[] votos) {
    	/**********************************************************************
    	 * Autor : Alvaro Comenge;
    	 * 
    	 *FUNCION: determina la puerta que ha ganado
    	 * 
    	 *
    	 ***********************************************************************/
        int n = votos.length;
        int[] contador = new int[n];
        
        for (int i = 0; i < votos.length; i++) {
            int voto = votos[i];
            contador[voto - 1]++;
        }
        
        int maxVotos = contador[0];
        int puertaGanadora = 1;
        
        for (int i = 1; i < n; i++) {
            if (contador[i] > maxVotos) {
                maxVotos = contador[i];
                puertaGanadora = i + 1;
            }
        }
        
        return puertaGanadora;
    }
}
