package padroescomportamentais.chainofresponsability;

public class TipoSolicitacaoAcesso implements TipoSolicitacao {

    private static TipoSolicitacaoAcesso tipoSolicitacaoAcesso =
            new TipoSolicitacaoAcesso();

    private TipoSolicitacaoAcesso() {
    }

    public static TipoSolicitacaoAcesso getTipoSolicitacaoAcesso() {
        return tipoSolicitacaoAcesso;
    }
}