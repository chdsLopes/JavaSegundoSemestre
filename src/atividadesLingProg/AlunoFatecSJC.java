package atividadesLingProg;

public class AlunoFatecSJC {
	
	private double ra;
	private String nome;
	private double qtdDisciplinasCursadas;
	private double nota;
	
	
	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	AlunoFatecSJC(double ra, String name, double qtdDisciplicasCursadas){
		this.ra = ra;
		this.nome = name;
		this.qtdDisciplinasCursadas = qtdDisciplicasCursadas;
	}
	
	public double getRa() {
		return ra;
	}
	public void setRa(int ra) {
		this.ra = ra;
	}
	public String getName() {
		return nome;
	}
	public void setName(String name) {
		this.nome = name;
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
