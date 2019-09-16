package ifrs.com.br.view.menu.cliente;

import javax.swing.JOptionPane;

import ifrs.com.br.model.client.Cliente;
import ifrs.com.br.view.menu.MenuOptionsLabels;

public class ClienteMenu {
	public static void clientView(Cliente cliente) {
		String option = JOptionPane.showInputDialog(MenuOptionsLabels.getClientMenuLabel(cliente));
	}
}
