package autarquia_POO;

public class Pessoa {
	
	private String nome;
	private int cpf;
	private int cnh;
	private String tipoCnh;
	
	public Pessoa(String nome, int cpf, int cnh, String tipoCnh) {
		this.nome = nome;
		this.cpf = cpf;
		this.cnh = cnh;
		this.tipoCnh = tipoCnh;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public int getCnh() {
		return cnh;
	}
	public void setCnh(int cnh) {
		this.cnh = cnh;
	}
	public String getTipoCnh() {
		return tipoCnh;
	}
	public void setTipoCnh(String tipoCnh) {
		this.tipoCnh = tipoCnh;
	}
	
}
