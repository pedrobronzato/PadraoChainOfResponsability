package org.example;

public class MedicoGeral extends ProfissionalSaude {
    public MedicoGeral(ProfissionalSaude superior) {
        listaConsultas.add(ConsultaMedicoGeral.getConsultaMedicoGeral());
        setProfissionalSaudeSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Médico Geral";
    }
}
