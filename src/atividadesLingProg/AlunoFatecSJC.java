package atividadesLingProg;

public class AlunoFatecSJC {
	
	private double ra;
	private String nome;
	private double qtdDisciplinasCursadas;
	private double nota;
	
	
	AlunoFatecSJC(double ra, String name, double qtdDisciplicasCursadas, double nota){
		this.ra = ra;
		this.nome = nome;
		this.qtdDisciplinasCursadas = qtdDisciplicasCursadas;
		this.nota = nota;
	}	
	
	
	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	
	
	public double getRa() {
		return ra;
	}
	public void setRa(int ra) {
		this.ra = ra;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getQtdDisciplinasCursadas() {
		return qtdDisciplinasCursadas;
	}
	public void setQtdDisciplinasCursadas(double qtdDisciplinasCursadas) {
		this.qtdDisciplinasCursadas = qtdDisciplinasCursadas;
	}
	
	public void horario(){
		System.out.println("Horário");
	}
	
	public void historico(){
		System.out.println("Historico");
	}

	public void falta(){
		System.out.println("Faltas");
	}
	

	
	
	

}
