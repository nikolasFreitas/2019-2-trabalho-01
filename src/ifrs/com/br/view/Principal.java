package ifrs.com.br.view;

import java.util.*;
import javax.swing.*;
import ifrs.com.br.client.model.Client;
import ifrs.com.br.client.view.ClientView;
import ifrs.com.br.menu.view.*;

public class Principal {
	public static void main(String[] args) {
		Map<String, Client> clientList = new HashMap<>();
		while (true) {
			String option = JOptionPane.showInputDialog(MenuOptionsLabels.getLabels());

			if (option != null) {
				MenuOptionsEnum optionMenu = MenuOptionsEnum.valueOf(Integer.parseInt(option));
				switch (optionMenu) {
				case CREATE_CLIENT:
					try {
						Client client = ClientView.getClient();
						clientList.put(client.getCpf(), client);

					} catch (IllegalArgumentException e) {
						JOptionPane.showMessageDialog(null, e.getMessage());
					}
					break;
				case EXIT:
					System.exit(0);
					break;
				default:
					break;
				}

			} else {
				JOptionPane.showMessageDialog(null, "Selecione uma opção para continuar");
			}

		}
	}
}
