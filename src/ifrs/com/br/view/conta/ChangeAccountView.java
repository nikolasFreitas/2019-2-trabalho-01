package ifrs.com.br.view.conta;

import javax.swing.JOptionPane;

import ifrs.com.br.model.cliente.Cliente;
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
				if (confirm == JOptionPane.YES_OPTION) {
					conta.setSituacaoConta(SituacaoConta.ABERTA);
					JOptionPane.showMessageDialog(null, "Conta alterada com sucesso");
				}
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
				if (confirm == JOptionPane.YES_OPTION) {
					conta.setSituacaoConta(SituacaoConta.FECHADA);
					JOptionPane.showMessageDialog(null, "Conta alterada com sucesso");
				}

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
			if (conta.getSituacaoConta() != SituacaoConta.SEM_MOVIMENTACAO) {
				int confirm = JOptionPane.showConfirmDialog(null, "Deseja abrir esta conta?");
				if (confirm == JOptionPane.YES_OPTION) {
					conta.setSituacaoConta(SituacaoConta.SEM_MOVIMENTACAO);
					JOptionPane.showMessageDialog(null, "Conta alterada com sucesso");
				}
			} else {
				JOptionPane.showMessageDialog(null, "Conta não está ativa!");
			}
		} else {
			JOptionPane.showMessageDialog(null, "Conta não encontrada");
		}
	}

	public void creditOption() {
		Conta conta = null;

		for (Conta contaToIterate : client.getContas()) {
			if (contaToIterate.getNumero() == Integer.parseInt(contaInput)) {
				conta = contaToIterate;
			}
		}

		if (conta != null) {
			String totalCredit = JOptionPane.showInputDialog("Digite a quantidade de crédito");
			TestEmptyInput.testInput(totalCredit, "Quantidade precisa ser expecificada");

			double credit = Double.parseDouble(totalCredit);
			conta.credita(credit);
		} else {
			JOptionPane.showMessageDialog(null, "Conta não encontrada");
		}
	}

	public void debitOption() {
		Conta conta = null;

		for (Conta contaToIterate : client.getContas()) {
			if (contaToIterate.getNumero() == Integer.parseInt(contaInput)) {
				conta = contaToIterate;
			}
		}

		if (conta != null) {
			String totalDebit = JOptionPane.showInputDialog("Digite a quantidade para pagamento");
			TestEmptyInput.testInput(totalDebit, "Quantidade precisa ser expecificada");

			double debit = Double.parseDouble(totalDebit);
			conta.debita(debit);
		} else {
			JOptionPane.showMessageDialog(null, "Conta não encontrada");
		}
	}
}
