package ifrs.com.br.client.view;

import javax.swing.JOptionPane;

import ifrs.com.br.client.model.*;
//	String nome;
//	String cpf;
//	Integer contador;

public class ClientView {
	public static Client getClient() throws IllegalArgumentException {
		String nome = JOptionPane.showInputDialog("Nome do cliente");
		if (nome.isEmpty() || nome == null) {
			throw new IllegalArgumentException("Nome precisa ser digitado");
		}

		String cpf = JOptionPane.showInputDialog("cpf do cliente");
		if (cpf.isEmpty() || cpf == null) {
			throw new IllegalArgumentException("cpf não pode ser nulo");
		}

		return new Client(nome, cpf);
	}
}
