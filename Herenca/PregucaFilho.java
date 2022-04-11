package Herenca;

public class PregucaFilho extends AnimalMae{
	private String ficaemarvores;

	public String getFicaemarvores() {
		return ficaemarvores;
	}

	public void setFicaemarvores(String ficaemarvores) {
		this.ficaemarvores = ficaemarvores;
	}

	@Override
	public void emitirSom()
	{	
		System.out.println("ZzZz...");
	}

}
