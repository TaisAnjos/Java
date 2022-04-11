package VetoreMatriz;

import java.util.Scanner;

public class Vetor2 {

	public static void main(String[] args) {
		int vet [] = new int [10];
		int x,media=0,n=0,maior = -1,n1=1;
		Scanner leia = new Scanner(System.in);
	 
		
		for (x=0;x<10;x++) 
		{
			System.out.println("Digite um número até 6: ");
			vet[x] = leia.nextInt();
		
			for (x=0;x<10;x++)
			{	
			if (vet[x]>maior) 
			{
				maior = vet[x];
			}
			}
			if (maior==vet[x]) 
			{
				n++;
			}
			media= vet[x]+vet[x]+media/10;

		}
		for (x=0;x<10;x++)
		{
			System.out.print(vet[x]+"\t");		
		}
	
		System.out.println();
		System.out.println(" O maior número apareceu: "+n+" vezes");
		System.out.println("A média é: "+media);
	}

	}

