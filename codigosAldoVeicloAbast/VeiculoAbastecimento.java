package codigosAldoVeicloAbast;

public class VeiculoAbastecimento {

	static final double INDICE_EQUILIBRIO = .7;
	static final double MARGEM_SEGURANCA  = .9; // -10%

	private int    idVeiculo;
	private double capacidadeTanque;
	private double kmLitroGasolina;
	private double kmLitroEtanol;
	private double valorGasolina;
	private double valorEtanol;
	private double relacao;
	private char   combMaisEconomico;
	private double valorAbastecimento;
	private double autonomiaTanque;
	
	public VeiculoAbastecimento(int idVeiculo, double capacidadeTanque, 
			                    double kmLitroGasolina, double kmLitroEtanol) {
		this.idVeiculo = idVeiculo;
		this.capacidadeTanque = capacidadeTanque;
		this.kmLitroGasolina = kmLitroGasolina;
		this.kmLitroEtanol = kmLitroEtanol;
	}

	public void setCapacidadeTanque(double capacidadeTanque) {
		this.capacidadeTanque = capacidadeTanque;
	}

	public void setKmLitroGasolina(double kmLitroGasolina) {
		this.kmLitroGasolina = kmLitroGasolina;
	}

	public void setKmLitroEtanol(double kmLitroEtanol) {
		this.kmLitroEtanol = kmLitroEtanol;
	}

	public void setValorGasolina(double valorGasolina) {
		this.valorGasolina = valorGasolina;
	}

	public void setValorEtanol(double valorEtanol) {
		this.valorEtanol = valorEtanol;
	}

	public int getIdVeiculo() {
		return idVeiculo;
	}

	public double getCapacidadeTanque() {
		return capacidadeTanque;
	}

	public double getKmLitroGasolina() {
		return kmLitroGasolina;
	}

	public double getKmLitroEtanol() {
		return kmLitroEtanol;
	}

	public double getValorGasolina() {
		return valorGasolina;
	}

	public double getValorEtanol() {
		return valorEtanol;
	}

	public double getRelacao() {
		return relacao;
	}

	public char getCombMaisEconomico() {
		return combMaisEconomico;
	}

	public double getValorAbastecimento() {
		return valorAbastecimento;
	}

	public double getAutonomiaTanque() {
		return autonomiaTanque;
	}
	
	public void obterCombustivelMaisEconomico() {
		
		this.relacao = this.valorEtanol / this.valorGasolina;
		
		if (relacao >= INDICE_EQUILIBRIO) {
			this.combMaisEconomico = 'G';
		}
		else {
			this.combMaisEconomico = 'E';
		}
		
	}
	
	public void calcularAbastecimento() {
		
		if (this.combMaisEconomico == 'G') {
			this.valorAbastecimento = this.valorGasolina * this.capacidadeTanque;
		}
		else {
			this.valorAbastecimento = this.valorEtanol * this.capacidadeTanque;			
		}
		
	}
	
	public void calcularAutonomiaTanque() {
		if (this.combMaisEconomico == 'G') {
			this.autonomiaTanque = this.capacidadeTanque * this.kmLitroGasolina * MARGEM_SEGURANCA;
		}
		else {
			this.autonomiaTanque = this.capacidadeTanque * this.kmLitroEtanol * MARGEM_SEGURANCA;			
		}
	}	
	
	public double obterAutonomia(char tipoComb, double qtdeComb) {
		return 0;
	}
	
	
}