package padroescomportamentais.chainofresponsability;

public class TipoSolicitacaoRede implements TipoSolicitacao {

    private static TipoSolicitacaoRede tipoSolicitacaoRede =
            new TipoSolicitacaoRede();

    private TipoSolicitacaoRede() {
    }

    public static TipoSolicitacaoRede getTipoSolicitacaoRede() {
        return tipoSolicitacaoRede;
    }
}