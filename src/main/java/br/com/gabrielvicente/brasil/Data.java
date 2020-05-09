package br.com.gabrielvicente.brasil;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Data {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);
        System.out.println();
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(hoje.format(formatador));

        System.out.println();

        LocalDateTime agora = LocalDateTime.now();
        System.out.println(agora);
        System.out.println();
        DateTimeFormatter formatadorComHora = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
        System.out.println(agora.format(formatadorComHora));
        System.out.println();
        DateTimeFormatter formatadorCurto = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        System.out.println(agora.format(formatadorCurto));

        System.out.println();
        DateTimeFormatter formatadorMedio = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        System.out.println(agora.format(formatadorMedio));
        System.out.println();

        DateTimeFormatter formatadorLongo = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        System.out.println(agora.format(formatadorLongo));
        System.out.println();
        DateTimeFormatter formatadorCheio = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        System.out.println(agora.format(formatadorCheio));

        System.out.println();
        DateTimeFormatter formatadorComNewLocale = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)
                .withLocale(new Locale("pt", "br"));
        System.out.println(agora.format(formatadorComNewLocale));
        System.out.println();

        System.out.println(agora.format(formatadorCurto));
        System.out.println(agora.minusHours(5).format(formatadorCurto));
        System.out.println(agora.plusHours(10).format(formatadorCurto));
    }
}
