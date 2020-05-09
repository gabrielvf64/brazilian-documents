package br.com.gabrielvicente.brasil;

import org.javamoney.moneta.FastMoney;
import org.javamoney.moneta.convert.ExchangeRateType;

import javax.money.CurrencyUnit;
import javax.money.Monetary;
import javax.money.MonetaryAmount;
import javax.money.convert.CurrencyConversion;
import javax.money.convert.ExchangeRateProvider;
import javax.money.convert.MonetaryConversions;

/* A API Moneta tem várias features legais, e uma delas resolve o nosso problema de cotação
 entre moedas de diferentes países. Imagina que compramos um produto que custou USD 90,00
 mas temos que pagar BRL 30,00 de imposto. Qual o valor final do produto, em dólar,
 somando esse valor do imposto que está em real? */

public class Cotacao {
    public static void main(String[] args) {

        // moedas e valores
        CurrencyUnit dolar = Monetary.getCurrency("USD");
        CurrencyUnit real = Monetary.getCurrency("BRL");
        MonetaryAmount valorProdutoDolar = FastMoney.of(90, dolar);
        MonetaryAmount valorImpostoReal = FastMoney.of(30, real);

        // pegando a cotação
        ExchangeRateProvider provider = MonetaryConversions.getExchangeRateProvider(ExchangeRateType.ECB);


        // conversao do dia
        CurrencyConversion conversaoAtual = provider.getCurrencyConversion(dolar);


        // convertendo o valor do imposto para dolar
        MonetaryAmount valorImpostoDolar = conversaoAtual.apply(valorImpostoReal);


        // agora que estão na mesma moeda, podemos somar
        MonetaryAmount valorFinalProdutoDolar = valorProdutoDolar.add(valorImpostoDolar);

        System.out.println(valorFinalProdutoDolar);
    }
}
