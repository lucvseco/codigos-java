package codigosAldoPagto;

public class PagamentoDebito extends Pagamento{
	private int banco;
	private int agencia;
	private int conta;
	
	public PagamentoDebito(int banco, int agencia, int conta, float valor) {
		super(valor);
		this.banco = banco;
		this.agencia = agencia;
		this.conta = conta;
	}
	
	public int getBanco() {
		return banco;
	}
	
	public void setBanco(int banco) {
		this.banco = banco;
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public int getConta() {
		return conta;
	}
	
	public void setConta(int conta) {
		this.conta = conta;
	}
}