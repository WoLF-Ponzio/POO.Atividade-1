package src.Atividade_01;
import java.util.UUID;

public class Pessoa{

    private String id;
    private String nome;
    private String cpf;
    
    public Pessoa(){
        id = UUID.randomUUID().toString();
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCpf(){
        return cpf;
    }

    public String getId(){
        return id;
    }

    public void setCpf(String cpf){
        // Remove os caractéres não numéricos do CPF
        cpf = cpf.replaceAll("\\D", "");

        // Formata o CPF com pontos e traço
        cpf = cpf.substring(0, 3) + "." +
              cpf.substring(3, 6) + "." +
              cpf.substring(6, 9) + "-" +
              cpf.substring(9, 11);
        
        this.cpf = cpf;      
    }

    @Override
    public String toString() {
        String aux = "";

        aux += "ID: " + getId() + "\n"; 
        aux += "Nome: " + getNome() + "\n";
        aux += "CPF: " + getCpf() + "\n";
        return aux;
    }

}