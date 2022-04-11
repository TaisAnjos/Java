package Introducao;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double n, raiz,potencia;
		
		System.out.print("Número: ");
		n = leia.nextDouble();
		
		if (n%2==1) 
		{
			potencia=Math.pow(n, 2);
			System.out.println("A potencia é: "+potencia);
		}
		else if (n%2==0) 
		{
			raiz=Math.sqrt(n);
			System.out.println("A raiz é: "+raiz);
		}
		
	}

}
