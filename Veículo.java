package autarquia_POO;

public class Veículo {
	
	private String modelo; 
	private int placa;
	private String marca;
	private int ano;
	private Pessoa proprietario;
	
	public Veículo(String modelo, int placa, String marca, int ano, Pessoa proprietario) {
		this.modelo = modelo;
		this.placa = placa;
		this.marca = marca;
		this.ano = ano;
		this.proprietario = proprietario;
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getPlaca() {
		return placa;
	}
	public void setPlaca(int placa) {
		this.placa = placa;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public Pessoa getProprietario() {
		return proprietario;
	}
	public void setProprietario(Pessoa proprietario) {
		this.proprietario = proprietario;
	}
}
