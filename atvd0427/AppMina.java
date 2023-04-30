package atvd0427;

import java.util.Scanner;

public class AppMina {

	public static void main(String[] args) {
		Scanner lerTeclado = new Scanner(System.in);
		
		

		System.out.print("Identificador: ");
		int id = lerTeclado.nextInt();
		System.out.print("Minério      : ");
		String minerio = lerTeclado.next();
		
		Mina mina = new Mina(id, minerio);
		
		System.out.println("\nIdentificador: " + mina.getIdMina());
		System.out.println("Minério      : " + mina.getMinerio());
		System.out.println("Estoque      : " + mina.getEstoque());

		int quantidade=0;
		for (int i=0; i<3; i++) {
			System.out.printf("\nQuantidade produzida no %dº dia: ", (i+1) );
			quantidade = lerTeclado.nextInt();
			mina.registrarProducao(quantidade);
		}
		
		System.out.printf("\nQuantidade escoada: ");
		quantidade = lerTeclado.nextInt();
		mina.registrarEscoamento(quantidade);
		
		System.out.println("Minério      :" + mina.getMinerio());
		System.out.println("Estoque      :" + mina.getEstoque());
		
		
	}

}