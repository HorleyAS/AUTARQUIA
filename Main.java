package autarquia_POO;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class Main {

	public static void main(String[] args) {
		
		List<Multa> multas;
		multas = new ArrayList();
		List<Pessoa> pessoas;
		pessoas = new ArrayList();
		List<Veículo> veiculos;
		veiculos = new ArrayList();
		List<Local> locais;
		locais = new ArrayList();
		List<Autuacao> autuacoes;
		autuacoes = new ArrayList();
		
		Multa m1 = new Multa("Passou Sinal Vermelho", "alta", "overspeed", 1, 500.0);
		multas.add(m1);
		
		Pessoa p1 = new Pessoa("Jose", 123, 321, "A");
		pessoas.add(p1);
		
		Veículo v1 = new Veículo("UNO", 456,"FIAT", 2001, p1);
		veiculos.add(v1);
		
		Local l1 = new Local("A", "PICI", 60000000, "Fortaleza");
		locais.add(l1);

		Autuacao a1 = new Autuacao(m1, v1, l1, p1, new Date(), 1);
		autuacoes.add(a1);
		
		System.out.println( " Id da multa:" + a1.getId() + "\n Multa:"
				+ a1.getNome() + "\n Data:"
				+ a1.getData());

}
}
