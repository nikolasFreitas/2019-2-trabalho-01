package ifrs.com.br.view.menu.cliente;

import java.util.*;

public enum ClientMenuOptions {
	LIST_ACCOUNTS(1), ADD_ACCOUNT(2);

	private final int option;
	private static Map<Integer, ClientMenuOptions> map = new HashMap<>();

	static {
		for (ClientMenuOptions clientOption : ClientMenuOptions.values()) {
			map.put(clientOption.getOption(), clientOption);
		}
	}

	private ClientMenuOptions(final int option) {
		this.option = option;
	}

	public ClientMenuOptions valueOf(int option) {
		return (ClientMenuOptions) map.get(option);
	}

	public int getOption() {
		return option;
	}
}
