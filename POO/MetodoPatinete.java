package POO;

public class MetodoPatinete {
	//ATRIBUTOS
	String cor,tipo;
	int preco;
	boolean funcionando;
	//METODO CONSTRUTOR
	public MetodoPatinete () 
	{
		this.cor="Branco";
		this.tipo="Elétrico";
		this.preco=2000;
		
	}
	//COMPORTAMENTAL
	public void ligado () 
	{
		if (funcionando==true) 
		{
			System.out.println("Patinete em movimento...");
		}
		else 
		{
			System.out.println("Patinete parado.");
		}
	}
	public void funci () 
	{
		this.funcionando=true;
	}
	public void parad ()
	{
		this.funcionando=false;
	}
	//STATUS
	public void estado () 
	{
		System.out.println("Cor do patinete: "+this.cor);
		System.out.println("Tipo do patinete: "+this.tipo);
		System.out.println("Preço do patinete: "+this.preco);
	}
}
