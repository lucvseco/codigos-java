package codigosAldoPessoa;

import java.util.ArrayList;
import java.util.List;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class AppPessoa {
    static SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        
	public static void main(String[] args) throws ParseException{

		List<String> telefones = new ArrayList<String>();
		telefones.add("81-3878.5155");
		telefones.add("81-3333.4444");
		telefones.add("81-3333.4040");

		List<Pessoa> pessoas = new ArrayList<Pessoa>();   

		PessoaFisica pf = new PessoaFisica("001.222.003-44", "Ivson Aires", formato.parse("15/08/2020"), 'M', true, 
				                            2, "50865-030", "Av. Recife, 300", telefones, "ivson.aires@gmail.com");
		pessoas.add(pf);
		
		
		System.out.println(pf.toString());
		
		PessoaJuridica pj = new PessoaJuridica("85.101.202/0001-88" , "Centro Educacional Brasil", "Brasil Cursos", 
				                                3, "52150-321", "Rua Espetáculo, 85", telefones, "contato@gmail.com");
		pessoas.add(pj);

		System.out.println(pj.toString());
		
	}
}