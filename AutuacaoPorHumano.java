package autarquia_POO;

import java.util.Date;

public class AutuacaoPorHumano extends Autuacao {

	Agente agente;
	
	public AutuacaoPorHumano(Multa multa, Veículo veiculo, Local local, Pessoa autuado, Date data, int idMulta, Agente agente) {
		super( multa, veiculo, local, autuado, data, idMulta);
		this.agente = agente;
	}
}
