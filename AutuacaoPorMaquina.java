package autarquia_POO;

import java.util.Date;

public class AutuacaoPorMaquina extends Autuacao{
	int idMaquina;
	String modeloMaquina;
	String tipoMaquina;
	
	public AutuacaoPorMaquina(Multa multa, Veículo veiculo, Local local, Pessoa autuado, Date data, int idMulta, int idMaquina,	String modeloMaquina, String tipoMaquina) {
		super( multa,  veiculo,  local,  autuado,  data,  idMulta);
		this.idMaquina = idMaquina;
		this.modeloMaquina = modeloMaquina;
		this.tipoMaquina = tipoMaquina;
		
	}

	public int getIdMaquina() {
		return idMaquina;
	}

	public void setIdMaquina(int idMaquina) {
		this.idMaquina = idMaquina;
	}

	public String getModeloMaquina() {
		return modeloMaquina;
	}

	public void setModeloMaquina(String modeloMaquina) {
		this.modeloMaquina = modeloMaquina;
	}

	public String getTipoMaquina() {
		return tipoMaquina;
	}

	public void setTipoMaquina(String tipoMaquina) {
		this.tipoMaquina = tipoMaquina;
	}
}
