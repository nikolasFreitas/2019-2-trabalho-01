package ifrs.com.br.model.conta;

public abstract class Conta implements OperacoesConta {
	private double saldo;
	private int numero;
	private String agencia;
	private AccountType accountType;

	public Conta(double saldo, int numero, String agencia, AccountType accountType) {
		super();
		this.saldo = saldo;
		this.numero = numero;
		this.agencia = agencia;
		this.accountType = accountType;
	}

	@Override
	public String toString() {
		return "Conta [saldo=" + saldo + ", numero=" + numero + ", agencia=" + agencia + ", accountType=" + accountType
				+ "]";
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public AccountType getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}

}
