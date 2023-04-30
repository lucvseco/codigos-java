package codigosAldoPagto;

public class PagamentoCredito extends Pagamento{
	private String bandeira;
	private String numero;
	private int    qtdeParcelas;
		
	public PagamentoCredito(String bandeira, String numero, int qtdeParcelas, float valor) {
		super(valor);
		this.bandeira = bandeira;
		this.numero = numero;
		this.qtdeParcelas = qtdeParcelas;
	}
	
	public String getBandeira() {
		return bandeira;
	}
	
	public void setBandeira(String bandeira) {
		this.bandeira = bandeira;
	}
	
	public String getNumero() {
		return numero;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public int getQtdeParcelas() {
		return qtdeParcelas;
	}
	
	public void setQtdeParcelas(int qtdeParc) {
		this.qtdeParcelas = qtdeParc;
	}
}