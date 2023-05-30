package org.example;

public class Assistente extends ProfissionalSaude {
    public Assistente(ProfissionalSaude superior) {
        listaConsultas.add(ConsultaAssistente.getConsultaAssistente());
        setProfissionalSaudeSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Assistente Medico";
    }
}
