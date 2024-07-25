package autarquia_POO;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Autuador {
	
	List<Autuacao> autuacoes;
	List<Autuacao> autuacoesP;
	List<Autuacao> autuacoesL;
	List<Autuacao> autuacoesV;
	
	public void autuar(Multa multa, Veículo veiculo, Local local, Pessoa autuado, Date data, int id) {
		autuacoes = new ArrayList();
		Autuacao a1 = new Autuacao( multa, veiculo, local, autuado, data, id);
		autuacoes.add(a1);
	}


	public List<Autuacao> getAutuacoes(Pessoa p){
		autuacoesP = new ArrayList();
		for (int i = 0; i < autuacoes.size(); i++) {
            if(autuacoes.get(i).getAutuado() == p) {autuacoesP.add(autuacoes.get(i)); }
        }
		return autuacoesP;
	}
	public List<Autuacao> getAutuacoes(Local l){
		autuacoesL = new ArrayList();
		for (int i = 0; i < autuacoes.size(); i++) {
            if(autuacoes.get(i).getLocal() == l) {autuacoesL.add(autuacoes.get(i)); }
        }
		return autuacoesL;
	}
	public List<Autuacao> getAutuacoes(Veículo v){
		autuacoesV = new ArrayList();
		for (int i = 0; i < autuacoes.size(); i++) {
            if(autuacoes.get(i).getVeiculo() == v) {autuacoesV.add(autuacoes.get(i)); }
        }
		return autuacoesV;
	}
}