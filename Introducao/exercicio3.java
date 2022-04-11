package Introducao;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
	Scanner leia = new Scanner (System.in);
	int idade;
	
	System.out.println("Qual a sua idade?: ");
	idade = leia.nextInt();
	
	if (idade>=10 && idade<=14)
	{
		System.out.println("Infantil");
	}
	else if (idade>=15 && idade<=17) 
	{
		System.out.println("Juvenil");
	}
	else if (idade>=18 && idade<=15) 
	{
		System.out.println("Adulto");
	}

	}

}
