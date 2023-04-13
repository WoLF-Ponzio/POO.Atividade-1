package src.Atividade_01.metodosMenu;
import src.Atividade_01.Classes.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;
import static java.lang.Double.parseDouble;

public class cadastrarEmpregado {

    public void CadastrarEmpregado() {
        int menu;

        try {

            menu = parseInt(showInputDialog(null, "1 - Gerente\n2 - Vendedor", "Digite qual o tipo de funcionário",
                    DEFAULT_OPTION));
            if (menu == 1) {
                Gerente gerente = new Gerente();
                gerente.setNome(showInputDialog(getRootFrame(), "Digite o nome do Gerente", "Cadastro do Gerente", DEFAULT_OPTION));
                gerente.setCpf(showInputDialog(getRootFrame(), "Digite o CPF do Gerente", "Cadastro do Gerente", DEFAULT_OPTION));
                gerente.setBonus(parseDouble(showInputDialog(getRootFrame(), "Digite o Bonûs salarial", "Cadastro do Gerente", DEFAULT_OPTION)));
                gerente.setSalario(parseDouble(showInputDialog(getRootFrame(), "Digite o Salário", "Cadastro do Gerente", DEFAULT_OPTION)));
                System.out.println(gerente);
            
            } else if (menu == 2) {

            } else {
                showConfirmDialog(null, "Entrada de dado inválida! Repita o processo novamente", "Erro!",
                        DEFAULT_OPTION, ERROR_MESSAGE);
                return;
            }

        } catch (Exception e) {
            showConfirmDialog(null, "Entrada de dado inválida! Repita o processo novamente", "Erro!", DEFAULT_OPTION,
                    ERROR_MESSAGE);
        }

    }

}
