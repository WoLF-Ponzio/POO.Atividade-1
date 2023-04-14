package src.Atividade_01.metodosMenu;

import java.util.ArrayList;
import static javax.swing.JOptionPane.*;

import src.Atividade_01.Classes.Cliente;
import src.Atividade_01.Classes.Empregado;
import src.Atividade_01.Classes.Pessoa;

public class pesquisar {
    
    public void pesquisarPorCpf(ArrayList<Pessoa> dababy){
        Pessoa pesquisarCpf = new Pessoa();
        pesquisarCpf.setCpf(showInputDialog("Digite o CPF que deseja pesquisar"));

        Pessoa pessoaEncontrada = null;
            for (Pessoa pessoa : dababy) {
                if (pessoa.getCpf().equals(pesquisarCpf.getCpf())) {
                    pessoaEncontrada = pessoa;
                    break;
                }
            }

            if(pessoaEncontrada == null){
                showConfirmDialog(null, "Pessoa não encontrada", "Pesquisa", DEFAULT_OPTION, ERROR_MESSAGE);
            }else if(pessoaEncontrada instanceof Empregado){
                showConfirmDialog(null, "Empregado encontrado!\n" + pessoaEncontrada, "Pesquisa", DEFAULT_OPTION, INFORMATION_MESSAGE);
            } else if(pessoaEncontrada instanceof Cliente){
                showConfirmDialog(null, "Cliente encontrado!\n" + pessoaEncontrada, "Pesquisa", DEFAULT_OPTION, INFORMATION_MESSAGE);
            }
            
            
    }

   

}

