package codigosAldoPessoa;

import java.util.List;

public class PessoaJuridica extends Pessoa {
	private String cnpj;
	private String razaoSocial;
	private String nomeFantasia;
	
	public PessoaJuridica(String cnpj, String razaoSocial, String nomeFantasia,
			int id, String cep, String endereco, List<String> telefones, String email) {
		
		super(id, cep, endereco, telefones, email);
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
		this.nomeFantasia = nomeFantasia;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	
	//@Override
	public String toString() {
		String fones = "";
		for (String tel: this.getTelefones()) {
			fones = fones + " / " + tel;
		}
		fones = fones.substring(3); 
		return "\nPessoa jurídica:" + this.getId() + 
	           "\nNome fantasia  : " + this.nomeFantasia +
	           "\nRazão Social   : " + this.razaoSocial +
			   "\nCNPJ           : " + this.cnpj +
			   "\nEndereço       : " + this.getEndereco() +
			   "\nCep            : " + this.getCep() +
			   "\ne-Mail         : " + this.getEmail() +
			   "\nTelefones      : " + fones;
	}

}