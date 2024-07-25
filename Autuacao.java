package autarquia_POO;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class Autuacao{
	
	private Multa multa;
	private Veículo veiculo;
	private Local local;
	private Pessoa autuado;
	private Date data;
	private int id;
	
	List<Multa> multas;
	
	public Autuacao(Multa multa, Veículo veiculo, Local local, Pessoa autuado, Date data, int id) {
		multas = new ArrayList();
		multas.add(multa);
		this.veiculo = veiculo;
		this.local = local;
		this.autuado = autuado;
		this.data = data;
		this.id = id;
	}


	public String getNome() {
		return multas.get(0).getNome();
	}


	public void setMulta(Multa multa) {
		multas.add(multa);
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
