package padroescomportamentais.chainofresponsability;

public class ResponsavelEspecialista extends Responsavel {

    public ResponsavelEspecialista(Responsavel proximoResponsavel) {
        listaSolicitacoes.add(
                TipoSolicitacaoSoftware.getTipoSolicitacaoSoftware()
        );

        listaSolicitacoes.add(
                TipoSolicitacaoRede.getTipoSolicitacaoRede()
        );

        setProximoResponsavel(proximoResponsavel);
    }

    @Override
    public String getDescricaoCargo() {
        return "Especialista";
    }
}