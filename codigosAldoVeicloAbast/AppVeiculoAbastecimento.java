package codigosAldoVeicloAbast;

public class AppVeiculoAbastecimento {

	public static void main(String[] args) {
		
		VeiculoAbastecimento veiculo = new VeiculoAbastecimento(200, 40, 10, 6);
		
		veiculo.setValorGasolina(10);
		veiculo.setValorEtanol(7);
		
		System.out.println(veiculo.getIdVeiculo());
		System.out.println(veiculo.getValorGasolina());
		System.out.println(veiculo.getValorEtanol());
		
		veiculo.obterCombustivelMaisEconomico();
		
		System.out.println(veiculo.getRelacao());
		System.out.println(veiculo.getCombMaisEconomico());
		
		veiculo.calcularAbastecimento();
		veiculo.calcularAutonomiaTanque();
		
		System.out.println(veiculo.getValorAbastecimento());
		System.out.println(veiculo.getAutonomiaTanque());		
		

	}

}