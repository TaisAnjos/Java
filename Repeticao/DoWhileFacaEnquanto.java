package Repeticao;

import java.util.Scanner;

public class DoWhileFacaEnquanto {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int n,n1=0;
		
		do 
		{
			System.out.println("Digite um número: ");
			n = leia.nextInt();
			
				n1=(n+n1);
				
		}while(n!=0);
		
	 System.out.println("A soma dos números é: "+n1);

	}

}
