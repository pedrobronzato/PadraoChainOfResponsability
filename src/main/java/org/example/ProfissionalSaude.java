package org.example;

import java.util.ArrayList;

public abstract class ProfissionalSaude {

    protected ArrayList listaConsultas = new ArrayList();

    private ProfissionalSaude profissionalSaudeSuperior;

    public ProfissionalSaude getProfissionalSaudeSuperiror() { return  profissionalSaudeSuperior; }

    public void setProfissionalSaudeSuperior(ProfissionalSaude profissionalSaudeSuperior) {
        this.profissionalSaudeSuperior = profissionalSaudeSuperior;
    }

    public abstract String getDescricaoCargo();

    public String marcarConsulta(Consulta consulta) {
            if(listaConsultas.contains(consulta.getTipoConsulta())) {
                return  getDescricaoCargo();
            }
            else {
                if(profissionalSaudeSuperior != null) {
                    return profissionalSaudeSuperior.marcarConsulta(consulta);
                }
                else {
                    return "Sem especialização";
                }
            }
    }

}
