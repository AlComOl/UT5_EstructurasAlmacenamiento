package EjerciciosGitHub;
import java.util.*;
/***************************************************************************************************************************
 * Autor: Álvaro Comenge 
 * 
 * Fecha:20/01/24
 * 
 * 	Una comunidad de vecinos tiene 9 pisos y un local.
 *  Realiza un programa que controle las elecciones a presidente de la comunidad:
 *  cada vecino puede votar al vecino que quiera. Valida que el voto es correcto.
 * 
 * 
 * 
 * 
 *****************************************************************************************************************************/
public class Prg5_13 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		final int T=10;
		int p1=0,p2=0,p3=0,p4=0,p5=0,p6=0,p7=0,p8=0,p9=0,p10=0,b1=0,n=0,ganador=0;
		int vc[]=new int[T];
		
		System.out.println("Votaciones a presidente de la comunidad"
				+ "\n Introduce 1- Piso 1 "
				+ "\n Introduce 2- Piso2 "
				+ "\n Introduce 3- Piso3 "
				+ "\n Introduce 4- Piso4 "
				+ "\n Introduce 5- Piso5 "
				+ "\n Introduce 6- Piso6 "
				+ "\n Introduce 7- Piso7 "
				+ "\n Introduce 8- Piso8 "
				+ "\n Introduce 9- Piso9 "
				+ "\n Introduce 10- Local Comercial Planta baja");
		 
		for(int i=0;i<vc.length;i++) {//votaciones
		do {
			System.out.println("Vota pueta "+i);
			n=sc.nextInt();
			if(n>=0&&n<=10) {
				
				int voto=n;
			
				vc[i]=voto;
				
				//capturo res por piso
					if(vc[i]==1)
						p1++;
					else if(vc[i]==2)
						p2++;
					else if(vc[i]==3)
						p3++;
					else if(vc[i]==4)
						p4++;
					else if(vc[i]==5)
						p5++;
					else if(vc[i]==6)
						p6++;
					else if(vc[i]==7)
						p7++;
					else if(vc[i]==8)
						p8++;
					else if(vc[i]==9)
						p9++;
					else if(vc[i]==10)
						b1++;
				}else {
					 System.out.println("Vuelve a votar con el digito correcto");		
//					
				}
		
		
		}while(n<1||n>10);
		
		}
		int mayor = vc[0]; // Suponemos que el primer elemento es el mayor
	    int posicion = 0;

	    for (int i = 0; i < vc.length; i++) {
	        if (vc[i] > mayor) {
	            mayor = vc[i]; // Actualizamos el número mayor
	            posicion = i; // Actualizamos la posición del número mayor
	        }
	    }
		System.out.println(mayor);
		System.out.println(posicion);
		System.out.println("\n Votos piso 1 :"+p1+
						"\n Votos piso 2 :"+p2+
						"\n Votos piso 3 :"+p3+
						"\n Votos piso 4 :"+p4+
						"\n Votos piso 5 :"+p5+
						"\n Votos piso 6 :"+p6+
						"\n Votos piso 7 :"+p7+
						"\n Votos piso 8 :"+p8+
						"\n Votos piso 9 :"+p9+
						"\n Votos Bajo Comercial :"+b1+
						"\n **************************"+
						"\n El presidente de la comunidad sera el dueyo del piso "+mayor+" con "+posicion+ " votos");
		
	sc.close();
}
}