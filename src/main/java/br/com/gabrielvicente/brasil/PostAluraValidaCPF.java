package br.com.gabrielvicente.brasil;

import br.com.caelum.stella.ValidationMessage;
import br.com.caelum.stella.format.CPFFormatter;
import br.com.caelum.stella.format.Formatter;
import br.com.caelum.stella.validation.CPFValidator;

import java.util.List;

public class PostAluraValidaCPF {
    public static void main(String[] args) {
        String cpf = "357.672.271-87";
        String cpfFormatado = formatarDocumentoSemMascara(new CPFFormatter(), cpf);
        boolean valido = valida(cpfFormatado);
        // cadastra(valido);
    }

    private static boolean valida(String cpf) {
        CPFValidator cpfValidator = new CPFValidator();
        List<ValidationMessage> erros = cpfValidator.invalidMessagesFor(cpf);
        if (erros.size() > 0) {
            System.out.println("Inválido");
            System.out.println(erros);
            return false;
        } else {
            System.out.println("CPF válido");
            return true;
        }
    }

    private static String formatarDocumentoSemMascara(Formatter formatador, String documento) {
        return formatador.unformat(documento);
    }
}

   
