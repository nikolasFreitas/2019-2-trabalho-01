package ifrs.com.br.view.menu;

import java.util.HashMap;
import java.util.Map;

public enum MainMenuOptionsEnum {
	CREATE_CLIENT(1), GET_CLIENT_BY_CPF(2), LIST_CLIENTS(3), LIST_OPENNED_ACCOUNTS(4),
	LIST_CLOSED_ACCOUNTS(5), LIST_NOT_USED_ACCOUNTS(6), EXIT(7);

	private int option;
	private static Map<Integer, MainMenuOptionsEnum> map = new HashMap<>();

	static {
		for (MainMenuOptionsEnum menuOption : MainMenuOptionsEnum.values()) {
			map.put(menuOption.getMenuOption(), menuOption);
		}
	}
	
	private MainMenuOptionsEnum(final int option) {
		this.option = option;
	}


	public static MainMenuOptionsEnum valueOf(int option) {
		return (MainMenuOptionsEnum) map.get(option);
	}

	public int getMenuOption() {
		return option;
	}
}
