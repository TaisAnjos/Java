package VetoreMatriz;

import java.util.Scanner;

public class Matriz2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int mat [][] = new int [3][3];
		int l,c,soma=0,somad=0;
		
		for (l=0;l<3;l++) 
		{
			for (c=0;c<3;c++) 
			{
				System.out.println("Digite os valores da matriz: ");
				mat [l][c] = leia.nextInt();
				soma= mat[l][c]+mat[l][c]+soma;
				somad= mat[0][0]+mat[1][1]+mat[2][2]+somad;
				
			}
		}
		System.out.println("A soma da matriz é: "+soma);
		System.out.println("A soma da diagonal da matriz é: "+somad);
	}

}
