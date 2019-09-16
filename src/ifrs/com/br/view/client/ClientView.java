package ifrs.com.br.view.client;

import javax.swing.JOptionPane;

import ifrs.com.br.model.client.*;
import ifrs.com.br.model.conta.*;
import ifrs.com.br.view.conta.ContaView;

public class ClientView {
	public static Cliente getClient() throws IllegalArgumentException {
		String nome = JOptionPane.showInputDialog("Nome do cliente");
		if (nome.isEmpty() || nome == null) {
			throw new IllegalArgumentException("Nome precisa ser digitado");
		}

		String cpf = JOptionPane.showInputDialog("cpf do cliente");
		if (cpf.isEmpty() || cpf == null) {
			throw new IllegalArgumentException("cpf não pode ser nulo");
		}
		
		JOptionPane.showMessageDialog(null, "Agora adicionaremos uma conta");
		
		Conta conta = ContaView.getConta();

		return new Cliente(nome, cpf, conta);
	}
}
