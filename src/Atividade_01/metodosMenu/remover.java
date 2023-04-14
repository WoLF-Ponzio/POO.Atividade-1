package src.Atividade_01.metodosMenu;

import java.util.ArrayList;
import static javax.swing.JOptionPane.*;

import src.Atividade_01.Classes.Cliente;
import src.Atividade_01.Classes.Empregado;
import src.Atividade_01.Classes.Pessoa;
import javax.swing.JOptionPane;

public class remover {

    public void removerP(ArrayList<Pessoa> dababy) {

        Pessoa pesquisarCpf = new Pessoa();
        pesquisarCpf.setCpf(showInputDialog("Digite o CPF que deseja pesquisar"));

        Pessoa pessoaEncontrada = null;
        for (Pessoa pessoa : dababy) {
            if (pessoa.getCpf().equals(pesquisarCpf.getCpf())) {
                pessoaEncontrada = pessoa;
                break;
            }

        }

        if (pessoaEncontrada == null) {
            showConfirmDialog(null, "Pessoa não encontrada", "Pesquisa", DEFAULT_OPTION, ERROR_MESSAGE);
            return;
        } else {

            int escolha = JOptionPane.showOptionDialog(null, "Deseja deletar " + pessoaEncontrada.getNome() + " ?",
                    "Confirmação de Exclusão",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);

            if (escolha == JOptionPane.YES_OPTION) {
                dababy.remove(pessoaEncontrada);

                JOptionPane.showMessageDialog(null, "Pessoa excluida com sucesso");

                return;
            } else if (escolha == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "Cancelando exclusão...");

                return;
            } else if (escolha == JOptionPane.CLOSED_OPTION) {
                JOptionPane.showMessageDialog(null, "Caixa de diálogo fechada sem escolha...");

                return;
            }
        }
    }

}
