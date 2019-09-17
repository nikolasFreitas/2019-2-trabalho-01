package ifrs.com.br.model.contaEspecial;

import javax.swing.JOptionPane;

import ifrs.com.br.model.conta.AccountType;
import ifrs.com.br.model.conta.Conta;
import ifrs.com.br.model.conta.SituacaoConta;

public class ContaEspecial extends Conta {
	private double limite;
	private final double limiteEstipulado;

	public ContaEspecial(double saldo, int numero, String agencia, double limite) {
		super(saldo, numero, agencia, AccountType.CONTA_ESPECIAL, SituacaoConta.ABERTA);
		this.limite = limite;
		this.limiteEstipulado = limite;
	}

	@Override
	public void credita(double valor) {
		double profit = valor;
		if (limiteEstipulado > limite) {
			double toBeFilled = limiteEstipulado - limite;
			if (toBeFilled > valor) {
				limite += valor;
				profit = 0;
			} else {
				limite = limiteEstipulado;				
				profit -= limite;
			}
		}

		double balance = super.getSaldo();
		super.setSaldo(balance + profit);
	}

	@Override
	public void debita(double valor) {
		double balance = super.getSaldo();
		if (valor > balance) {
			balance += limite;
			if (valor > balance) {
				JOptionPane.showMessageDialog(null, "Saldo insuficiente e limite utilizado");
			} else {
				int continueLimit = JOptionPane.showConfirmDialog(null,
						"Essa transação ira utilizar seu cheque especial, deseja continuar?");
				if (continueLimit == JOptionPane.YES_OPTION) {
					balance -= valor;
					limite = balance;
					super.setSaldo(0);
				}
			}
		} else {
			super.setSaldo(balance - valor);
		}

	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	@Override
	public String toString() {
		return (super.toString()
				+ "\n Limite estabelecido: " + limiteEstipulado
				+ "\n Limite disponível: " + limite);
	}
	

}
