import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    final int QTDE_PESSOAS = 4;
	    int contAprovados = 0; 
	    int contReprovados = 0;
	    double media = 0;
	    double acumMedias = 0;

        for (int contPessoas = 1; contPessoas<=QTDE_PESSOAS ; contPessoas++ ) { 
            
            do { // Crítica de cada média recebida
                System.out.printf("Média da %dª pessoa: ", contPessoas);
                media =  input.nextDouble();
                if (media < 0 || media > 10 ) {
                    System.out.println("Média incorreta. Informe de 0 - 10");
                    continue;
                }
                break;
            } while ( true );
            acumMedias = acumMedias + media;

            if (media >= 6) {
                 //contAprovados = contAprovados + 1;
                 contAprovados++;
            }
            else {
                //contReprovados = contReprovados + 1;
                contReprovados++;
            }
        } 
        double mediaTurma = acumMedias / QTDE_PESSOAS;
        
        System.out.println("Quantidade de aprovados : " + contAprovados);
        System.out.println("Quantidade de reprovados: " + contReprovados);
        System.out.printf("Média da turma: %.1f", mediaTurma);
	}
}
