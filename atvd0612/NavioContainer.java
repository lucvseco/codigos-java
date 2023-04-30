package atvd0612;

public class NavioContainer extends Navio {

	private int quantidadeGuindastes;
	private int quantidadeCamaras;
	
	
	public NavioContainer(int id, String nome, int quantidadePoroes, double capacidadeCarga, String disponibilidade,
			int quantidadeGuindastes, int quantidadeCamaras) {
		super(id, nome, quantidadePoroes, capacidadeCarga, disponibilidade);
		this.quantidadeGuindastes = quantidadeGuindastes;
		this.quantidadeCamaras = quantidadeCamaras;
	}


	public int getQuantidadeGuindastes() {
		return quantidadeGuindastes;
	}


	public void setQuantidadeGuindastes(int quantidadeGuindastes) {
		this.quantidadeGuindastes = quantidadeGuindastes;
	}


	public int getQuantidadeCamaras() {
		return quantidadeCamaras;
	}


	public void setQuantidadeCamaras(int quantidadeCamaras) {
		this.quantidadeCamaras = quantidadeCamaras;
	}
	
	

}
