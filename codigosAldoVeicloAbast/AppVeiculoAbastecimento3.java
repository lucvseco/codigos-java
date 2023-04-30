package codigosAldoVeicloAbast;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppVeiculoAbastecimento3 {

	public static void main(String[] args) {
		Scanner lerTeclado = new Scanner(System.in);
		int contaVeiculos = 1;
		
		List<VeiculoAbastecimento> listaVeiculos = new ArrayList<VeiculoAbastecimento>();
		
		do {
			
			System.out.printf("\nIdentificador veículo %d ou 0 para finalizar: ", (contaVeiculos));
			contaVeiculos++;
			int id = lerTeclado.nextInt();
			if (id == 0) {
				System.out.println("**** PROGRAMA FINALIZADO ***");
				break;
			}
			// Cadastra o veículo
			System.out.print("Capacidade do tanque");
			double capacidade = lerTeclado.nextDouble();
			System.out.print("Km/Litro - Gasolina: ");
			double kmLitroGasolina = lerTeclado.nextDouble();
			System.out.print("Km/Litro - Etanol: ");
			double kmLitroEtanol = lerTeclado.nextDouble();
			VeiculoAbastecimento veiculo = new VeiculoAbastecimento(id, capacidade, kmLitroGasolina, kmLitroEtanol);

			// Fornece os valores dos combustíveis que pode abastecer o veículo
			System.out.print("Valor Gasolina R$: ");
			double valorGasolina = lerTeclado.nextDouble();
			System.out.print("Valor Etanol R$: ");
			double valorEtanol = lerTeclado.nextDouble();
			
			// Calcula os demais atributos
			veiculo.setValorGasolina(valorGasolina);
			veiculo.setValorEtanol(valorEtanol);			
			veiculo.obterCombustivelMaisEconomico();
			veiculo.calcularAbastecimento();
			veiculo.calcularAutonomiaTanque();				
			
			// Armazena um objeto da classe VeiculoAbastecimento na lista
			listaVeiculos.add(veiculo);
			
			// mostra a lista
			
			System.out.println("------------------------------------------");
			System.out.println("Id  Relação  Comb  Vl.Abastic.  Autonomia");
			System.out.println("------------------------------------------");
			for (VeiculoAbastecimento veic : listaVeiculos ) {
				System.out.printf("%d  ", veic.getIdVeiculo());
				/*
				System.out.println("Capacid. Tanque    : " + veic.getCapacidadeTanque());
				System.out.println("Km/Litro - Gasolina: " + veic.getKmLitroGasolina());
				System.out.println("Km/Litro - Etanol  : " + veic.getKmLitroEtanol());
				System.out.println("Valor Gasolina     : R$ " + veic.getValorGasolina());
				System.out.println("Valor Etanol       : R$ " + veic.getValorEtanol());	
				*/
				System.out.printf("%.3f    ", veic.getRelacao());
				System.out.print(" "+ veic.getCombMaisEconomico());

				System.out.printf("   %10.2f", veic.getValorAbastecimento());
				System.out.printf("  %10.2f\n", veic.getAutonomiaTanque());
			}
		
		} while (true);
		
	}

}