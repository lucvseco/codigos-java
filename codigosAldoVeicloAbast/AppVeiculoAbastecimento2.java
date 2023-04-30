package codigosAldoVeicloAbast;

import java.util.Scanner;

public class AppVeiculoAbastecimento2 {

	public static void main(String[] args) {
		Scanner lerTeclado = new Scanner(System.in);
		
		
		VeiculoAbastecimento[] veiculos = new VeiculoAbastecimento[3];
		
		for (int i=0; i<veiculos.length; i++) {
			System.out.printf("\nIdentificador veículo %d: ", (i+1));
			int id = lerTeclado.nextInt();
			System.out.print("Capacidade do tanque");
			double capacidade = lerTeclado.nextDouble();
			System.out.print("Km/Litro - Gasolina: ");
			double kmLitroGasolina = lerTeclado.nextDouble();
			System.out.print("Km/Litro - Etanol: ");
			double kmLitroEtanol = lerTeclado.nextDouble();
			VeiculoAbastecimento veiculo = new VeiculoAbastecimento(id, capacidade, kmLitroGasolina, kmLitroEtanol);

			System.out.print("Valor Gasolina R$: ");
			double valorGasolina = lerTeclado.nextDouble();
			System.out.print("Valor Etanol R$: ");
			double valorEtanol = lerTeclado.nextDouble();
			veiculo.setValorGasolina(valorGasolina);
			veiculo.setValorEtanol(valorEtanol);			
			veiculo.obterCombustivelMaisEconomico();
			veiculo.calcularAbastecimento();
			veiculo.calcularAutonomiaTanque();		
		
			veiculos[i]=veiculo;
		

		}
		
		
		for (int i=0; i<veiculos.length; i++) {
			System.out.println("Identificador      : " + veiculos[i].getIdVeiculo());
			System.out.println("Capacid. Tanque    : " + veiculos[i].getCapacidadeTanque());
			System.out.println("Km/Litro - Gasolina: " + veiculos[i].getKmLitroGasolina());
			System.out.println("Km/Litro - Etanol  : " + veiculos[i].getKmLitroEtanol());
			System.out.println("Valor Gasolina     : R$ " + veiculos[i].getValorGasolina());
			System.out.println("Valor Etanol       : R$ " + veiculos[i].getValorEtanol());

			System.out.println("Relação            : " + veiculos[i].getRelacao());
			System.out.println("Comb. Mais Econom. : " + veiculos[i].getCombMaisEconomico());
			System.out.println("Valor do Abastecim.: R$ " + veiculos[i].getValorAbastecimento());
			System.out.println("Autonomia do tanque: " + veiculos[i].getAutonomiaTanque());

			System.out.println("------------------------------------------\n");			
		}
		
		
	}
}