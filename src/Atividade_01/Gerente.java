package src.Atividade_01;

public class Gerente extends Empregado implements calcularBonus {
    private double bonus;
    private double salario;

    public Gerente(String id, String nome, String cpf, double salario, double bonus) {
        super(id, nome, cpf);

        this.bonus = bonus;
        this.salario = salario;

    }

    @Override
    public double Bonus() {
    return this.salario * bonus;

    }

}
