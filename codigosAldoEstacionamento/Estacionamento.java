package codigosAldoEstacionamento;

public class Estacionamento {
	
	private int codigo;
	private String nome;
	private String cidade;
	private int vagas;
	private boolean situacao;
	private double valorInicial;
	private double valorAdicional;
	private int horaFranquiaInicial;
	
	public Estacionamento(int codigo, String nome, String cidade, int vagas,
			              double valorInicial, double valorAdicional,
			              int horaFranquiaInicial) {
		this.codigo = codigo;
		this.nome = nome;
		this.cidade = cidade;
		this.vagas = vagas;
		this.valorInicial = valorInicial;
		this.valorAdicional = valorAdicional;
		this.horaFranquiaInicial = horaFranquiaInicial;
		// Desnecessário pois atributos boolenos são inicializado com false
		this.situacao = false; 
	}

	
	public void ativar() {
		if (situacao == false) {
			this.situacao = true;			
		}
	}
	
	public void desativar() {
		if (situacao == true) {
			this.situacao = false;
		}
	}
	
	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public void setSituacao(boolean situacao) {
		this.situacao = situacao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getVagas() {
		return vagas;
	}

	public void setVagas(int vagas) {
		this.vagas = vagas;
	}

	public double getValorInicial() {
		return valorInicial;
	}

	public void setValorInicial(double valorInicial) {
		this.valorInicial = valorInicial;
	}

	public double getValorAdicional() {
		return valorAdicional;
	}

	public void setValorAdcional(double valorAdcional) {
		this.valorAdicional = valorAdcional;
	}

	public int getHoraFranquiaInicial() {
		return horaFranquiaInicial;
	}

	public void setHoraFranquiaInicial(int horaFranquiaInicial) {
		this.horaFranquiaInicial = horaFranquiaInicial;
	}

	public int getCodigo() {
		return codigo;
	}

	public boolean isSituacao() {
		return situacao;
	}
}