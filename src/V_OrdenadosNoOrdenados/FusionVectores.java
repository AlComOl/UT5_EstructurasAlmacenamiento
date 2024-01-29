package V_OrdenadosNoOrdenados;

import java.util.Scanner;

public class FusionVectores {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int pos_v1=0,pos_v2=0,pos_v3=0;
		int Numpos1=7;
		int Numpos2=7;
		
		int v1[]= {10,20,30,40,50,60,70};
		int v2[]= {5,15,25,35,45,65,75};
		int v1v2[]=new int [v1.length+v2.length];
		
		while(pos_v1<Numpos1&&pos_v2<Numpos2) {
			if(v1[pos_v1]<v2[pos_v2]) {
				v1v2[pos_v3]=v1[pos_v1];
				pos_v1++;
			}else {
				v1v2[pos_v3]=v2[pos_v2];
				pos_v2++;
			}
			pos_v3++;
			
		}
		
		for(int i=0;i<v1v2.length;i++) {
			System.out.println(v1v2[i]+",");
		}
}
}