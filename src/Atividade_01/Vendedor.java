package src.Atividade_01;

public class Vendedor extends Empregado implements calcularSalario {
    private double totalDeVendas;
    private double comissao;

    public Vendedor(String matricula, String nome, String cpf, double totalDeVendas, double comissao) {
        super(matricula, nome, cpf);

        this.totalDeVendas = totalDeVendas;
        this.comissao = comissao;
    }

    @Override
    public double salario() {
        return this.totalDeVendas * this.comissao;
    }
}