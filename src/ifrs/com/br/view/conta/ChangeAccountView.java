package ifrs.com.br.view.conta;

import javax.swing.JOptionPane;

import ifrs.com.br.model.client.Cliente;
import ifrs.com.br.model.conta.Conta;
import ifrs.com.br.model.conta.SituacaoConta;
import ifrs.com.br.util.exception.TestEmptyInput;

public class ChangeAccountView {
	private Cliente client;
	private String contaInput;

	public ChangeAccountView(Cliente cliente) {
		this.client = cliente;
		contaInput = JOptionPane.showInputDialog("Informe o número da conta que deseja mudar");
		TestEmptyInput.testInput(contaInput, "Informe o número da conta");
	}

	public void activateAccount() {
		Conta conta = null;

		for (Conta contaToIterate : client.getContas()) {
			if (contaToIterate.getNumero() == Integer.parseInt(contaInput)) {
				conta = contaToIterate;
			}
		}

		if (conta != null) {
			if (conta.getSituacaoConta() != SituacaoConta.ABERTA) {
				int confirm = JOptionPane.showConfirmDialog(null, "Deseja abrir esta conta?");
				System.out.println(confirm);
			} else {
				JOptionPane.showMessageDialog(null, "Conta já se encontra aberta!");
			}
		} else {
			JOptionPane.showMessageDialog(null, "Conta não encontrada");
		}

	}

	public void deactivateAccount() {
		Conta conta = null;

		for (Conta contaToIterate : client.getContas()) {
			if (contaToIterate.getNumero() == Integer.parseInt(contaInput)) {
				conta = contaToIterate;
			}
		}

		if (conta != null) {
			if (conta.getSituacaoConta() != SituacaoConta.FECHADA) {
				int confirm = JOptionPane.showConfirmDialog(null, "Deseja encerrar esta conta?");
				System.out.println(confirm);
			} else {
				JOptionPane.showMessageDialog(null, "Conta já se encontra encerrada!");
			}
		} else {
			JOptionPane.showMessageDialog(null, "Conta não encontrada");
		}
	}

	public void setNotUsedAccount() {
		Conta conta = null;

		for (Conta contaToIterate : client.getContas()) {
			if (contaToIterate.getNumero() == Integer.parseInt(contaInput)) {
				conta = contaToIterate;
			}
		}

		if (conta != null) {
			if (conta.getSituacaoConta() != SituacaoConta.FECHADA) {
				int confirm = JOptionPane.showConfirmDialog(null, "Deseja abrir esta conta?");
				System.out.println(confirm);
			} else {
				JOptionPane.showMessageDialog(null, "Conta já se encontra aberta!");
			}
		} else {
			JOptionPane.showMessageDialog(null, "Conta não encontrada");

		}
	}
}
