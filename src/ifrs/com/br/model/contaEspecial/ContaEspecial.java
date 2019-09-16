package ifrs.com.br.model.contaEspecial;

import ifrs.com.br.model.conta.Conta;

public class ContaEspecial extends Conta {
	private double limite;

	public ContaEspecial(double saldo, int numero, String agencia, double limite) {
		super(saldo, numero, agencia);
		this.limite = limite;
	}

	@Override
	public void credita(double valor) {		
		
	}

	@Override
	public void debita(double valor) {		
	}

}
