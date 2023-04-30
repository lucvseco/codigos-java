package atvd0510;

public class Exame {

	private int idExame;
	private String tipoExame;
	private int nivelGlicose;

	public Exame (int idExame, String tipoExame, int nivelGlicose) {
		this.idExame = idExame;
		this.tipoExame = tipoExame;
		this.nivelGlicose = nivelGlicose;
	}
	
	public int obterDiagnostico () {
		return nivelGlicose;
	}
	public int getIdExame() {
		return idExame;
	}

	public void setIdExame(int idExame) {
		this.idExame = idExame;
	}

	public String getTipoExame() {
		return tipoExame;
	}

	public void setTipoExame(String tipoExame) {
		this.tipoExame = tipoExame;
	}

	public int getNivelGlicose() {
		return nivelGlicose;
	}
}