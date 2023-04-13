package src.Atividade_01;

import src.Atividade_01.metodosMenu.*;
import static javax.swing.JOptionPane.*;
import java.util.ArrayList;
import src.Atividade_01.Classes.Pessoa;
import static java.lang.Integer.*;

public class Menu {

    private ArrayList<Pessoa> listaPessoas = new ArrayList<>();

    public void menu() {
        cadastrarEmpregado cadastroEmp = new cadastrarEmpregado();
        cadastrarCliente cadastroCli = new cadastrarCliente();
        listarCliente listaCli = new listarCliente();

        int menu = 0;

        do {
            try {

                menu = parseInt(showInputDialog(null,
                        "1 - Cadastrar Empregado\n2 - Cadastrar Cliente\n3 - Pesquisar\n4 - Listar Empregados\n5 - Listar Clientes\n6 - Remover\n7 - Finalizar",
                        "Menu Principal", INFORMATION_MESSAGE));

                switch (menu) {
                    case 1:
                        Pessoa PEmp = new Pessoa();
                        PEmp = cadastroEmp.CadastrarEmpregado(getListaPessoas());
                        if (PEmp == null) {

                        } else {
                            listaPessoas.add(PEmp);
                            showConfirmDialog(null, "Empregado cadastrado com sucesso!", "CADASTRO", DEFAULT_OPTION,
                                    INFORMATION_MESSAGE);
                        }

                        break;

                    case 2:

                        Pessoa PCli = new Pessoa();

                        PCli = cadastroCli.cadastro(listaPessoas);

                        if (PCli == null) {

                        } else {
                            listaPessoas.add(PCli);
                            showConfirmDialog(null, "Empregado cadastrado com sucesso!", "CADASTRO", DEFAULT_OPTION,
                                    INFORMATION_MESSAGE);
                        }

                        break;

                    case 3:

                        // Pesquisar();

                        break;

                    case 4:

                        // ListarEmpregado();

                        break;

                    case 5:

                    listaCli.listaCli(listaPessoas);

                        break;

                    case 6:

                        // Remover();

                        break;
                }

            } catch (Exception e) {
                showConfirmDialog(null, "Entrada de dado inválida!", "Erro!", DEFAULT_OPTION, ERROR_MESSAGE);
            }
        } while (menu != 7);

    }

    public ArrayList<Pessoa> getListaPessoas() {
        return listaPessoas;
    }
}