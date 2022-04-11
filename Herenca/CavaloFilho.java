package Herenca;

public class CavaloFilho extends AnimalMae {
	
	private String devecorrer;

	public String getDevecorrer() {
		return devecorrer;
	}

	public void setDevecorrer(String devecorrer) {
		this.devecorrer = devecorrer;
	}

	@Override
	public void emitirSom() 
	{
		System.out.println("Relinchar...");
	}
	

}
