package POO;

public class MetodoCliente {
	//ATRIBUTOS
	int dinheiro;
	boolean comida,bebida;
	
	//METODO CONSTRUTOR
	public MetodoCliente ()
	{
		this.dinheiro=80;
		this.comida=true;
		this.bebida=true;
		
				
	}
	
	//METODOS COMPORTAMENTOS
	public void pedido () 
	{
		if (this.comida==false) 
		{
			System.out.println("O cliente não pediu comida");
		}
		else if (this.bebida==false) 
		{
			System.out.println("O cliente não pediu bebida");
		}
		else 
		{
			System.out.println("O cliente pediu comida e bebida");
		}
		
	}
	public void dinheiro () 
	{
		System.out.println("O cliente pagou: "+dinheiro);
	}
	public void ncomida () 
	{
		this.comida=false;
	}
	public void nbebida () 
	{
		this.bebida=false;
	}
	public void estado () 
	{
		System.out.println("O que o cliente pediu? "+"\n");
		if (comida==true && bebida==true ) 
		{
			System.out.println("Pediu comida e bebida");
		}
		else if (bebida==false) 
		{
			System.out.println("Pediu comida mas bebida não");
		}
		else if (comida==false) 
		{
			System.out.println("Pediu bebida mas sem comida");
		}
		System.out.println("\n"+"Quanto ele pagou? "+this.dinheiro+" reais");
	}
}
