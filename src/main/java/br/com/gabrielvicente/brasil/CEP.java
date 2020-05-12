package br.com.gabrielvicente.brasil;

import com.github.gilbertotorrezan.viacep.se.ViaCEPClient;
import com.github.gilbertotorrezan.viacep.shared.ViaCEPEndereco;

import java.io.IOException;

public class CEP {
    public static void main(String[] args) {
        ViaCEPClient viaCEPClient = new ViaCEPClient();
        try {
            ViaCEPEndereco endereco = viaCEPClient.getEndereco("82010340");
            System.out.println(endereco.getLocalidade());
            System.out.println(endereco.getBairro());
            System.out.println(endereco.getUf());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
