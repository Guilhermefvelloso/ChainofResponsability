package padroescomportamentais.chainofresponsability;

public class ResponsavelAtendimento extends Responsavel {

    public ResponsavelAtendimento(Responsavel proximoResponsavel) {
        listaSolicitacoes.add(
                TipoSolicitacaoAcesso.getTipoSolicitacaoAcesso()
        );

        setProximoResponsavel(proximoResponsavel);
    }

    @Override
    public String getDescricaoCargo() {
        return "Atendimento";
    }
}