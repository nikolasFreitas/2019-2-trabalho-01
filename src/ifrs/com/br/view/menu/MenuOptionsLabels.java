package ifrs.com.br.view.menu;

import java.util.Iterator;

import ifrs.com.br.model.client.Cliente;
import ifrs.com.br.model.conta.Conta;

public class MenuOptionsLabels {
	public static String getMainMenuLabels() {
		return  ("1 – Cadastrar Cliente e sua(s) conta(s)\n"
				+ "2 - Pesquisar cliente por CPF \n"
				+ "3 – Listar todos os Clientes\n"
	            + "4 – Listar todas as contas Abertas\n"
	            + "5 – Listar todas as contas Fechadas\n"
	            + "6 – Listar todas as contas Sem movimentação\n"
	            + "7 – Sair");
	}
	
	public static String getClientMenuLabel(Cliente cliente) {
		String clientName = "Nome do cliente: " + cliente.getNome() + "\n";
		String clientCpf = "Nome do cpf: " + cliente.getCpf() + "\n\n";
		StringBuffer contas = new StringBuffer("Contas: \n");
		for (Iterator<Conta> iterator = cliente.getContas().iterator(); iterator.hasNext();) {
			Conta conta = iterator.next();
			contas.append(conta.toString() + "\n");
		}
		
		String options = "\n\n 1 - Adicionar conta\n";
		
		return (clientName + clientCpf + contas.toString() + options);
	}	
	
}
