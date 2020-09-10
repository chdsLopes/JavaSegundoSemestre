package atividadesLingProg;

public class Lugar {
	
	private String nome;
	private String pontoTuristico;
	private int populacao;
	private String pais;
	private String clima;
	
	Lugar(String nome ,String pontoTuristico, int populacao, String pais){
		this.nome = nome;
		this.populacao = populacao;
		this.pontoTuristico  = pontoTuristico;
		this.pais= pais;
		
	}



	public String getPais() {
		return pais;
	}



	public void setPais(String pais) {
		this.pais = pais;
	}



	public String getClima() {
		return clima;
	}

	public void setClima(String clima) {
		this.clima = clima;
	}

	public String getNome() {
		return nome;
	}

	public void setName(String name) {
		this.nome = name;
	}

	public String getPontosTuristicos() {
		return pontoTuristico;
	}

	public void setPontosTuristicos(String pontosTuristicos) {
		this.pontoTuristico = pontosTuristicos;
	}

	public int getPopulacao() {
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
	
	public void descansar() {
		System.out.println("Estou descansando");
		
	}
	
	
	
	
	

}
