package src.Atividade_01.metodosMenu;

import java.util.ArrayList;
import static javax.swing.JOptionPane.*;

import src.Atividade_01.Classes.Cliente;
import src.Atividade_01.Classes.Empregado;
import src.Atividade_01.Classes.Pessoa;

public class remover {

    public void removerP(ArrayList<Pessoa> dababy) {
        Pessoa pesquisarCpf = new Pessoa();
        pesquisarCpf.setCpf(showInputDialog("Digite o CPF que deseja pesquisar"));

        Pessoa pessoaEncontrada = null;
        for (Pessoa pessoa : dababy) {
            if (pessoa.getCpf().equals(pesquisarCpf.getCpf())) {
                pessoaEncontrada = pessoa;
                
                Pessoa pessoacpf = null;
                
                pessoacpf = new Pessoa("", pessoa.getCpf());

                dababy.remove(pessoacpf);

                break;
            }
        }
        if (pessoaEncontrada == null) {
            showConfirmDialog(null, "Pessoa não encontrada", "Pesquisa", DEFAULT_OPTION, ERROR_MESSAGE);
        } else {

        }
        
    }

}