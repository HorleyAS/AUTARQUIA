package autarquia_POO;

public class Agente extends Pessoa{

		int codAgente;
		
		public Agente(String nome, int cpf, int codAgente) {
			super(nome, cpf);
			this.codAgente = codAgente;
		}
}
