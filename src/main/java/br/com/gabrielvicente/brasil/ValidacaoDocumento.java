package br.com.gabrielvicente.brasil;

import br.com.caelum.stella.validation.*;

public class ValidacaoDocumento {
    public static void main(String[] args) {
//        86288366757
//        98745366797
        String cpf = "86288366757";
        try {
            validarDocumentos(new CPFValidator(), cpf);
            System.out.println("CPF válido");
        } catch (InvalidStateException e) {
            System.out.println("CPF inválido: " + e);
        }

//        68075519000172
        String cnpj = "68075519000172";
        try {
            validarDocumentos(new CNPJValidator(), cnpj);
            System.out.println("CNPJ válido");
        } catch (InvalidStateException e) {
            System.out.println("CNPJ inválido " + e);
        }

//        815520840108
        String tituloDeEleitor = "815520840108";
        try {
            validarDocumentos(new TituloEleitoralValidator(), tituloDeEleitor);
            System.out.println("Título de eleitor válido");
        } catch (InvalidStateException e) {
            System.out.println("Título de eleitor inválido " + e);
        }
    }

    private static void validarDocumentos(Validator<String> validator, String documento) {
        validator.assertValid(documento);
    }
}
