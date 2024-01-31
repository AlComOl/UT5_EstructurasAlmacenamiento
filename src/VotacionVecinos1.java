import java.util.*;
public class VotacionVecinos1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introducir numero de pisos a votar");
		int n=sc.nextInt();//pisos a votar
		int v[]=new int [10];
		
		votacion(10,v);

	}
	
	public static void votacion(int n, int vector[]) {
		Scanner sc=new Scanner(System.in);
		int piso,voto;
		boolean efectuaVoto=false;
		int votaciones[]=new int [n];
		boolean verificacion[]=new boolean[n];
		
		
		
			for(int i=1;i<n;i++) {
				System.out.println("Piso que emite el voto");
				piso=sc.nextInt();
					if (votaciones[i]>=0 && votaciones[i]<n) {
						if(verificacion[piso-1]==false) {
							System.out.println("VOTA el piso "+i);
							votaciones[i]=sc.nextInt();
						}else {
							System.out.println("YA ha votado el piso "+i);
						}
					
					}else {
						i--;
					}
			
			}
		}

	}

