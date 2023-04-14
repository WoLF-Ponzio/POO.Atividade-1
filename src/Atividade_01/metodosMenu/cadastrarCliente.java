package src.Atividade_01.metodosMenu;

import src.Atividade_01.Classes.*;
import static javax.swing.JOptionPane.*;
import java.util.ArrayList;
import static java.lang.Double.parseDouble;

public class cadastrarCliente {

    public Cliente cadastro(ArrayList<Pessoa> listaPessoas) {

        boolean teste = true;

        try {

            Cliente cliente = new Cliente();
            cliente.setNome(showInputDialog(getRootFrame(), "Digite o nome do Cliente", "Cadastro do Cliente",
                    DEFAULT_OPTION));
            while (teste == true) {
                cliente.setCpf(showInputDialog(getRootFrame(), "Digite o CPF do Cliente (11 dígitos)", "Cadastro do Cliente",
                        DEFAULT_OPTION));
                teste = false;
                if (listaPessoas.isEmpty()) {
                    teste = false;
                } else {
                    for (Pessoa pessoa : listaPessoas) {
                        if (pessoa.getCpf().equals(cliente.getCpf())) {
                            showConfirmDialog(null, "CPF já cadastrado! Digite um CPF válido!", "Erro!",
                                    DEFAULT_OPTION, ERROR_MESSAGE);
                            teste = true;
                        } else {

                        }
                    }
                }
            }
            cliente.setValorDaDivida(
                    parseDouble(showInputDialog(null, "Digite o valor da divida atual do cliente",
                            "Cadastro do Cliente", DEFAULT_OPTION)));
            System.out.println(cliente);
            return cliente;

        } catch (Exception e) {
            showConfirmDialog(null, "Entrada de dado inválida! Repita o processo novamente", "Erro!", DEFAULT_OPTION,
                    ERROR_MESSAGE);
        }
        return null;
    }

}
