package codigosAldoPessoa;

import java.util.ArrayList;
import java.util.List;

public abstract class Pessoa {
	private int id;
	private String cep;
	private String endereco;
	private List<String> telefones = new ArrayList<String>();
	private String email;
	
	public Pessoa() {
		
	}
	
	public Pessoa(int id, String cep, String endereco, List<String> telefones, String email) {
		this.id = id;
		this.cep = cep;
		this.endereco = endereco;
		this.telefones = telefones;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public List<String> getTelefones() {
		return telefones;
	}
	public void setTelefone(List<String> telefones) {
		this.telefones = telefones;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
