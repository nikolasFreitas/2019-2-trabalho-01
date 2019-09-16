package ifrs.com.br.model.client;

import java.util.*;

import ifrs.com.br.model.conta.Conta;

public class Cliente {
	private String nome;
	private String cpf;
	private static Integer contador = 0;
	private List<Conta> contas = new ArrayList<Conta>();

	public Cliente() {
		super();
	}

	public Cliente(String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		contador++;
	}

	public Cliente(String nome, String cpf, Conta conta) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		contas.add(conta);
		contador++;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "Client nome=" + nome + ", cpf=" + cpf;
	}

}
