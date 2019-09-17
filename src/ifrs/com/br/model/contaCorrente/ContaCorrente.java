package ifrs.com.br.model.contaCorrente;

import javax.swing.JOptionPane;

import ifrs.com.br.model.conta.AccountType;
import ifrs.com.br.model.conta.Conta;
import ifrs.com.br.model.conta.SituacaoConta;

public class ContaCorrente extends Conta {

	public ContaCorrente(double saldo, int numero, String agencia) {
		super(saldo, numero, agencia, AccountType.CONTA_CORRENTE, SituacaoConta.ABERTA);
	}

	@Override
	public void credita(double valor) {
		double saldo = super.getSaldo();
		super.setSaldo(valor + saldo);
	}

	@Override
	public void debita(double valor) {
		double balance = super.getSaldo();
		if (balance > valor) {
			super.setSaldo(balance - valor);
		} else {
			JOptionPane.showMessageDialog(null, "Saldo insuficiente");
		}
	}

}
