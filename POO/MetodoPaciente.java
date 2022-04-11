package POO;

public class MetodoPaciente {
	//ATRIBUTOS
	String nome,risco;
	int idade;
	boolean atendido;
	//METODO CONSTRUTOR
	public  MetodoPaciente() 
	{
		this.nome="Tais";
		this.risco="Amarelo";
		this.atendido=false;
		this.idade=19;
	}
	//COMPORTAMENTAL
	public void atendimento()
	{
		if (atendido==false)
		{
		System.out.println("Paciente não foi atendido ainda.");
		}
		else 
		{
			System.out.println("Paciente atendido.");
		}
	}
	public void natendido () 
	{
		this.atendido=false;
	}
	public void satendido () 
	{
		this.atendido=true;
	}
	//STATUS
	public void estado () 
	{
		System.out.println("Nome do paciente: "+this.nome);
		System.out.println("Idade: "+this.idade);
		System.out.println("Nível de risco: "+this.risco);
		System.out.println("Já foi antendido? "+this.atendido);
	}
}
