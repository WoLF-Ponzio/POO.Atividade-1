package src.Atividade_01.Classes;

public class Cliente extends Pessoa{
    
    private double valorDaDivida;

    public Cliente(String id, String nome, String cpf, double valorDaDivida){
        //super(nome, cpf);

        this.valorDaDivida = valorDaDivida;
    }

    public double getValorDaDivida(){
        return valorDaDivida;
    }

    public void setValorDaDivida(double valorDaDivida){
        this.valorDaDivida = valorDaDivida;
    }

}
