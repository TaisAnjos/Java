package Herenca;

public class ObjetoPreguca {

	public static void main(String[] args) {
		
		PregucaFilho preg = new PregucaFilho();
		
		preg.setNome("Bob");
		System.out.println("Nome: "+preg.getNome());
		preg.setIdade(7);
		System.out.println("Idade: "+preg.getIdade()+" anos");
		preg.setFicaemarvores("sim");
		
		preg.emitirSom();
	
		System.out.println("Fica em arvores? "+preg.getFicaemarvores());
	}

}
