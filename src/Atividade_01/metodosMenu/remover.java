package src.Atividade_01.metodosMenu;
import java.util.ArrayList;
import static javax.swing.JOptionPane.*;
import javax.swing.JOptionPane;
import src.Atividade_01.Menu;
import src.Atividade_01.Classes.Pessoa;

public class remover extends Menu{

    public void removerP(ArrayList<Pessoa> dababy) {
        Pessoa pesquisarCpf = new Pessoa();
        pesquisarCpf.setCpf(showInputDialog("Digite o CPF que deseja pesquisar"));

        int aux = -1;
        Pessoa pessoaEncontrada = null;
            for (int i = 0; i < dababy.size(); i++) {
            Pessoa pessoa = dababy.get(i);
                if (pessoa.getCpf().equals(pesquisarCpf.getCpf())) {
                    pessoaEncontrada = pessoa;
                    aux = i;
                    break;
                }
            }

            int escolha = JOptionPane.showOptionDialog(null, "Deseja deletar " + pessoaEncontrada.getNome() + "?", "Confirmação de Exclusão",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
               
                if (escolha == JOptionPane.YES_OPTION) {
                    dababy.remove(aux);
                    JOptionPane.showMessageDialog(null, "Pessoa Excluida com sucesso!", "Confirmação de Exclusão", INFORMATION_MESSAGE);
                    return;
                } else if (escolha == JOptionPane.NO_OPTION) {
                    JOptionPane.showMessageDialog(null, "Cancelando a Exclusão", "Confirmação de Exclusão", INFORMATION_MESSAGE);
                    return;
                } else if (escolha == JOptionPane.CLOSED_OPTION) {
                    JOptionPane.showMessageDialog(null, "Operação encerrada sem escolha! Retornando ao menu", "Confirmação de Exclusão", INFORMATION_MESSAGE);
                    return;
                }

    }

}
