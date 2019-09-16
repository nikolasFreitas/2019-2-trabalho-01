package ifrs.com.br.view.client;

import javax.swing.JOptionPane;

import ifrs.com.br.model.client.*;
import ifrs.com.br.model.conta.*;
import ifrs.com.br.util.exception.TestEmptyInput;
import ifrs.com.br.view.conta.AddContaView;

public class ClientView {
	public static Cliente getClient() throws IllegalArgumentException {
		String nome = JOptionPane.showInputDialog("Nome do cliente");
		TestEmptyInput.testInput(nome, "Nome precisa ser digitado");

		String cpf = JOptionPane.showInputDialog("cpf do cliente");
		TestEmptyInput.testInput(cpf, "cpf não pode ser nulo");

		JOptionPane.showMessageDialog(null, "Agora adicionaremos uma conta");

		Conta conta = AddContaView.getConta();

		return new Cliente(nome, cpf, conta);
	}
}
