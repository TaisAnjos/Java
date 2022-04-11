package VetoreMatriz;

import java.util.Scanner;

public class Matriz1 {

	public static void main(String[] args) {
		int n1 [][] = new int [4][6];
		int n2 [][] = new int [4][6];
		int m1 [][] = new int [4][6];
		int m2 [][] = new int [4][6];
		int l,c;
		Scanner leia = new Scanner (System.in);
		for (l=0;l<4;l++) 
		{

		for (c=0;c<6;c++) 
		{
			System.out.print("Digite os valores da matriz 1: ");
			n1 [l][c] = leia.nextInt();
		}
		for (l=0;l<4;l++) 
		{
		
			for (c=0;c<6;c++) 
			{
				System.out.print("Digite os valores da matriz 2: ");
				n2 [l][c] = leia.nextInt();
			
				m1[l][c] = n1[l][c] + n2[l][c];
				m2[l][c] = n1[l][c] - n2[l][c];
				
			}
		}
		for (l=0;l<4;l++) 
		{
			for (c=0;c<6;c++) 
			{
				System.out.print(m1[l][c]+"\t");
				System.out.print("\t");
				System.out.println();
				System.out.print(m2[l][c]+"\t");
				System.out.print("\t");
			
			}
		}
}
}
}
