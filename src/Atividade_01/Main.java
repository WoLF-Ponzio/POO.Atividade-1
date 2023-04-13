package src.Atividade_01;
import java.util.ArrayList;
import src.Atividade_01.Classes.Pessoa;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();

        menu.menu();
        ArrayList<Pessoa>ListaPessoa = menu.getListaPessoas();
        for (Pessoa pessoa : ListaPessoa) {
            System.out.println(pessoa);
        }
    }
}
