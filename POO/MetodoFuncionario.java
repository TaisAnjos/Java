package POO;

public class MetodoFuncionario {
	//ATRIBUTOS
	String nome,função;
	int salario;
	boolean presenca;
	//METODO CONSTRUTOR
	public MetodoFuncionario () 
	{
		this.presenca=false;
		this.salario=1200;
		this.nome="Nome não cadastrado";
		this.função="Atendimento no balcão";
		
	}
	//METODO COMPORTAMENTAL
	public void trabalho () 
	{
		if (presenca==true) 
		{
		System.out.println("Está presente");
		}
		else
		{
			System.out.println("O funcionário não está presente.");
		}
	}
	public void faltou ()
	{
		this.presenca=false;
	}
	public void presente () 
	{
		this.presenca=true;
	}
	//STATUS
	public void estado () 
	{
		System.out.println("Nome do funcionário: "+this.nome);
		System.out.println("Função do funcionário: "+this.função);
		System.out.println("Salário do funcionário: "+this.salario);
		System.out.println("Funcionário está presente? "+this.presenca);
	}
}
