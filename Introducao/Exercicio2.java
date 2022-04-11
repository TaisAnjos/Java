package Introducao;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int n1,n2,n3,m1=0,m2=0,m3=0;
		
		System.out.print("Digite um número: ");
		n1 = leia.nextInt();
		System.out.print("Digite outro número: ");
		n2 = leia.nextInt();
		System.out.print("Digite o terceiro número: ");
		n3 = leia.nextInt();
		
		if (n2> n1 && n2>n3 ) 
		{
			m1=n2;
			
		 if(n3> n1)
			{
				m2=n3;
				m3=n1;
			}
		 else if(n3 <n1)
			{
				m2=n1;
				m3=n3;
			}
		}
		if (n1> n2 && n1> n3 ) 
		{
			m1=n1;
			
		 if(n2> n3)
			{
				m2=n2;
				m3=n3;
			}
		 else if(n2 <n3)
			{
				m2=n3;
				m3=n2;
			}
		}
		if (n3> n2 && n3> n1 ) 
		{
			m1=n3;
			
		 if(n2> n1)
			{
				m2=n2;
				m3=n1;
			}
		 else if(n2< n1)
			{
				m2=n1;
				m3=n2;
			}
		}
		System.out.println("A ordem decrescente é: "+m3+","+m2+","+m1);
	}

}
