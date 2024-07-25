package autarquia_POO;

public class Condutor extends Pessoa{
	
	public Condutor(String nome, int cpf, int cnh, String tipoCnh){
		super(nome, cpf);
		this.cnh = cnh;
		this.tipoCnh = tipoCnh;
	}
	
	private int cnh;
	private String tipoCnh;
	
	
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
