package atvd0601;

import java.util.Scanner;

public class Funcionalidade {

	private int idFuncionalidade;
	private String descricao;
	private int minutosParaImplementar;
	private double valor; 
	private char tipo[] = {'D', 'C', 'A'};
	private static char status = 'P';
	private Desenvolvedor dev;
	
	public Funcionalidade(int idFuncionalidade, String descricao, int minutosParaImplementar, double valor, char[]tipo,
			char status, Desenvolvedor dev ) {
		super();
		this.idFuncionalidade = idFuncionalidade;
		this.descricao = descricao;
		this.minutosParaImplementar = minutosParaImplementar;
		this.valor = valor;
		this.tipo = tipo;
		this.setStatus(status);
		this.dev = dev;
	
	}
	

	public void atribuirFuncionalidade (Desenvolvedor dev) {
		this.dev.setIdDesenvolvedor(this.getIdFuncionalidade());
		this.status = 'D';
	}
	public void registrarConclusao () {
		this.status = 'C';
	}

	public String getDescricao() {
		return descricao;
	}

	public void setIdFuncionalidade(int idFuncionalidade) {
		this.idFuncionalidade = idFuncionalidade;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getMinutosParaImplementar() {
		return minutosParaImplementar;
	}

	public void setMinutosParaImplementar(int minutosParaImplementar) {
		this.minutosParaImplementar = minutosParaImplementar;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public char[] getTipo() {
		return tipo;
	}

	public void setTipo(char[] tipo) {
		this.tipo = tipo;
	}

	public int getIdFuncionalidade() {
		return idFuncionalidade;
	}

	public static char getStatus() {
		return status;
	}

	public void setStatus(char status) {
		this.status = status;
	}

	
	
	

}