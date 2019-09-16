package ifrs.com.br.view.conta;

import javax.swing.JOptionPane;

import ifrs.com.br.model.conta.AccountType;
import ifrs.com.br.model.conta.Conta;
import ifrs.com.br.model.contaCorrente.ContaCorrente;
import ifrs.com.br.model.contaEspecial.ContaEspecial;

public class ContaView {
	public static Conta getConta() throws IllegalArgumentException {
		Conta conta;
		String accountBalanceInput = JOptionPane.showInputDialog("Adicione o saldo inicial");
		if (accountBalanceInput.isEmpty() || accountBalanceInput == null) {
			throw new IllegalArgumentException("Saldo não pode ser nulo");
		}
		double accountBalance = Double.parseDouble(accountBalanceInput);

		String accountNumberInput = JOptionPane.showInputDialog("Adicione o saldo inicial");
		if (accountNumberInput.isEmpty() || accountNumberInput == null) {
			throw new IllegalArgumentException("Saldo não pode ser nulo");
		}
		int accountNumber = Integer.parseInt(accountBalanceInput);

		String accountAgency = JOptionPane.showInputDialog("Adicione o saldo inicial");
		if (accountAgency.isEmpty() || accountAgency == null) {
			throw new IllegalArgumentException("Saldo não pode ser nulo");
		}

		String accountTypeInput = JOptionPane
				.showInputDialog("Tipo de conta \n 1 - conta  corrente \n 2 - conta especial");
		if (accountTypeInput.isEmpty() || accountTypeInput == null) {
			throw new IllegalArgumentException("Cliente precisa ter um tipo de conta");
		}
		AccountType accountType = AccountType.valueOf(Integer.parseInt(accountTypeInput));

		if (accountType == AccountType.CONTA_ESPECIAL) {
			String specialAccountLimitInput = JOptionPane.showInputDialog("Qual é o valor do limite de crédito?");
			if (specialAccountLimitInput.isEmpty() || specialAccountLimitInput == null) {
				throw new IllegalArgumentException("Contas especiais precisam ter algum limite");
			}

			double specialAccountLimit = Double.parseDouble(specialAccountLimitInput);
			conta = new ContaEspecial(accountBalance, accountNumber, accountAgency, specialAccountLimit);

		} else if (accountType == AccountType.CONTA_CORRENTE) {
			conta = new ContaCorrente(accountBalance, accountNumber, accountAgency);
		} else {
			throw new IllegalArgumentException("Você informou um tipo de conta inválido!");
		}

		return conta;
	}
}
