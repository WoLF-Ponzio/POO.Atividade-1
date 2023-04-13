package src.Atividade_01.metodosMenu;

import java.util.ArrayList;

import org.omg.Messaging.SyncScopeHelper;

public class listarCliente {
    
    public void listagem(){
        String mensagem = "";













        

        if(mensagem.equals("")){
            showConfirmDialog(null, "Clientes não encontrados");

        }else {
            mensagem = "Cliente " + mensagem;
            System.out.println(mensagem);
        }

    }
}
