package padroescomportamentais.chainofresponsability;

import java.util.ArrayList;

public abstract class Responsavel {

    protected ArrayList listaSolicitacoes = new ArrayList();

    private Responsavel proximoResponsavel;

    public Responsavel getProximoResponsavel() {
        return proximoResponsavel;
    }

    public void setProximoResponsavel(Responsavel proximoResponsavel) {
        this.proximoResponsavel = proximoResponsavel;
    }

    public abstract String getDescricaoCargo();

    public String atenderSolicitacao(Solicitacao solicitacao) {

        if (listaSolicitacoes.contains(solicitacao.getTipoSolicitacao())) {
            return getDescricaoCargo();
        } else {
            if (proximoResponsavel != null) {
                return proximoResponsavel.atenderSolicitacao(solicitacao);
            } else {
                return "Sem atendimento";
            }
        }
    }
}