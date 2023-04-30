package atvd0601;

import java.util.Scanner;

public class AppDF {

	    public static void main(String[] args) {
		Scanner lerTeclado = new Scanner(System.in);
		
		
		Desenvolvedor[] desenvolvedores = new Desenvolvedor [3];
		for (int i=0; i<desenvolvedores.length; i++) {
		
			System.out.printf("Identificador do %dºdesenvolvedor: ", (i+1));
			int idDesenvolvedor = lerTeclado.nextInt();
			System.out.printf("Nome do %dºdesenvolvedor: ", (i+1));
			String nome = lerTeclado.next();
			System.out.printf("Valor da hora do %dºdesenvolvedor: ",(i+1));
			double valorHora = lerTeclado.nextDouble();
			System.out.printf("Receita em aberto do %dºdesenvolvedor: ", (i+1));
			double receitaEmAberto = lerTeclado.nextDouble();
			Desenvolvedor desenvolvedor = new Desenvolvedor (idDesenvolvedor, nome, receitaEmAberto, receitaEmAberto, null);
			desenvolvedor.setIdDesenvolvedor(idDesenvolvedor);
			desenvolvedores[i]=desenvolvedor;
		}

		
				
		Funcionalidade[] funcionalidades = new Funcionalidade [10];
		for (int i=0; i<funcionalidades.length; i++) {
		
			System.out.printf("Identificador da %dªfuncionalidade:", (i+1));
			int idFuncionalidade = lerTeclado.nextInt();
			System.out.printf("Descrição da %dªfuncionalidade    :", (i+1));
			String descricao = lerTeclado.next();
			System.out.print("Minutos para implementar       :");
			String minutosParaImplementar = lerTeclado.next();
			System.out.print("Tipo da funcionalidade (D - Desenvolvimento; C - Correção ou A – Atualização):");
			char tipo = lerTeclado.next().charAt(0);
			double valor = 0;
			Funcionalidade funcionalidade = new Funcionalidade (idFuncionalidade, minutosParaImplementar, 
					idFuncionalidade, valor, null, tipo, null);
			funcionalidade.setIdFuncionalidade(idFuncionalidade);
			funcionalidades[i]=funcionalidade;
		}

		System.out.println("Digite o identificador do desenvolvedor  :");
		int idDesenvolvedor = lerTeclado.nextInt();
		System.out.println("Digite o identificador da funcionalidade :");
		int idFuncionalidade = lerTeclado.nextInt();
	//	Desenvolvedor.setIdDesenvolvedor(idDesenvolvedor);
	//	Funcionalidade.setIdFuncionalidade(idFuncionalidade);
	//	Funcionalidade.atribuirFuncionalidade();
		
		
		System.out.println("Digite o identificador da funcionalidade :");
	//	int idFuncionalidade = lerTeclado.nextInt();
	//	Funcionalidade.registrarConclusao();
		
		System.out.print("Valor da implementação         :");
		double valor = lerTeclado.nextDouble();
	//	Desenvolvedor.debitarPagamento();
		
		System.out.println("Digite o identificador da funcionalidade :");
	//	int idFuncionalidade = lerTeclado.nextInt();
		
	//	System.out.println(Funcionalidade.atribuirFuncionalidade());
		
		
		
	    }
}
	