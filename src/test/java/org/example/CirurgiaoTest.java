package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CirurgiaoTest {
    ProfissionalSaude assistente;
    ProfissionalSaude medicoGeral;
    ProfissionalSaude cirurgiao;

    @BeforeEach
    void setUp() {
        cirurgiao = new Cirurgiao(null);
        medicoGeral = new MedicoGeral(cirurgiao);
        assistente = new Assistente(medicoGeral);
    }

    @Test
    void deveRetornarAssistenteParaConsultaAssistente() {
        assertEquals("Assistente Medico", assistente.marcarConsulta(new Consulta(ConsultaAssistente.getConsultaAssistente())));
    }

    @Test
    void deveRetornarMedicoGeralParaConsultaMedicoGeral() {
        assertEquals("Médico Geral", assistente.marcarConsulta(new Consulta(ConsultaMedicoGeral.getConsultaMedicoGeral())));
    }

    @Test
    void deveRetornarCirurgiaoParaConsultaCirurgiao() {
        assertEquals("Cirurgiao", assistente.marcarConsulta(new Consulta(ConsultaCirurgiao.getConsultaCirurgiao())));
    }

    @Test
    void deveRetornarSemespecializacaoParaConsultaGeral() {
        assertEquals("Sem especialização", assistente.marcarConsulta(new Consulta(ConsultaGeral.getConsultaGeral())));
    }




}