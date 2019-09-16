package ifrs.com.br.model.conta;

public abstract class Conta implements OperacoesConta {
	double saldo;
	int numero;
	String agencia;

	public Conta(double saldo, int numero, String agencia) {
		super();
		this.saldo = saldo;
		this.numero = numero;
		this.agencia = agencia;
	}

	@Override
	public String toString() {
		return "Conta [saldo=" + saldo + ", numero=" + numero + ", agencia=" + agencia + "]";
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

}
