package ifrs.com.br.model.contaCorrente;

import ifrs.com.br.model.conta.AccountType;
import ifrs.com.br.model.conta.Conta;
import ifrs.com.br.model.conta.SituacaoConta;

public class ContaCorrente extends Conta{

	public ContaCorrente(double saldo, int numero, String agencia) {
		super(saldo, numero, agencia, AccountType.CONTA_CORRENTE, SituacaoConta.ABERTA);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void credita(double valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void debita(double valor) {
		// TODO Auto-generated method stub
		
	}
	
}
