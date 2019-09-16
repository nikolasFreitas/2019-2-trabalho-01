package ifrs.com.br.view;

import java.util.*;
import javax.swing.*;

import ifrs.com.br.model.client.Cliente;
import ifrs.com.br.view.client.ClientView;
import ifrs.com.br.view.menu.*;

public class Principal {
	public static void main(String[] args) {
		Map<String, Cliente> clientList = new HashMap<>();
		while (true) {
			String option = JOptionPane.showInputDialog(MenuOptionsLabels.getLabels());
			MenuOptionsEnum optionMenu = MenuOptionsEnum.valueOf(Integer.parseInt(option));

			if (optionMenu != null) {

				switch (optionMenu) {
				case CREATE_CLIENT:
					try {
						Cliente client = ClientView.getClient();
						clientList.put(client.getCpf(), client);
						JOptionPane.showMessageDialog(null, "Cliente \"" + client.getNome() + "\" adcionado!");
					} catch (IllegalArgumentException e) {
						JOptionPane.showMessageDialog(null, e.getMessage());
					}
					break;

				case EXIT:
					System.exit(0);
					break;

				default:
					JOptionPane.showMessageDialog(null, "Opção inválida");
					break;
				}

			} else {
				JOptionPane.showMessageDialog(null, "Selecione uma opção para continuar");
			}

		}
	}
}
