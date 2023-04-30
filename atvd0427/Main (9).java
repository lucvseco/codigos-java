/* Os ingressos para um evento foram classificados em 3 grupos:
   Normal R$ 100,00, estudante R$ 50,00 e acessível R$ 30,00).

   Elabore um programa para ler a quantidade de ingressos vendidos para cada
   um dos grupos. Mostre:
   - O público total
   - O valor apurado por cada grupo de ingressos
   - O apurado total
*/

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner lerTeclado = new Scanner(System.in);
	    
	    // Declaração de constantes
	    final double VL_NORMAL = 100.00;
	    final double VL_ESTUDANTE = 50.00;
	    final double VL_ACESSIVEL = 30.00;

        // Entrada
        /*ler quant. de ingressos normais        50
          ler quant. de ingressos estudante      20
          ler quant. de ingressos acessivel      10 */
        
        System.out.print("Quant. de ingresso - normais..: ");
        int qtdeNormais = lerTeclado.nextInt();
        System.out.print("Quant. de ingresso - estudante: ");
        int qtdeEstudante = lerTeclado.nextInt();
        System.out.print("Quant. de ingresso - acessível: ");
        int qtdeAcessivel = lerTeclado.nextInt();
        
        // Processamento
        /* calcular o publico total = quant. ingr. normais + quant. ingr. estud. + quant. ingr. aces.   80
           calcular o valor apurado normais = quant. de ingressos normais * 100;                      5000
           calcular o valor apurado estudante = quant. de ingressos estudante * 50;                   1000
           calcular o valor apurado acessivel = quant. de ingressos acessivel * 30;                    300
           calcular o apurado total = valor apurado normais + valor apurado estudante + valor apurado acessivel  6300 */

        int publicoTotal = qtdeNormais + qtdeEstudante + qtdeAcessivel;
        double apuradoNormais = qtdeNormais * VL_NORMAL;
        double apuradoEstudante = qtdeEstudante * VL_ESTUDANTE;
        double apuradoAcessivel = qtdeAcessivel * VL_ACESSIVEL;
        double apuradoTotal = apuradoNormais + apuradoAcessivel + apuradoEstudante;
        
        // Saída
        /* Mostre publico total            80
           Mostre valor apurado normais     5000
           Mostre valor apurado estudante   1000
           Mostre valor apurado acessivel    300
           Mostre apurado total             6300 */
        
        System.out.printf("\nPúblico total..................: %d", publicoTotal);
        System.out.printf("\nApurado com ingresso normais   : R$ %.2f", apuradoNormais);
        System.out.printf("\nApurado com ingresso estudante : R$ %.2f", apuradoEstudante);
        System.out.printf("\nApurado com ingresso acessíveis: R$ %.2f", apuradoAcessivel);
        System.out.printf("\nApurado total..................: R$ %.2f", apuradoTotal);
        

	}
}
