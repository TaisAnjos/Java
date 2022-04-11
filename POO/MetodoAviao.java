package POO;

public class MetodoAviao {
	//ATRIBUTOS
	String cor,tipo,nome;
	int percorre;
	boolean voando;
	
	//METODO CONSTRUTOR
	public MetodoAviao () 
	{
		this.cor="branco";
		this.tipo="Avião comercial";
		this.nome="Airbus A320";
		this.percorre=12;
		this.voando=false;
	}
	//METODO COMPORTAMENTAL
	public void voando () 
	{
		if (voando==true) 
		{
			System.out.println("Voando....");
		}
		else 
		{
			System.out.println("Avião no chão.");
		}
	}
	public void noar () 
	{
		this.voando=true;
	}
	public void nochão () 
	{
		this.voando=false;
	}
	//ESTADO
	public void estado () 
	{
		System.out.println("Qual a cor do avião? "+this.cor);
		System.out.println("Qual o tipo do avião? "+this.tipo);
		System.out.println("Qual o nome do avião? "+this.nome);
		System.out.println("Quanto ele percorreu?  "+this.percorre+" mil milhas");
		System.out.println("Ele está voando? "+this.voando);
	}
}
