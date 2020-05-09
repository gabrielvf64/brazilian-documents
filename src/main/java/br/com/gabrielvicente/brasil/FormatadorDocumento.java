package br.com.gabrielvicente.brasil;

import br.com.caelum.stella.format.CNPJFormatter;
import br.com.caelum.stella.format.CPFFormatter;
import br.com.caelum.stella.format.Formatter;
import br.com.caelum.stella.format.TituloEleitoralFormatter;

public class FormatadorDocumento {
    public static void main(String[] args) {
        String cpf = "86288366757";
        String cnpjComMascara = "10.156.788/0001-83";
        String tituloEleitor = "815520840108";

        String cpfComMascara = formatarDocumentoComMascara(new CPFFormatter(), cpf);

        System.out.println(cpfComMascara);

        imprimeLinhaSeparadora();

        String cnpj = formatarDocumentoSemMascara(new CNPJFormatter(), cnpjComMascara);

        System.out.println(cnpj);

        imprimeLinhaSeparadora();

        String tituloEleitorComMascara = formatarDocumentoComMascara(new TituloEleitoralFormatter(), tituloEleitor);

        System.out.println(tituloEleitorComMascara);
    }

    private static String formatarDocumentoSemMascara(Formatter formatador, String documento) {
        return formatador.unformat(documento);
    }

    private static String formatarDocumentoComMascara(Formatter formatador, String documento) {
        return formatador.format(documento);
    }

    private static void imprimeLinhaSeparadora() {
        System.out.println("============================================");
    }
}
