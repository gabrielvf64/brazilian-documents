package br.com.gabrielvicente.brasil;

import br.com.caelum.stella.format.CPFFormatter;

public class FormatadorDocumento {
    public static void main(String[] args) {
        String cpf = "862.883.667-57";
        String cnpj = "10.156.788/0001-83";
        String tituloDeEleitor = "815520840108";

        CPFFormatter formatadorCPF = new CPFFormatter();

        String cpfSemFormatacao = formatadorCPF.unformat(cpf);

        System.out.println(cpf);
        System.out.println(cpfSemFormatacao);
    }
}
