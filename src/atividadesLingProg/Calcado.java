package atividadesLingProg;

public class Calcado {
	
	//tipo, material, marca, tamanho e cor
	
	private String tipo;
	private String material;
	private String marca;
	private String cor;
	private int tamanho;
	
	
	Calcado(int tamanho, String tipo, String marca){
		this.tamanho= tamanho;
		this.tipo=tipo;
		this.marca=marca;
	}
	
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	
	public void calcar() {
		System.out.println("Calçando");
	}
	
	public void descalcar() {
		System.out.println("Descalçando");
	}
	
	public void limpar() {
		System.out.println("Limpando"); 
	}

}
