package atvd0512;

public class Estacionamento {
	

	private int codigo;
	private String nome;
	private String cidade;
	private int vagas;
	private boolean situacao = false;
	private float valorInicial;
	private float valorAdicional;
	private int franquiaInicial;
	public Estacionamento(String nome,int codigo, String cidade, int vagas, float
	valorInicial,
	float valorAdicional, int franquiaInicial) {
	this.codigo = codigo;
	this.nome = nome;
	this.cidade = cidade;
	this.vagas = vagas;
	this.valorInicial = valorInicial;
	this.valorAdicional = valorAdicional;
	this.franquiaInicial = franquiaInicial;
	}
	public void ativar() {
	if(!this.situacao) {
	this.situacao = !this.situacao;
	}
	}
	public void desativar() {
	if(this.situacao) {
	this.situacao = !this.situacao;
	}
	}
	public String getNome() {
	return nome;
	}
	public void setNome(String nome) {
	this.nome = nome;
	}
	public String getCidade() {
	return cidade;
	}
	public void setCidade(String cidade) {
	this.cidade = cidade;
	}
	public int getVagas() {
	return vagas;
	}
	public void setVagas(int vagas) {
	this.vagas = vagas;
	}
	public float getValorInicial() {
	return valorInicial;
	}
	public void setValorInicial(float valorInicial) {
	this.valorInicial = valorInicial;
	}
	public float getValorAdicional() {
	return valorAdicional;
	}
	public void setValorAdicional(float valorAdicional) {
	this.valorAdicional = valorAdicional;
	}
	public int getFranquiaInicial() {
	return franquiaInicial;
	}
	public void setFranquiaInicial(int franquiaInicial) {
	this.franquiaInicial = franquiaInicial;
	}
	public int getCodigo() {
	return codigo;
	}
	public boolean isSituacao() {
	return situacao;
	}
}
