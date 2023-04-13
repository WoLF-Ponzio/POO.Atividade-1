package src.Atividade_01.metodosMenu;

import javax.xml.bind.annotation.XmlElement.DEFAULT;

import src.Atividade_01.Classes.Cliente;
import src.Atividade_01.Classes.Pessoa;

public class cadastrarCliente {

    try{

            Cliente cliente = new Cliente();
            cliente.setNome(showInputDialog(getRootFrame(), "Digite o nome do cliente", "Cadastro do cliente", DEFAULT_OPTION));
            cliente.setCpf(showInputDialog(getRootFrame(), "Digite o cpf do cliente", "Cadastro do cliente", DEFAULT_OPTION));
            cliente.setValorDaDivida(showInputDialog(getRootFrame(), "Digite o valor da divida", "Cadastro do cliente", DEFAULT_OPTION));
            System.out.println(cliente);

    }catch (Exception c){
        showConfirmDialog(null, "Entrada de dado inválida! Repita o processo novamente", "Erro!", DEFAULT_OPTION, ERROR_MESSAGE);
    }
}
