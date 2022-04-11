package Herenca;

public class ObjetoCavalo {

	public static void main(String[] args) {
		CavaloFilho horse = new CavaloFilho();
		
		horse.setNome("Bela");
		System.out.println("Nome: "+horse.getNome());
		horse.setIdade(5);
		System.out.println("Idade: "+horse.getIdade()+" anos");
		horse.setDevecorrer("sim");
		
		horse.emitirSom();
		
		System.out.println("Um cavalo corre? "+horse.getDevecorrer());
	}

}
