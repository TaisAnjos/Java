package Arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Menus implements EstoqueInterface {
	int n;
	Scanner leia = new Scanner(System.in);
	private String estoque1,estoque2;
	ArrayList<String> estoq = new ArrayList<>();



	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public String getEstoque1() {
		return estoque1;
	}

	public void setEstoque1(String estoque1) {
		this.estoque1 = estoque1;
	}

	public String getEstoque2() {
		return estoque2;
	}

	public void setEstoque2(String estoque2) {
		this.estoque2 = estoque2;
	}

	public ArrayList<String> getEstoq() {
		return estoq;
	}

	public void setEstoq(ArrayList<String> estoq) {
		this.estoq = estoq;
	}

	@Override
	public void menu() {
		System.out.println("Digite o nome de 2 itens no estoque: ");
		System.out.println("Primeiro item: ");
		this.setEstoque1(leia.next());
		System.out.println("Segundo item: ");
		this.setEstoque2(leia.next());
		estoq.add(0,this.getEstoque1());
		estoq.add(1, this.getEstoque2());
		System.out.println();
		System.out.println(estoq);
		System.out.println();
		System.out.println("Informações cadastradas");
	

	}

	@Override
	public void remover() {
		System.out.println();
		System.out.println("Remova um item da lista \n");
		System.out.println("1-"+this.getEstoque1()+" 2-"+this.getEstoque2());
		n= leia.nextInt();
		if (n==1) 
		{
			estoq.remove(0);
			System.out.println("Lista atualizada: "+estoq);
		}
		else if (n==2) 
		{
			estoq.remove(1);
			System.out.println("Lista atualizada: "+estoq);
		}
}
}
