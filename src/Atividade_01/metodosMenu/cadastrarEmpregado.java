package src.Atividade_01.metodosMenu;

import src.Atividade_01.Classes.*;
import static javax.swing.JOptionPane.*;
import java.util.ArrayList;
import static java.lang.Integer.parseInt;
import static java.lang.Double.parseDouble;

public class cadastrarEmpregado {

    public Pessoa CadastrarEmpregado(ArrayList<Pessoa> listaPessoas) {
        int menu;
        boolean teste = true;

        try {
            menu = parseInt(showInputDialog(null, "1 - Gerente\n2 - Vendedor", "Digite qual o tipo de funcionário",DEFAULT_OPTION));
            if (menu == 1) {
                
                //cadastro Gerente
                Gerente gerente = new Gerente();
                gerente.setNome(showInputDialog(getRootFrame(), "Digite o nome do Gerente", "Cadastro do Gerente",DEFAULT_OPTION));
                while (teste == true) {
                    gerente.setCpf(showInputDialog(getRootFrame(), "Digite o CPF do Gerente (11 dígitos)", "Cadastro do Gerente", DEFAULT_OPTION));
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
                gerente.setBonus(parseDouble(showInputDialog(null, "Digite o Bonûs salarial (calor inteiro)", "Cadastro do Gerente", DEFAULT_OPTION)));
                gerente.setSalario(parseDouble(showInputDialog(null, "Digite o Salário", "Cadastro do Gerente", DEFAULT_OPTION)));
                return gerente;

            } else if (menu == 2) {

                // cadastro do vendedor
                Vendedor vendedor = new Vendedor();
                vendedor.setNome(showInputDialog(getRootFrame(), "Digite o nome do vendedor", "Cadastro do Vendedor",DEFAULT_OPTION));
                while (teste == true) {
                    vendedor.setCpf(showInputDialog(getRootFrame(), "Digite o CPF do Vendedor (11 dígitos)", "Cadastro do Vendedor", DEFAULT_OPTION));
                    teste = false;
                    if(listaPessoas.isEmpty()){
                        teste = false;
                    }else{
                        for (Pessoa pessoa : listaPessoas) {
                            if (pessoa.getCpf().equals(vendedor.getCpf())) {
                                showConfirmDialog(null, "CPF já cadastrado! Digite um CPF válido!", "Erro!", DEFAULT_OPTION, ERROR_MESSAGE);
                                teste = true;
                            } else {
                                
                            }
                        }
                    }
                }
                vendedor.setTotalDeVendas(parseDouble(showInputDialog(null, "Digite o Total de Vendas desse funcionário", "Cadastro do Vendedor", DEFAULT_OPTION)));
                vendedor.setComissao(parseDouble(showInputDialog(null, "Digite a Comissão por venda (valor inteiro)", "Cadastro do Vendedor", DEFAULT_OPTION)));
                return vendedor;
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
