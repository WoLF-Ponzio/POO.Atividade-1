package src.Atividade_01;

import java.util.UUID;

public class Empregado extends Pessoa{

    private String matricula;
    
    public Empregado(String id, String nome, String cpf){
        //super(nome, cpf);

        do{

            this.matricula = UUID.randomUUID().toString();

        }while(!this.matricula.equals(id));
        

    }

}
