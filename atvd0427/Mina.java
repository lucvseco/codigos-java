package atvd0427;

public class Mina {

	    private int idMina;
		private String minerio;
		private int estoque;
		private String status;

		public Mina(int idMina, String minerio) {
			this.idMina = idMina;
			this.minerio = minerio;
			this.status = "desativada";
		}
		
		
		public void registrarProducao(int qtde) {
			estoque += qtde;
		}

		public void registrarEscoamento(int qtde) {
			estoque -= qtde;
		}

		public int getIdMina() {
			return idMina;
		}

		public void setIdMina(int idMina) {
			this.idMina = idMina;
		}

		public String getMinerio() {
			return minerio;
		}

		public void setMinerio(String minerio) {
			this.minerio = minerio;
		}

		public int getEstoque() {
			return estoque;
		}


		

		
	}
