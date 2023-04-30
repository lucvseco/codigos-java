package codigosAldoPagto;

import java.util.Scanner;
import java.text.SimpleDateFormat; 

public class AppPagto {
	static Scanner ler = new Scanner(System.in);
    static SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");

	public static void main(String[] args) {
		int opcao = 0;
		do {
			System.out.println("\n\n\n*** Opções de Pagamento ***\n");
			System.out.println("1 - Espécie");
			System.out.println("2 - Crédito");
			System.out.println("3 - Débito");
			System.out.println("0 - Finalizar");
			
     		System.out.print("\nOpção: ");
			opcao = ler.nextInt();

			switch (opcao) {
			case 1:
				pagamentoEspecie();
				break;
			case 2:
				pagamentoCredito();
				break;
			case 3:
				pagamentoDebito();
				break;
			case 0:
				break;
			default:
				System.out.printf("\nOpção incorreta!!!\n");
			}
			if (opcao == 0) {
				System.out.println("\n--- PROGRAMA FINALIZADO  ---");
				break;
			}				
		} while (true);        
	}
	
	private static void pagamentoEspecie() {
		Pagamento pagto = new Pagamento(1203.00f);
		
		System.out.println("\nPagamento em espécie efetuado");
		System.out.printf("\nNr. registro: %d", pagto.getId());
		System.out.printf("\nValor.....R$: %.2f", pagto.getValor());
		System.out.printf("\nData........: %s", formatoData.format(pagto.getData()));
	}

	private static void pagamentoCredito() {
		PagamentoCredito pagtoCred = new PagamentoCredito("Visa", "4040.1010.2020.3030", 2, 2500.0f);
		
		System.out.println("\n\nPagamento com cartão de credito efetuado");
		System.out.printf("\nNúmero registro..: %d", pagtoCred.getId());
		System.out.printf("\nValor..........R$: %.2f", pagtoCred.getValor());
		System.out.printf("\nData.............: %s", formatoData.format(pagtoCred.getData()));
		System.out.printf("\nBandeira.........: %s", pagtoCred.getBandeira());
		System.out.printf("\nCartão...........: %s", pagtoCred.getNumero());
		System.out.printf("\nQuant. parcelas..: %d", pagtoCred.getQtdeParcelas());
		float valorParcela = pagtoCred.getValor() / pagtoCred.getQtdeParcelas();
		System.out.printf("\nValor parcela..R$: %.2f", valorParcela);
	}
	
	private static void pagamentoDebito() {
		PagamentoDebito pagtoDeb = new PagamentoDebito(237, 1518, 3215, 2352.50f);
		
		System.out.println("\n\nPagamento com cartão de débito efetuado");
		System.out.printf("\nNúmero registro: %d", pagtoDeb.getId());
		System.out.printf("\nValor........R$: %.2f", pagtoDeb.getValor());
		System.out.printf("\nData...........: %s", formatoData.format(pagtoDeb.getData()));
		System.out.printf("\nBanco..........: %d", pagtoDeb.getBanco());
		System.out.printf("\nAgência........: %d", pagtoDeb.getAgencia());
		System.out.printf("\nConta..........: %d", pagtoDeb.getConta());			
	}
}