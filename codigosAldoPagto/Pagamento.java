package codigosAldoPagto;

import java.util.Date;

public class Pagamento {
	static private int id;
	private Date data;
	private float valor;
	
	public Pagamento(float valor) {
		id = gerarId();
		this.data = new Date();
		this.setValor(valor);
	}
	
	public int getId() {
		return id;
	}
	
	public int gerarId() {
		return id+=1;
	}
	
	public Date getData() {
		return data;
	}
	
	public float getValor() {
		return valor;
	}
	
	public void setValor(float valor) {
		this.valor = (valor < 0f ? 0.0f : valor)                       ;
	}	
}
