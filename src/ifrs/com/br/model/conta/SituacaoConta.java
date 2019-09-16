package ifrs.com.br.model.conta;

public enum SituacaoConta {
	ABERTA(1), FECHADA(2), SEM_MOVIMENTACAO(3);

	private final int situacao;

	private SituacaoConta(int situacao) {
		this.situacao = situacao;
	}
	
	public int getSituacao() {
		return situacao;
	}
}
