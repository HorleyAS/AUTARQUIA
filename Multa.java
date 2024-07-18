package autarquia_POO;

public class Multa {

	private double valor;
	private String gravidade;
	private String nome;
    public String getGravidade() {
		return gravidade;
	}

	public void setGravidade(String gravidade) {
		this.gravidade = gravidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPontos() {
		return pontos;
	}

	public void setPontos(int pontos) {
		this.pontos = pontos;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	private int pontos;
    private String descricao;
	
   
    public Multa(String nome, String gravidade, String descricao, int pontos, double valor){
    	this.nome = nome;
    	this.gravidade = gravidade;
    	this.descricao = descricao;
    	this.pontos = pontos;
    	this.valor = valor;
    }

    public void setValor(Double valorSetado){
    	this.valor = valorSetado;
    }

    public Double getValor() {
    	return this.valor;
    }
}
