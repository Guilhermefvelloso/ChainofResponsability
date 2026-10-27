package padroescomportamentais.chainofresponsability;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolicitacaoTest {

    ResponsavelEspecialista especialista;
    ResponsavelTecnico tecnico;
    ResponsavelAtendimento atendimento;

    @BeforeEach
    void setUp() {
        especialista = new ResponsavelEspecialista(null);
        tecnico = new ResponsavelTecnico(especialista);
        atendimento = new ResponsavelAtendimento(tecnico);
    }

    @Test
    void deveRetornarAtendimentoParaSolicitacaoDeAcesso() {
        assertEquals(
                "Atendimento",
                atendimento.atenderSolicitacao(
                        new Solicitacao(
                                TipoSolicitacaoAcesso.getTipoSolicitacaoAcesso()
                        )
                )
        );
    }

    @Test
    void deveRetornarTecnicoParaSolicitacaoDeHardware() {
        assertEquals(
                "Técnico",
                atendimento.atenderSolicitacao(
                        new Solicitacao(
                                TipoSolicitacaoHardware.getTipoSolicitacaoHardware()
                        )
                )
        );
    }

    @Test
    void deveRetornarEspecialistaParaSolicitacaoDeSoftware() {
        assertEquals(
                "Especialista",
                atendimento.atenderSolicitacao(
                        new Solicitacao(
                                TipoSolicitacaoSoftware.getTipoSolicitacaoSoftware()
                        )
                )
        );
    }

    @Test
    void deveRetornarEspecialistaParaSolicitacaoDeRede() {
        assertEquals(
                "Especialista",
                atendimento.atenderSolicitacao(
                        new Solicitacao(
                                TipoSolicitacaoRede.getTipoSolicitacaoRede()
                        )
                )
        );
    }

    @Test
    void deveRetornarSemAtendimentoParaSolicitacaoDesconhecida() {
        assertEquals(
                "Sem atendimento",
                atendimento.atenderSolicitacao(
                        new Solicitacao(null)
                )
        );
    }
}