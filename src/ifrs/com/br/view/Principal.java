package ifrs.com.br.view;

import java.util.*;
import javax.swing.*;

import ifrs.com.br.model.client.Cliente;
import ifrs.com.br.util.exception.TestEmptyInput;
import ifrs.com.br.view.client.ClientView;
import ifrs.com.br.view.menu.*;
import ifrs.com.br.view.menu.cliente.ClienteMenu;

public class Principal {
	public static void main(String[] args) {
		Map<String, Cliente> clientList = new HashMap<>();
		while (true) {
			String option = JOptionPane.showInputDialog(MenuOptionsLabels.getMainMenuLabels());
			MainMenuOptionsEnum optionMenu = MainMenuOptionsEnum.valueOf(Integer.parseInt(option));

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

				case GET_CLIENT_BY_CPF:
					try {
						String cpf = JOptionPane.showInputDialog("Digite o CPF do cliente");
						TestEmptyInput.testInput(cpf, "Cpf inválido");
						Cliente cliente = clientList.get(cpf);
						if (cliente != null) {
							ClienteMenu.clientView(cliente);
						} else {
							JOptionPane.showMessageDialog(null, "cpf não encontrado");
						}
					} catch (IllegalArgumentException e) {
						System.out.println(e.getMessage());
					}
					break;

				case LIST_CLIENTS:
					StringBuffer clientInformation = new StringBuffer("Lista de clientes \n\n");
					if (!clientList.values().isEmpty()) {
						for (Cliente client : clientList.values()) {
							clientInformation.append(client.toString());
							clientInformation.append("\n-------- \n\n");
						}
						JOptionPane.showMessageDialog(null, clientInformation.toString());
					} else {
						JOptionPane.showMessageDialog(null, "Ainda não existem clientes cadastrados");
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
