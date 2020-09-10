package atividadesLingProg;

public class InstrumentoMusical {
	//tipo, fabricante, material, modelo e preço
	
	private String tipo;
	private String fabricante;
	private String material;
	private String modelo;
	private float preco;
	
	
	InstrumentoMusical(String tipo, String fabricante, String modelo){
		this.tipo = tipo;
		this.fabricante = fabricante;
		this.modelo = modelo;
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	
	public void testar() {
		System.out.println("Tocando");
	}
	
	public void comprar() {
		System.out.println("Comprei");
	}
	public void limpar() {
		System.out.println("Limpando");
	}
	
	
	

}
