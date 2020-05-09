package br.com.gabrielvicente.brasil;

import br.com.caelum.stella.inwords.FormatoDeReal;
import br.com.caelum.stella.inwords.NumericToWordsConverter;

import java.math.BigDecimal;

public class ComprovantePagamento {
    public static void main(String[] args) {

        String comprovantePagamento = criarComprovantePagamento(new BigDecimal("98.76"));
        System.out.println(comprovantePagamento);
    }

    private static String criarComprovantePagamento(BigDecimal valor) {
        NumericToWordsConverter conversor = new NumericToWordsConverter(new FormatoDeReal());
        return conversor.toWords(valor.doubleValue());
    }
}
