package atvd0612;

public class NavioGraneleiro extends Navio {

	private int quantidadeEscotilhas;

	public NavioGraneleiro(int id, String nome, int quantidadePoroes, double capacidadeCarga, String disponibilidade,
			int quantidadeEscotilhas) {
		super(id, nome, quantidadePoroes, capacidadeCarga, disponibilidade);
		this.quantidadeEscotilhas = quantidadeEscotilhas;
	}

	public int getQuantidadeEscotilhas() {
		return quantidadeEscotilhas;
	}

	public void setQuantidadeEscotilhas(int quantidadeEscotilhas) {
		this.quantidadeEscotilhas = quantidadeEscotilhas;
	} 
	
	

}
