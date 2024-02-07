package Matrices;
import java.util.*;
public class Triangulo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t[][]=new int [3][];
		t[0]=new int [4];
		t[1]=new int [5];
		t[2]=new int [4];
		
		
		for (int i=0;i<t.length;i++) {
			t[i]=new int[i+1];
			
			for (int j=0;j<t[i].length;j++) {
				System.out.print(t[i][j]+" ");
			
			}
			
			System.out.println();
		}

	}

}
