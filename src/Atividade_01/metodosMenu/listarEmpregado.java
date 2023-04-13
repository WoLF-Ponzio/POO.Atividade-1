package src.Atividade_01.metodosMenu;

import java.util.ArrayList;

import static javax.swing.JOptionPane.*;

import src.Atividade_01.Classes.Empregado;
import src.Atividade_01.Classes.Pessoa;

public class listarEmpregado {

    public void listaEmp(ArrayList<Pessoa> listaPessoas) {
        StringBuffer empregado = new StringBuffer();
        for (Pessoa pessoa : listaPessoas) {
            if (pessoa instanceof Empregado) {
                empregado.append(pessoa.toString());
            } else {

            }
        }
        if (empregado.length() > 0) {
            showConfirmDialog(null, "Listando Empregados\n" + empregado.toString(), "Lista de Empregados", DEFAULT_OPTION,
                    INFORMATION_MESSAGE);
        } else {
            showConfirmDialog(null, "Não há empregados cadastrados até o momento", "Erro!", DEFAULT_OPTION,
                    ERROR_MESSAGE);
        }

    }
}