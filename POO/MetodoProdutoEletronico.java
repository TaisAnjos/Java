package POO;

public class MetodoProdutoEletronico {
	//ATRIBUTOS
	boolean ligado;
	String tipo,cor;
	double preco;
	
	//METODO CONSTRUTOR
	public MetodoProdutoEletronico () 
	{
		this.ligado=false;
		this.cor="Preto";
		this.tipo="Televisão";
		this.preco=1.200;
		
	}
	//METODO COMPORTAMENTAL
	public void assistindo () 
	{
		if (ligado==true) 
		{
			System.out.println("Ligado no canal do Discovery Kids");
		}
		else
		{
			System.out.println("TV desligada.");
		}
	}
	public void ligada () 
	{
		this.ligado=true;
	}
	public void desligada () 
	{
		this.ligado=false;
	}
	//STATUS
	public void estado () 
	{
		System.out.println("Qual a cor do eletrônico? "+this.cor);
		System.out.println("Qual o tipo de eletrônico? "+this.tipo);
		System.out.println("Qual o preço do eletrônico? "+this.preco+" mil");
		System.out.println("O eletrônico está ligado? "+this.ligado);
		
	}
}
