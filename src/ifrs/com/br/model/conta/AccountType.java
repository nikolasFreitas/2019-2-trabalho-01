package ifrs.com.br.model.conta;

import java.util.HashMap;
import java.util.Map;

public enum AccountType {
	CONTA_CORRENTE(1), CONTA_ESPECIAL(2);

	private final int tipo;
	private static Map<Integer, AccountType> map = new HashMap<Integer, AccountType>();

	private AccountType(final int tipo) {
		this.tipo = tipo;
	}

	static {
		for (AccountType conta : AccountType.values()) {
			map.put(conta.getTipoDeContaValue(), conta);
		}
	}
	
	public static AccountType valueOf(int tipoDeConta) {
		return (AccountType) map.get(tipoDeConta);
	}

	public int getTipoDeContaValue() {
		return tipo;
	}
}
