package ifrs.com.br.view.menu;

import java.util.Iterator;

import ifrs.com.br.model.cliente.Cliente;
import ifrs.com.br.model.conta.Conta;

public class MenuOptionsLabels {
	public static String getMainMenuLabels() {
		return  ("1 – Cadastrar Cliente e sua(s) conta(s)\n"
				+ "2 - Pesquisar cliente por CPF \n"
				+ "3 – Listar todos os Clientes\n"
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
		
		String options = ("\n\n1 - Adicionar conta\n"
				+ "2 - Abrir conta \n"
				+ "3 - fechar conta \n"
				+ "4 - Registrar conta inalterada \n"
				+ "5 - Adicionar dinheiro \n"
				+ "6 - Sacar dinheiro \n"
				+ "7 - Voltar");
		
		return (clientName + clientCpf + contas.toString() + options);
	}	
	
}
