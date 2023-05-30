package org.example;

public class ConsultaGeral implements TipoConsulta {

    private static ConsultaGeral consultaGeral = new ConsultaGeral();

    private ConsultaGeral() {
    };

    public static ConsultaGeral getConsultaGeral() {
        return consultaGeral;
    }
}
