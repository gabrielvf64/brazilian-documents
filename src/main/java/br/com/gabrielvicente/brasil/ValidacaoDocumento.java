package br.com.gabrielvicente.brasil;

import br.com.caelum.stella.validation.CPFValidator;
import br.com.caelum.stella.validation.InvalidStateException;

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

    }
}
