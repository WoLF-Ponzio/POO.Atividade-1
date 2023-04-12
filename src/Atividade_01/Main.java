package src.Atividade_01;
import static javax.swing.JOptionPane.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pessoa teste = new Pessoa();
        Scanner teclado = new Scanner(System.in);
        Menu menu = new Menu();

         menu.menu();

        System.out.print("nome: ");
        teste.setNome(teclado.nextLine());
        System.out.print("cpf: ");
        teste.setCpf(teclado.nextLine());
        System.out.println(teste);
    }
}
