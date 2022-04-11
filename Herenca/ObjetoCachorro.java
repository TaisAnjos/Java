package Herenca;

public class ObjetoCachorro {

	public static void main(String[] args) {
		CachorroFilho dog = new CachorroFilho();
		
		dog.setNome("Simba");
		System.out.println("Nome: "+dog.getNome());
		dog.setIdade(2);
		System.out.println("Idade: "+dog.getIdade()+" anos");
		dog.setDevecorrer("sim");
		
		 dog.emitirSom();
		
		System.out.println("Um cachorro corre? "+dog.getDevecorrer());
		
	}

}
