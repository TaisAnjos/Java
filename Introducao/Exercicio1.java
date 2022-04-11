package Introducao;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		int n1,n2,n3,maior=0;
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("Digite um número: ");
		n1 = leia.nextInt();
		System.out.println("Digite outro número: ");
		n2 = leia.nextInt();
		System.out.println("Digite o terceiro número: ");
		n3 = leia.nextInt();
		
		if (n1>(n2)+(n3) )
		{
			maior=n1;
		}
		else if (n2> (n1)+(n3)) 
		{
			maior=n2;
		}
		else if (n3> (n2)+(n1))
		{
			maior=n3;
		}
		System.out.println("O maior número é: "+maior);
		
	}

}
