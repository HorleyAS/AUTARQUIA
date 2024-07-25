package autarquia_POO;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class Main {

	public static void main(String[] args) {
		
		List<Multa> multas;
		multas = new ArrayList();
		
		Multa m1 = new Multa("Passou Sinal Vermelho", "alta", "overspeed", 1, 500.0);
		multas.add(m1);
		
		Condutor p1 = new Condutor("Jose", 123, 321, "A");
	
		Veículo v1 = new Veículo("UNO", 456,"FIAT", 2001, p1);
		
		Local l1 = new Local("A", "PICI", 60000000, "Fortaleza");
		
		Autuador a1 = new Autuador();
		
		a1.autuar(m1, v1, l1, p1, new Date(), 1);
		
		
		for (int i = 0; i < a1.getAutuacoes(p1).size(); i++) {
			System.out.println(a1.getAutuacoes(p1).get(i).getAutuado().getNome());
			}

}
}
