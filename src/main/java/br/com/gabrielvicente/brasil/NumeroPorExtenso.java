package br.com.gabrielvicente.brasil;

import br.com.caelum.stella.inwords.FormatoDeReal;
import br.com.caelum.stella.inwords.InteiroSemFormato;
import br.com.caelum.stella.inwords.NumericToWordsConverter;

import java.math.BigDecimal;

public class NumeroPorExtenso {
    public static void main(String[] args) {
        NumericToWordsConverter conversor = new NumericToWordsConverter(new InteiroSemFormato());
        BigDecimal valor = new BigDecimal("75.00");
        String valorPorExtenso = conversor.toWords(valor.doubleValue());
        System.out.println(valorPorExtenso + " reais");

        NumericToWordsConverter conversorFormatoReais = new NumericToWordsConverter(new FormatoDeReal());
        BigDecimal valor2 = new BigDecimal("75.10");
        String valorPorExtenso2 = conversorFormatoReais.toWords(valor2.doubleValue());
        System.out.println(valorPorExtenso2);
    }
}
