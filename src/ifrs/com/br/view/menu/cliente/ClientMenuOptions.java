package ifrs.com.br.view.menu.cliente;

import java.util.*;

public enum ClientMenuOptions {
	ADD_ACCOUNT(1), OPEN_ACCOUNT(2), CLOSE_ACCOUNT(3), SET_ACCOUNT_NOT_USED(4), MOVE_BACK(5);

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

	public static ClientMenuOptions valueOf(int option) {
		return (ClientMenuOptions) map.get(option);
	}

	public int getOption() {
		return option;
	}
}
