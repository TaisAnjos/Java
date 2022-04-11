package Repeticao;

import java.util.Scanner;

public class EnquantoWhile2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int idade,n=0,n1=0,n2=0,n3=0,n4=0,n5=0,n6=0,sexo,temperamento;
		
		while (n<=150) 
		{
			System.out.println("Qual a sua idade?: ");
			idade = leia.nextInt();
			System.out.println("Qual o seu sexo?: "+"'1: Masculino, 2: Feminino: 3: Outros");
			sexo = leia.nextInt();
			System.out.println("Você é:   4: calmo, 5: nervoso, 6: agressivo");
			temperamento = leia.nextInt();
			
			if (sexo==1 && temperamento==6) 
			{
				n1++;
			}
			else if (sexo==2 && temperamento==5) 
			{
				n2++;
			}
			else if (temperamento==4) 
			{
				n3++;
			}
			else if (sexo==3 && temperamento==4) 
			{
				n4++;
			}
			else if (temperamento==5 && idade>40) 
			{
				n5++;
			}
			else if (temperamento==4 && idade<18) 
			{
				n6++;
			}
			else if(n<=150) 
			{
				n++;
			}
			
		}
		System.out.println("A quantidade de homens agressivos é: "+n1);
		System.out.println("A quantidade de mulheres nervosas é: "+n2);
		System.out.println("A quantidade de pessoas calmas é: "+n3);
		System.out.println("A quantidade de outros com temperamento calmo é: "+n4);
		System.out.println("A quantidade de pessoas nervosas com mais de 40 anos é: "+n5);
		System.out.println("A quantidade de pessoas calmas com menos de 18 anos é: "+n6);

	}

}
