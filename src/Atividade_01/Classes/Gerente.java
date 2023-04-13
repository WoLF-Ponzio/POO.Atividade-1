package src.Atividade_01.Classes;

import src.Atividade_01.interfaces.calcularBonus;

public class Gerente extends Empregado implements calcularBonus {
    private double bonus;
    private double salario;
    
    public Gerente(String id, String nome, String cpf, double salario, double bonus) {
        super(id, nome, cpf);
        this.bonus = bonus;
        this.salario = salario;

    }

    public Gerente() {
        super();
    }

    public double getBonus() {
        return bonus;
    }

    public double getSalario() {
        return salario;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public double Bonus() {
        return this.getBonus() * this.getSalario();

    }

    @Override
    public String toString() {
        String aux = "";
        aux += "Registro do funcionário: " + getMatricula() + "\n";
        aux += "Nome: " + getNome() + "\n";
        aux += "CPF: " + getCpf() + "\n";
        aux += "Salário: " + getSalario() + "\n";
        aux += "Bonûs: " + String.format("%.2f", Bonus()) + "\n";
        return aux;
    }
}
