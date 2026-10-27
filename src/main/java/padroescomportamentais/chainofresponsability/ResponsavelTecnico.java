package padroescomportamentais.chainofresponsability;

public class ResponsavelTecnico extends Responsavel {

    public ResponsavelTecnico(Responsavel proximoResponsavel) {
        listaSolicitacoes.add(
                TipoSolicitacaoHardware.getTipoSolicitacaoHardware()
        );

        setProximoResponsavel(proximoResponsavel);
    }

    @Override
    public String getDescricaoCargo() {
        return "Técnico";
    }
}