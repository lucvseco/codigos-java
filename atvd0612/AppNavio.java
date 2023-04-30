package atvd0612;



public class AppNavio {

	

	public static void main(String[] args) {
	
		NavioGraneleiro[] navioGraneleiro = new NavioGraneleiro[2];
		
		
		navioGraneleiro[0] = new NavioGraneleiro (10, "Estrela do Mar", 4, 50000, null, 4);
		navioGraneleiro[1] = new NavioGraneleiro (25, "Cruzeiro do Sul", 3, 80000, null, 6);
			
		System.out.println("Id navio graneleiro 1: "+ navioGraneleiro[0].getId());
		System.out.println("Nome navio graneleiro 1: "+ navioGraneleiro[0].getNome());
		System.out.println("Quantidade de porões navio graneleiro 1: "+ navioGraneleiro[0].getQuantidadePoroes());
		System.out.println("Capacidade de carga (toneladas) navio graneleiro 1: " + navioGraneleiro[0].getCapacidadeCarga());
		System.out.println("Quantidade de escotilhas navio graneleiro 1: " + navioGraneleiro[0].getQuantidadeEscotilhas());
		System.out.println();
		System.out.println("Id navio graneleiro 2: "+ navioGraneleiro[1].getId());
		System.out.println("Nome navio graneleiro 2: "+ navioGraneleiro[1].getNome());
		System.out.println("Quantidade de porões navio graneleiro 2: "+ navioGraneleiro[1].getQuantidadePoroes());
		System.out.println("Capacidade de carga (toneladas) navio graneleiro 2: " + navioGraneleiro[1].getCapacidadeCarga());
		System.out.println("Quantidade de escotilhas navio graneleiro 2: " + navioGraneleiro[1].getQuantidadeEscotilhas());
		System.out.println("-----------------------//--------------------------");
		
		NavioContainer[] navioContainer = new NavioContainer[3];
		
		navioContainer[0] = new NavioContainer (33, "Bela Fera", 2, 100000, null, 2, 30);
		navioContainer[1] = new NavioContainer (48, "Arrecifes", 2, 120000, null, 2, 30);
		navioContainer[2] = new NavioContainer (52, "Águas Belas", 1, 90000, null, 0, 25);
		
		
		System.out.println("Id navio container 1: "+ navioContainer[0].getId());
		System.out.println("Nome navio container 1: " + navioContainer[0].getNome());
		System.out.println("Quantidade de porões navio container 1: " + navioContainer[0].getQuantidadePoroes());
		System.out.println("Capacidade de carga (toneladas) navio container 1: " + navioContainer[0].getCapacidadeCarga());
		System.out.println("Quantidade de escotilhas navio container 1: "+ navioContainer[0].getQuantidadeGuindastes());
		System.out.println("Quantidade de câmaras navio container 1: " + navioContainer[0].getQuantidadeCamaras());
		System.out.println();
		System.out.println("Id navio container 2: "+ navioContainer[1].getId());
		System.out.println("Nome navio container 2: " + navioContainer[1].getNome());
		System.out.println("Quantidade de porões navio container 2: " + navioContainer[1].getQuantidadePoroes());
		System.out.println("Capacidade de carga (toneladas) navio container 2: " + navioContainer[1].getCapacidadeCarga());
		System.out.println("Quantidade de escotilhas navio container 2: "+ navioContainer[1].getQuantidadeGuindastes());
		System.out.println("Quantidade de câmaras navio container 2: " + navioContainer[1].getQuantidadeCamaras());
		System.out.println();
		System.out.println("Id navio container 3: "+ navioContainer[2].getId());
		System.out.println("Nome navio container 3: " + navioContainer[2].getNome());
		System.out.println("Quantidade de porões navio container 3: " + navioContainer[2].getQuantidadePoroes());
		System.out.println("Capacidade de carga (toneladas) navio container 3: " + navioContainer[2].getCapacidadeCarga());
		System.out.println("Quantidade de escotilhas navio container 3: "+ navioContainer[2].getQuantidadeGuindastes());
		System.out.println("Quantidade de câmaras navio container 3: " + navioContainer[2].getQuantidadeCamaras());
		System.out.println();
	}
}

