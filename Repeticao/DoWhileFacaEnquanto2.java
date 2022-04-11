package Repeticao;

import java.util.Scanner;

public class DoWhileFacaEnquanto2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int n,n1=0,n2=0;
		
		do 
		{
			System.out.println("Digite um número: ");
			n = leia.nextInt();
			
			if (n%3==0) 
			{
				n1++;
				n2=(n+n2);
			}
		}while(n!=0);
		System.out.println("A média dos números é: "+n2/n1);
	}

}
