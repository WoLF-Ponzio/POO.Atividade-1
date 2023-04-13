package src.Atividade_01.metodosMenu;

import src.Atividade_01.Classes.Cliente;

public class cadastrarCliente {
    int menu;

    try{

            Cliente cliente = new Cliente();
            cliente.setNome(showInputDialog(getRootFrame(), ""));
            cliente.setCpf(showInputDialog(getRootFrame(), ""));
            cliente.setValorDaDivida(showInputDialog(getRootFrame(), ""));
            System.out.println(cliente);

    }catch (Exception c){
        showConfirmDialog(null, "Entrada de dado inválida! Repita o processo novamente", "Erro!", DEFAULT_OPTION, ERROR_MESSAGE);
    }
}
