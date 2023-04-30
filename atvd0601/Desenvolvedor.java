package atvd0601;

public class Desenvolvedor {

		private int idDesenvolvedor;
		private String nome;
		private double valorHora;
		private double receitaEmAberto;
		private Funcionalidade funcionalidade;
		
		public Desenvolvedor(int idDesenvolvedor, String nome, double valorHora, 
				double receitaEmAberto, Funcionalidade funcionalidade) {
			super();
			this.idDesenvolvedor = idDesenvolvedor;
			this.nome = nome;
			this.valorHora = valorHora;
			this.receitaEmAberto = receitaEmAberto;
			this.funcionalidade = funcionalidade;
		}
		
		/*	public void creditarFuncionalidade (char tipo, double valor, Funcionalidade funcionalidade) {
			char tipo = '';
			switch (tipo) {
			case 'D':
				receitaEmAberto += this.funcionalidade.getValor() * 0.02 +
				this.funcionalidade.getValor() * this.funcionalidade.getMinutosParaImplementar() / 60;
				break;
			case 'A':
				receitaEmAberto += this.funcionalidade.getValor() * 0.01 + 
				this.funcionalidade.getValor() * this.funcionalidade.getMinutosParaImplementar() / 60;
				break;
			case 'C':
				receitaEmAberto += this.funcionalidade.getValor() * 0.0 + 
				this.funcionalidade.getValor() * this.funcionalidade.getMinutosParaImplementar() / 60;
				break;
			}
			
			}
		*/
		public boolean debitarPagamento (double valor) {			
			if (receitaEmAberto > valor) {
			return true;
			}else {
				System.out.println("Pagamento não realizado.");
			return false;
			}
		}

		public double getValorHora() {
			return valorHora;
		}

		public void setValorHora(double valorHora) {
			this.valorHora = valorHora;
		}

		public double getReceitaEmAberto() {
			return receitaEmAberto;
		}

		public void setReceitaEmAberto(double receitaEmAberto) {
			this.receitaEmAberto = receitaEmAberto;
		}

		public int getIdDesenvolvedor() {
			return idDesenvolvedor;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public void setIdDesenvolvedor(int idDesenvolvedor) {
			this.idDesenvolvedor = idDesenvolvedor;
		}

		
		
	}


