package br.com.gabrielvicente.brasil;

import br.com.caelum.stella.inwords.FormatoDeReal;
import br.com.caelum.stella.inwords.NumericToWordsConverter;
import org.javamoney.moneta.Money;
import org.javamoney.moneta.function.MonetaryOperators;

import javax.money.CurrencyUnit;
import javax.money.Monetary;
import javax.money.MonetaryAmount;
import javax.money.NumberValue;

public class IntegracaoApisDesconto {
    public static void main(String[] args) {
        // criando a moeda com valor de R$
        CurrencyUnit moeda = Monetary.getCurrency("BRL");

        // criando o valor em moeda
        MonetaryAmount valorParcela = Money.of(75, moeda);
        System.out.println(valorParcela);

        MonetaryAmount valorTotal = valorParcela.multiply(12);
        System.out.println(valorTotal);

        // aplicando percentual
        MonetaryAmount desconto = valorTotal.with(MonetaryOperators.percent(10));
        System.out.println(desconto);

        NumberValue descontoSemMoeda = desconto.getNumber();

        // convertendo para numero por extenso
        NumericToWordsConverter conversor = new NumericToWordsConverter(new FormatoDeReal());
        String valorPorExtenso = conversor.toWords(descontoSemMoeda.doubleValue());
        System.out.println(valorPorExtenso);

        System.out.println("Você ganhou " + valorPorExtenso + " de desconto");
    }
}
