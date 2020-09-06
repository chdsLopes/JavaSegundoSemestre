package atividadesLingProg;

public class Pessoa {
	
	
	private int cpf;
	private String name;
	private int idade;
	
	
	
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
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
