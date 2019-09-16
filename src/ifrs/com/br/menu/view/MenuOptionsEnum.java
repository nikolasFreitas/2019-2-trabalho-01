package ifrs.com.br.menu.view;

import java.util.HashMap;
import java.util.Map;

//Tradução do Enum retirado de: https://codingexplained.com/coding/java/enum-to-integer-and-integer-to-enum

public enum MenuOptionsEnum {
	CREATE_CLIENT(1), LIST_CLIENT_AND_ACCOUNTS(2), DEPOSIT(3), WITHDRAW(4), LIST_OPENNED_ACCOUNTS(5),
	LIST_CLOSED_ACCOUNTS(6), LIST_NOT_USED_ACCOUNTS(7), EXIT(8);

	private int option;
	private static Map<Integer, MenuOptionsEnum> map = new HashMap<>();

	private MenuOptionsEnum(final int option) {
		this.option = option;
	}

	static {
		for (MenuOptionsEnum menuOption : MenuOptionsEnum.values()) {
			map.put(menuOption.getMenuOption(), menuOption);
		}
	}

	public static MenuOptionsEnum valueOf(int option) {
		return (MenuOptionsEnum) map.get(option);
	}

	public int getMenuOption() {
		return option;
	}
}
