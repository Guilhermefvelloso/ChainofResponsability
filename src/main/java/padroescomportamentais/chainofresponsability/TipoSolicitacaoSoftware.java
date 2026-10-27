package padroescomportamentais.chainofresponsability;

public class TipoSolicitacaoSoftware implements TipoSolicitacao {

    private static TipoSolicitacaoSoftware tipoSolicitacaoSoftware =
            new TipoSolicitacaoSoftware();

    private TipoSolicitacaoSoftware() {
    }

    public static TipoSolicitacaoSoftware getTipoSolicitacaoSoftware() {
        return tipoSolicitacaoSoftware;
    }
}