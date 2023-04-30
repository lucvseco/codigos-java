package codigosAldoPessoa;

import java.util.Date;
import java.util.List;
import java.text.SimpleDateFormat;

public class PessoaFisica extends Pessoa{
    static SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");

    private String cpf;
	private String nome;
	private Date dataNascimento;
	private char sexo;
	private boolean situacao;
	
	public PessoaFisica(String cpf, String nome, Date dataNascimento, char sexo, boolean situacao,
			int id, String cep, String endereco, List<String> telefones, String email) {

		super(id, cep, endereco, telefones, email);
		this.cpf = cpf;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.situacao = situacao;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Date getDataNascimento() {
		return dataNascimento;
	}
	
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public char getSexo() {
		return sexo;
	}
	
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	public boolean isSituacao() {
		return situacao;
	}
	
	public void setSituacao(boolean situacao) {
		this.situacao = situacao;
	}
	
	//@Override
	public String toString() {
		String fones = "";
		for (String tel: this.getTelefones()) {
			fones = fones + " / " + tel;
		}
		fones = fones.substring(3); 
		return "\nPessoa física:" + this.getId() + 
	           "\nNome         : " + this.nome +
			   "\nCPF          : " + this.cpf +
			   "\nNascimento   : " + formatoData.format(dataNascimento) +
			   "\nSexo         : " + this.sexo +
			   "\nSituação     : " +  (situacao ? "Ativo" : "Inativo") +
			   "\nEndereço     : " + this.getEndereco() +
			   "\nCep          : " + this.getCep() +
			   "\ne-Mail       : " + this.getEmail() +
			   "\nTelefones    : " + fones;
	}
}