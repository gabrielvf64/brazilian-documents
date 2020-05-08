package br.com.gabrielvicente.brasil;

import br.com.caelum.stella.format.CNPJFormatter;
import br.com.caelum.stella.format.CPFFormatter;
import br.com.caelum.stella.format.TituloEleitoralFormatter;

public class FormatadorDocumento {
    public static void main(String[] args) {
        String cpf = "862.883.667-57";
        String cnpj = "10.156.788/0001-83";
        String tituloEleitor = "815520840108";

        CPFFormatter formatadorCPF = new CPFFormatter();

        String cpfSemFormatacao = formatadorCPF.unformat(cpf);

        System.out.println(cpf);
        System.out.println(cpfSemFormatacao);

        imprimeLinhaSeparadora();

        CNPJFormatter formatadorCNPJ = new CNPJFormatter();

        String cnpjSemFormatacao = formatadorCNPJ.unformat(cnpj);

        System.out.println(cnpj);
        System.out.println(cnpjSemFormatacao);

        imprimeLinhaSeparadora();

        TituloEleitoralFormatter formatadorTitulo = new TituloEleitoralFormatter();
        String tituloComFormatacao = formatadorTitulo.format(tituloEleitor);

        System.out.println(tituloEleitor);
        System.out.println(tituloComFormatacao);
    }

    private static void imprimeLinhaSeparadora() {
        System.out.println("======================");
    }
}
