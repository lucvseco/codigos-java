package codigosAldoEstacionamento;

import java.util.Scanner;

public class AppEstacionamento {

	static Scanner lerTeclado = new Scanner(System.in);
	
	static Estacionamento[] estacionamento = new Estacionamento[3];
	static int numEstac = 0;
	
	public static void main(String[] args) {
		
		int opcao = 0;
		do {
			System.out.println("\n*** Estacionamento ***");
			System.out.println();
			System.out.println("1 - Cadastrar");
			System.out.println("2 - Consultar");
			System.out.println("3 - Ativar");
			System.out.println("4 - Desativar");
			System.out.println("0 - Finalizar");

			try {
				System.out.print("\nOpção: ");
				opcao = lerTeclado.nextInt();				
			}
			catch (Exception erro) {
				System.out.println("A opção deve ser numérica");
				lerTeclado.nextLine();
				continue;					
			}



    		switch (opcao) {
    		case 1:
    			cadastrarEstacionamento();
    			break;
    		case 2:
    			consultarEstacionamento();
    			break;
    		case 3:
    			ativarEstacionamento();
    			break;
    		case 4:
    			desativarEstacionamento();
    			break;
    		case 0:
				System.out.println("\n--- PROGRAMA FINALIZADO  ---");
				return;
    		default:
				System.out.println("\n--- Opção incorreta  ---");
				break;
    		}
		} while (true);		
		
	}
	
	public static void cadastrarEstacionamento() {
		System.out.println("\n*** CADASTRO ***");
		
		if (numEstac == 3) {
			System.out.println("Vetor Cheio");
			return;
		}
		
		System.out.print("Código            : ");
		int codigo = lerTeclado.nextInt();
		System.out.print("Nome              : ");
		lerTeclado.nextLine();
		String nome = lerTeclado.nextLine();
		System.out.print("Cidade            : ");
		String cidade = lerTeclado.nextLine();
		System.out.print("Vagas             : ");
		int vagas = lerTeclado.nextInt();
		System.out.print("Valor inicial  R$ : ");
		double valorInicial = lerTeclado.nextInt();
		System.out.print("Valor adcional R$ : ");
		double valorAdicional = lerTeclado.nextInt();
		System.out.print("Horas franqueadas : ");
		int horas = lerTeclado.nextInt();
		
		estacionamento[numEstac] = new Estacionamento(codigo, nome, cidade,
				                            vagas, valorInicial, valorAdicional, horas);	
		numEstac++;
		System.out.println("----- Estacionamento Cadastrado ------");
	}

	public static void consultarEstacionamento() {
		System.out.println("\n*** CONSULTAR ***");

		if (numEstac ==0) {
			System.out.println("Vetor Vazio");
			return;			
		}
		
		
		System.out.print("Código para consultar: ");
		int consultar = lerTeclado.nextInt();
		
		for (int i = 0; i < estacionamento.length; i++) {
			
			if (estacionamento[i] != null && consultar == estacionamento[i].getCodigo()) {
				System.out.println("Código            :" + estacionamento[i].getCodigo());
				System.out.println("Nome              :" + estacionamento[i].getNome());
				System.out.println("Cidade            :" + estacionamento[i].getCidade());
				System.out.println("Vagas             :" + estacionamento[i].getVagas());
				System.out.println("Valor Inicial     : R$" + estacionamento[i].getValorInicial());
				System.out.println("Valor Adicional    : R$" + estacionamento[i].getValorAdicional());
				System.out.println("Horas franqueadas :" + estacionamento[i].getHoraFranquiaInicial());
				System.out.println("Situação          :" + estacionamento[i].isSituacao());				
				System.out.println("----- Consulta realizada ------");
				return;
			}
			
		}
		System.out.println("----- Estacionamento não encontrado ------");	
	}

	public static void ativarEstacionamento() {
		System.out.println("\n*** ATIVAR ***");
		if (numEstac ==0) {
			System.out.println("Vetor Vazio");
			return;			
		}
		
		System.out.print("Código para ativar: ");
		int consultar = lerTeclado.nextInt();
		
		for (int i = 0; i < estacionamento.length; i++) {
			
			if (estacionamento[i] != null && consultar == estacionamento[i].getCodigo()) {
				estacionamento[i].ativar();
				System.out.println("----- Estacionamento Ativado ------");
				return;
			}
			
		}
		System.out.println("----- Estacionamento não encontrado ------");	
		
	}

	public static void desativarEstacionamento() {
		System.out.println("\n*** DESATIVAR ***");		
		if (numEstac ==0) {
			System.out.println("Vetor Vazio");
			return;			
		}
		System.out.print("Código para desativar: ");
		int consultar = lerTeclado.nextInt();
		
		for (int i = 0; i < estacionamento.length; i++) {
			
			if (estacionamento[i] != null && consultar == estacionamento[i].getCodigo()) {
				estacionamento[i].desativar();
				System.out.println("----- Estacionamento Desativado ------");
				return;
			}
			
		}
		System.out.println("----- Estacionamento não encontrado ------");	
	}

	
}