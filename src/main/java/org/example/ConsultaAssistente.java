package org.example;

public class ConsultaAssistente  implements TipoConsulta{
    private static ConsultaAssistente consultaAssistente = new ConsultaAssistente();

    private ConsultaAssistente() {};

    public static ConsultaAssistente getConsultaAssistente() {
        return consultaAssistente;
    }
}
