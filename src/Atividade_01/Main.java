package src.Atividade_01;
import static javax.swing.JOptionPane.*;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();

        
         p1.setNome(showInputDialog(getRootFrame(), "Digite o nome do individuo"));
         p1.setCpf(showInputDialog(getRootFrame(), "Digite o cpf do individuo"));

         showConfirmDialog(getRootFrame(), p1);
    }
}
