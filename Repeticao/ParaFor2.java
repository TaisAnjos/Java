package Repeticao;

import java.util.Scanner;

public class ParaFor2 {

	public static void main(String[] args) {
	Scanner leia = new Scanner (System.in);
	int n1 = 0; int n2 = 0;
	
	for (int n=0;n<=10;n++) 
	{
		if (n%2==0) 
		{
			n1++;
		}
		else if (n%2==1) 
		{
			n2++;
		}
	}
	System.out.println("A quantidade de números impares é: "+n2);
	System.out.println("A quantidade de números pares é: "+n1);
	}

}
