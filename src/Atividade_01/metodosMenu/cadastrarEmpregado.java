package src.Atividade_01.metodosMenu;

import src.Atividade_01.Classes.*;
import static javax.swing.JOptionPane.*;
import java.util.ArrayList;
import static java.lang.Integer.parseInt;
import static java.lang.Double.parseDouble;

public class cadastrarEmpregado {

    public Pessoa CadastrarEmpregado(ArrayList<Pessoa> listaPessoas) {
        // Pega o arraylist para verificar se já existe algum funcionário com o mesmo
        // CPF já cadastrado
        int menu;
        boolean teste = true;

        try {
            menu = parseInt(showInputDialog(null, "1 - Gerente\n2 - Vendedor", "Digite qual o tipo de funcionário",DEFAULT_OPTION));
            if (menu == 1) {
                Gerente gerente = new Gerente();
                gerente.setNome(showInputDialog(getRootFrame(), "Digite o nome do Gerente", "Cadastro do Gerente",DEFAULT_OPTION));
                while (teste == true) {
                    gerente.setCpf(showInputDialog(getRootFrame(), "Digite o CPF do Gerente", "Cadastro do Gerente", DEFAULT_OPTION));
                    teste = false;
                    if(listaPessoas.isEmpty()){
                        teste = false;
                    }else{
                        for (Pessoa pessoa : listaPessoas) {
                            if (pessoa.getCpf().equals(gerente.getCpf())) {
                                showConfirmDialog(null, "CPF já cadastrado! Digite um CPF válido!", "Erro!", DEFAULT_OPTION, ERROR_MESSAGE);
                                teste = true;
                            } else {
                                
                            }
                        }
                    }
                }
                gerente.setBonus(parseDouble(showInputDialog(null, "Digite o Bonûs salarial", "Cadastro do Gerente", DEFAULT_OPTION)));
                gerente.setSalario(parseDouble(showInputDialog(null, "Digite o Salário", "Cadastro do Gerente", DEFAULT_OPTION)));
                System.out.println(gerente);
                return gerente;

            } else if (menu == 2) {
                // cadastro do vendedor
                return null;
            } else {
                showConfirmDialog(null, "Entrada de dado inválida! Repita o processo novamente", "Erro!", DEFAULT_OPTION, ERROR_MESSAGE);
                return null;
            }

        } catch (Exception e) {
            showConfirmDialog(null, "Entrada de dado inválida! Repita o processo novamente", "Erro!", DEFAULT_OPTION,
                    ERROR_MESSAGE);
        }
        return null;

    }

}
