package atividadesLingProg;

public class Lugar {
	
	private String name;
	private String pontosTuristicos;
	private double populacao;
	
	Lugar(String name , double populacao){
		this.name = name;
		this.populacao = populacao;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPontosTuristicos() {
		return pontosTuristicos;
	}

	public void setPontosTuristicos(String pontosTuristicos) {
		this.pontosTuristicos = pontosTuristicos;
	}

	public double getPopulacao() {
		return populacao;
	}

	public void setPopulacao(int populacao) {
		this.populacao = populacao;
	}
	
	public void passear() {
		System.out.println("Curtindo");
		
	}
	
	public void locomover() {
		System.out.println("Estou me locomovendo");
		
	}
	
	public void descancar() {
		System.out.println("Estou descansando");
		
	}
	
	
	
	
	

}
