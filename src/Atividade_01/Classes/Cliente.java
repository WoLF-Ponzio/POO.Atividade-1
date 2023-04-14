package src.Atividade_01.Classes;

public class Cliente extends Pessoa {

    private double valorDaDivida;

    public Cliente(String id, String nome, String cpf, double valorDaDivida) {
        // super(nome, cpf);

        this.valorDaDivida = valorDaDivida;
    }

    public Cliente() {
        super();

    }

    public double getValorDaDivida() {
        return valorDaDivida;
    }

    public void setValorDaDivida(double valorDaDivida) {
        this.valorDaDivida = valorDaDivida;
    }
   
    @Override
    public String toString() {
        String aux = ""; 
        aux += "Nome do cliente: " + getNome() + "\n" ;
        aux += "CPF do cliente: " + getCpf() + "\n" ;
        aux += "Valor atual da dívida: R$ " + getValorDaDivida() + "\n" ;
        aux += "\n";
        return aux ;

    }
    
}
