package ifrs.com.br.view.conta;

import javax.swing.JOptionPane;

import ifrs.com.br.model.conta.AccountType;
import ifrs.com.br.model.conta.Conta;
import ifrs.com.br.model.contaCorrente.ContaCorrente;
import ifrs.com.br.model.contaEspecial.ContaEspecial;
import ifrs.com.br.util.exception.TestEmptyInput;

public class AddContaView {
	public static Conta getConta() throws IllegalArgumentException {
		Conta conta;

		String accountNumberInput = JOptionPane.showInputDialog("Número da conta inicial");
		TestEmptyInput.testInput(accountNumberInput, "Número da conta pode ser nulo");
		int accountNumber = Integer.parseInt(accountNumberInput);

		String accountAgency = JOptionPane.showInputDialog("Qual agência inicial?");
		TestEmptyInput.testInput(accountAgency, "Agência não pode ser nula");

		String accountBalanceInput = JOptionPane.showInputDialog("Adicione o saldo inicial");
		TestEmptyInput.testInput(accountBalanceInput, "Saldo não pode ser nulo");
		double accountBalance = Double.parseDouble(accountBalanceInput);

		String accountTypeInput = JOptionPane
				.showInputDialog("Tipo de conta \n 1 - conta  corrente \n 2 - conta especial");
		TestEmptyInput.testInput(accountTypeInput, "Cliente precisa ter um tipo de conta válido");
		AccountType accountType = AccountType.valueOf(Integer.parseInt(accountTypeInput));

		if (accountType == AccountType.CONTA_ESPECIAL) {
			String specialAccountLimitInput = JOptionPane.showInputDialog("Qual é o valor do limite de crédito?");
			TestEmptyInput.testInput(specialAccountLimitInput, "Contas especiais precisam ter algum limite");

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
