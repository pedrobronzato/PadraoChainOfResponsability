package org.example;

public class Cirurgiao extends ProfissionalSaude {
    public Cirurgiao(ProfissionalSaude superior) {
        listaConsultas.add(ConsultaCirurgiao.getConsultaCirurgiao());
        setProfissionalSaudeSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Cirurgiao";
    }
}
