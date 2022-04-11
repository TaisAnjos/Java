package POO;

public class MetodoConta {
	String banco,tipo;
	double saldo;
	boolean cartaocred;
	//METODO CONSTRUTOR
	public MetodoConta () 
	{
		this.saldo=-800.00;
		this.banco="Inter";
		this.cartaocred=false;
		this.tipo="Conta-sálario";
	}
	//COMPORTAMENTAL
	public void cartao ()
	{
		if (cartaocred==true) 
		{
			System.out.println("Seu pedido de cartão está em processo de entrega.");
		}
		else
		{
			System.out.println("Seu cartão não foi aprovado.");
		}
	}
	public void aprovado () 
	{
		this.cartaocred=true;
	}
	public void negado () 
	{
		this.cartaocred=false;
	}
	//STATUS
	public void estado () 
	{
		System.out.println("Nome do banco: "+this.banco);
		System.out.println("Seu saldo: "+this.saldo);
		System.out.println("Cartão de crédito aprovado? "+this.cartaocred);
		
	}

}
