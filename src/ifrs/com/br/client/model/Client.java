package ifrs.com.br.client.model;

public class Client {
	String nome;
	String cpf;
	static Integer contador = 0;

	public Client() {
		super();
	}

	public Client(String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
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
