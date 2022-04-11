package VetoreMatriz;

import java.util.Scanner;

public class Vetor1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int vet[] = new int [5];
		int maior = 0;
		int x;
		
		for ( x=0;x<5;x++)
		{
			System.out.println("Digite um valor da pontuação");
			vet[x] = leia.nextInt();
			
			if(vet[0]>vet[1] && vet[0]>vet[2] && vet[0]>vet[3] && vet[0]>vet[4]) 
			{
				maior=vet[0];
			}
			else if (vet[1]>vet[0] && vet[1]>vet[2] && vet[1] >vet[3] && vet[1]>vet[4]) 
			{
				maior=vet[1];
			}
			else if (vet[2]>vet[1] && vet[2]>vet[0] && vet[2] >vet[3] && vet[2]>vet[4]) 
			{
				maior=vet[2];
			}
			else if (vet[3]>vet[1] && vet[3]>vet[2] && vet[3] >vet[0] && vet[3]>vet[4]) 
			{
				maior=vet[3];
			}
			else if (vet[4]>vet[1] && vet[4]>vet[2] && vet[4] >vet[3] && vet[4]>vet[0]) 
			{
				maior=vet[4];
			
			}
		}
		for ( x=0;x<5;x++) 
		{
			System.out.print(vet[x]+"\t");
		}
		
		System.out.println();
		System.out.println("O maior número é: "+maior);
		
	}

}
