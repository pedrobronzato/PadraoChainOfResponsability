package org.example;

public class ConsultaCirurgiao  implements TipoConsulta{
    private static ConsultaCirurgiao consultaCirurgiao = new ConsultaCirurgiao();

    private ConsultaCirurgiao() {};

    public static ConsultaCirurgiao getConsultaCirurgiao() {
        return consultaCirurgiao;
    }
}