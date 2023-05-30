package org.example;

public class ConsultaMedicoGeral implements TipoConsulta {
    private static ConsultaMedicoGeral consultaMedicoGeral = new ConsultaMedicoGeral();

    private ConsultaMedicoGeral() {};

    public static ConsultaMedicoGeral getConsultaMedicoGeral() {
        return consultaMedicoGeral;
    }
}
