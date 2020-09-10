package atividadesLingProg;

public class Profissional {
	
	private double salario;
	private String nome;
	private String cargo;
	private String departamento;
	private int registro;
	
	Profissional(String nome, String cargo, int registro, String departamento, double salario){
		this.nome = nome;
		this.cargo = cargo;
		this.registro = registro;
		this.departamento= departamento;
		this.salario=salario;
	}
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public int getRegistro() {
		return registro;
	}
	public void setRegistro(int registo) {
		this.registro = registo;
	}
	
	public void trabalhar() {
		System.out.println("Trabalhando");
	}
	
	public void descansar() {
		System.out.println("Descançando");
	}
	
	public void reunir() {
		System.out.println("Em reunião");
	}
	

}
