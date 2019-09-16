package ifrs.com.br.view.menu.cliente;

import javax.swing.JOptionPane;

import ifrs.com.br.model.client.Cliente;
import ifrs.com.br.model.conta.Conta;
import ifrs.com.br.view.conta.AddContaView;
import ifrs.com.br.view.menu.MenuOptionsLabels;

public class ClienteMenu {
	public static void clientView(Cliente cliente) {
		String option = JOptionPane.showInputDialog(MenuOptionsLabels.getClientMenuLabel(cliente));
		ClientMenuOptions optionMenu = ClientMenuOptions.valueOf(Integer.parseInt(option));

		if (optionMenu != null) {
			switch (optionMenu) {
			case ADD_ACCOUNT:
				try {
					Conta conta = AddContaView.getConta();
					cliente.addConta(conta);
				} catch (IllegalArgumentException e) {
					JOptionPane.showMessageDialog(null, e.getMessage());
				}
				break;
			default:
				break;
			}
		}
	}
}
