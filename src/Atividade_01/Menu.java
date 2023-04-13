package src.Atividade_01;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Menu {

    public void menu() {
        int menu = 0;

        do {
            try {

                menu = parseInt(showInputDialog(null,
                        "1 - Cadastrar Empregado\n2 - Cadastrar Cliente\n3 - Pesquisar\n4 - Listar Empregados\n5 - Listar Clientes\n6 - Remover\n7 - Finalizar",
                        "Menu Principal", INFORMATION_MESSAGE));

                switch (menu) {
                    case 1:

                        CadastrarEmpregado();

                        break;
                        
                    case 2:

                        CadastrarCliente();

                        break;

                    case 3:

                        Pesquisar();

                        break;

                    case 4:

                        ListarEmpregado();

                        break;
                        
                    case 5:

                        ListarCliente();

                        break;

                    case 6:

                        Remover();

                        break;
                }

            } catch (Exception e) {
                showConfirmDialog(null, "Entrada de dado inválida!", "Erro!", DEFAULT_OPTION, ERROR_MESSAGE);
            }
        } while (menu != 7);

    }
}