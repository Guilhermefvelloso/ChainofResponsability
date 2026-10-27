package padroescomportamentais.chainofresponsability;

public class TipoSolicitacaoHardware implements TipoSolicitacao {

    private static TipoSolicitacaoHardware tipoSolicitacaoHardware =
            new TipoSolicitacaoHardware();

    private TipoSolicitacaoHardware() {
    }

    public static TipoSolicitacaoHardware getTipoSolicitacaoHardware() {
        return tipoSolicitacaoHardware;
    }
}