package codigosAldoMinaMinerio;

public class Minerio {
    private int id;
    private String descricao;

    public Minerio (int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getId() {
		return id;
	}

    
}