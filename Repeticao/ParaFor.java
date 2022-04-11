package Repeticao;

import java.util.Scanner;

public class ParaFor {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Os número que divididos por 11 tem resto de 5 são: ");
		
		for (int n=100;n<=1999;n++) 
		{
		if (n%11==5) 
		{
		System.out.println(n);}

	}

}
}
