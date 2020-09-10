package atividadesLingProg;

public class Pessoa {
	
	
	private float cpf;
	private String name;
	private int idade;
	private double altura;
	private String genero;
	
	
	
	Pessoa(float cpf, String name, int idade, double altura, String genero){
		this.cpf = cpf;
		this.name = name;
		this.idade = idade;
		this.altura = altura;
		this.genero = genero;
	}
	
	
	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public float getCpf() {
		return cpf;
	}
	public void setCpf(float cpf) {
		this.cpf = cpf;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void falar() {
		System.out.println("Estou falando");
	}
	public void andar() {
		System.out.println("Estou andando");
	}
	public void comer() {
		System.out.println("Estou comendo");
	}
	
	


}
