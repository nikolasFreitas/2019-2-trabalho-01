package ifrs.com.br.model.contaEspecial;

import ifrs.com.br.model.conta.AccountType;
import ifrs.com.br.model.conta.Conta;
import ifrs.com.br.model.conta.SituacaoConta;

public class ContaEspecial extends Conta {
	private double limite;

	public ContaEspecial(double saldo, int numero, String agencia, double limite) {
		super(saldo, numero, agencia, AccountType.CONTA_ESPECIAL, SituacaoConta.ABERTA);
		this.limite = limite;
	}

	@Override
	public void credita(double valor) {
		super.setSaldo(valor + super.getSaldo());
	}

	@Override
	public void debita(double valor) {
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	

}
