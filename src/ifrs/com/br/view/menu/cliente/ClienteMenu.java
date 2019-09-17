package ifrs.com.br.view.menu.cliente;

import javax.swing.JOptionPane;

import ifrs.com.br.model.cliente.Cliente;
import ifrs.com.br.model.conta.Conta;
import ifrs.com.br.view.conta.AddContaView;
import ifrs.com.br.view.conta.ChangeAccountView;
import ifrs.com.br.view.menu.MenuOptionsLabels;

public class ClienteMenu {
	public static void clientView(Cliente cliente) {
		Boolean keepOpenMenu = true;
		while (keepOpenMenu) {
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

				case CLOSE_ACCOUNT:
					try {
						ChangeAccountView accountView = new ChangeAccountView(cliente);
						accountView.deactivateAccount();
					} catch (IllegalArgumentException e) {
						JOptionPane.showMessageDialog(null, e.getMessage());
					}
					break;

				case OPEN_ACCOUNT:
					try {
						ChangeAccountView accountView = new ChangeAccountView(cliente);
						accountView.activateAccount();
					} catch (IllegalArgumentException e) {
						JOptionPane.showMessageDialog(null, e.getMessage());
					}
					break;
				case SET_ACCOUNT_NOT_USED:
					try {
						ChangeAccountView accountView = new ChangeAccountView(cliente);
						accountView.setNotUsedAccount();
					} catch (IllegalArgumentException e) {
						JOptionPane.showMessageDialog(null, e.getMessage());
					}
					break;

				case CREDIT:
					try {
						ChangeAccountView accountView = new ChangeAccountView(cliente);
						accountView.creditOption();
					} catch (IllegalArgumentException e) {
						JOptionPane.showMessageDialog(null, e.getMessage());
					}
					break;

				case DEBIT:
					try {
						ChangeAccountView accountView = new ChangeAccountView(cliente);
						accountView.debitOption();
					} catch (IllegalArgumentException e) {
						JOptionPane.showMessageDialog(null, e.getMessage());
					}
					break;

				case MOVE_BACK:
					keepOpenMenu = false;
				default:
					break;
				}
			}
		}
	}
}
