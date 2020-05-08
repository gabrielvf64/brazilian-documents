package br.com.gabrielvicente.brasil;

import br.com.caelum.stella.validation.CNPJValidator;
import br.com.caelum.stella.validation.CPFValidator;
import br.com.caelum.stella.validation.InvalidStateException;
import br.com.caelum.stella.validation.TituloEleitoralValidator;

public class ValidacaoDocumento {
    public static void main(String[] args) {
//        86288366757
//        98745366797
        String cpf = "86288366757";
        CPFValidator validador = new CPFValidator();
        try {
            validador.assertValid(cpf);
            System.out.println("CPF válido");
        } catch (InvalidStateException e) {
            System.out.println("CPF inválido: " + e);
        }

//        68075519000172
        String cnpj = "68075519000172";
        CNPJValidator validadorCNPJ = new CNPJValidator();
        try {
            validadorCNPJ.assertValid(cnpj);
            System.out.println("CNPJ válido");
        } catch (InvalidStateException e) {
            System.out.println("CNPJ inválido" + e);
        }

//        815520840108
        String tituloDeEleitor = "815520840108";
        TituloEleitoralValidator validadorTitulo = new TituloEleitoralValidator();
        try {
            validadorTitulo.assertValid(tituloDeEleitor);
            System.out.println("Título de eleitor válido");
        } catch (InvalidStateException e) {
            System.out.println("Título de eleitor inválido" + e);
        }
    }
}
