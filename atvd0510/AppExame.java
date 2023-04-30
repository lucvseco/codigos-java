package atvd0510;

import java.util.Scanner;

public class AppExame {

	public static void main(String[] args) {
		Scanner lerTeclado = new Scanner(System.in);
		
		

		System.out.print("Identificador: ");
		int id = lerTeclado.nextInt();
		System.out.print("Tipo do exame: ");
		String tipoExame = lerTeclado.next();
		
		Exame exame = new Exame(id, tipoExame, id);
		
		System.out.println("\nIdentificador: " + exame.getIdExame());
		System.out.println("Tipo do exame: " + exame.getTipoExame());

		
		System.out.printf("\nNível de glicose:  ");
		int nivelGlicose = lerTeclado.nextInt();
		exame.obterDiagnostico();
		if(nivelGlicose <= 99) {  
			System.out.println("normal");
		} else if(nivelGlicose  >= 100) {  
			System.out.println("Pré-diabetes");	
	    } else if(nivelGlicose <= 125) {  
				System.out.println("Pré-diabetes");
		} else if(nivelGlicose > 125) {  
			System.out.println("Diabetes");
		} 
		
		System.out.println("Identificador      :" + exame.getIdExame());
		System.out.println("Tipo do exame      :" + exame.getTipoExame());
		
	}

}
