package codigosAldoMinaMinerio;

public class Mina {
    private int id;
    private int estoque;
    private Minerio minerio;

    public Mina(int id, Minerio minerio) {
        this.id = id;
        this.minerio = minerio;
    }

	public Minerio getMinerio() {
		return minerio;
	}

	public void setMinerio(Minerio minerio) {
		this.minerio = minerio;
	}

	public int getId() {
		return id;
	}

	public int getEstoque() {
		return estoque;
	}

	public void producao(int qtde) {
		this.estoque+=qtde;
	}
    
	public void escoamento(int qtde) {
		this.estoque-=qtde;
	}

}