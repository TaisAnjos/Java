package Repeticao;

import java.util.Scanner;

public class EnquantoWhile {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int idad=0;
		int n2=0,n3=0;
		
		
		while (idad!=99) 
		{
			System.out.println("Digite sua idade: ");
			idad = leia.nextInt();
			
			if (idad<21) 
			{
				n2++;
			}
			else if (idad>50) 
			{
				n3++;
			}
		}
		System.out.println("O número de pessoas com menos de 21 anos é: "+n2);
		System.out.println("O número de pessoas com mais de 50 anos é: "+n3);
	}

}
