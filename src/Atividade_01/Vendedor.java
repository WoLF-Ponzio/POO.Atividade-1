package src.Atividade_01;

public class Vendedor extends Empregado {
    
    private double totalDeVendas;
    private double comissao;

    public Vendedor(String id, String nome, String cpf, double totalDeVendas, double comissao){
        //super(nome, cpf);

        this.totalDeVendas = totalDeVendas;
        this.comissao = comissao;
    }
}


