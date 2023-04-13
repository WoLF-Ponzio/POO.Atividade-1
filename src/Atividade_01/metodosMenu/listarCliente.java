package src.Atividade_01.metodosMenu;

import java.util.ArrayList;

import static javax.swing.JOptionPane.*;

import src.Atividade_01.Classes.Pessoa;

public class listarCliente {

    public void listaCli(ArrayList<Pessoa> listaPessoas) {

        if (mensagem.equals("")) {
            showConfirmDialog(null, "Clientes não encontrados");

        } else {
            mensagem = "Cliente " + mensagem;
            System.out.println(mensagem);
        }

    }
}
