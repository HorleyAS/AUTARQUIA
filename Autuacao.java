package autarquia_POO;
import java.util.Date;

public class Autuacao{
	
	private Multa multa;
	private Veículo veiculo;
	private Local local;
	private Pessoa autuado;
	private Date data;
	private int id;
	

	public Autuacao(Multa multa, Veículo veiculo, Local local, Pessoa autuado, Date data, int id) {
		this.multa = multa;
		this.veiculo = veiculo;
		this.local = local;
		this.autuado = autuado;
		this.data = data;
		this.id = id;
	}


	public String getNome() {
		return multa.getNome();
	}


	public void setMulta(Multa multa) {
		this.multa = multa;
	}


	public Veículo getVeiculo() {
		return veiculo;
	}


	public void setVeiculo(Veículo veiculo) {
		this.veiculo = veiculo;
	}


	public Local getLocal() {
		return local;
	}


	public void setLocal(Local local) {
		this.local = local;
	}


	public Pessoa getAutuado() {
		return autuado;
	}


	public void setAutuado(Pessoa autuado) {
		this.autuado = autuado;
	}


	public Date getData() {
		return data;
	}


	public void setData(Date data) {
		this.data = data;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}
	
}
