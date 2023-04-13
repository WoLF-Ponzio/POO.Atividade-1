package src.Atividade_01.metodosMenu;

import java.util.ArrayList;

import static javax.swing.JOptionPane.*;

import src.Atividade_01.Classes.Cliente;
import src.Atividade_01.Classes.Pessoa;

public class listarCliente {

    public void listaCli(ArrayList<Pessoa> listaPessoas) {
        StringBuffer clientes = new StringBuffer();
        for (Pessoa pessoa : listaPessoas) {
            if (pessoa instanceof Cliente) {
                clientes.append(pessoa.toString());
            } else {

            }
        }
        if (clientes.length() > 0) {
            showConfirmDialog(null, "Listando Clientes\n" + clientes.toString(), "Lista de Clientes", DEFAULT_OPTION,
                    INFORMATION_MESSAGE);
        } else {
            showConfirmDialog(null, "Não há clientes cadastrados até o momento", "Erro!", DEFAULT_OPTION,
                    ERROR_MESSAGE);
        }

    }
}
