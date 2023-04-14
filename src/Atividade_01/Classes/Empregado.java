package src.Atividade_01.Classes;

import java.util.UUID;

public abstract class Empregado extends Pessoa {

    private String matricula;

    public Empregado() {
        super();

        do {

            this.matricula = UUID.randomUUID().toString();

        } while(this.matricula.equals(getId()));
    }

    public Empregado(String id, String nome, String cpf) {
        super(nome, cpf);

        do {

            this.matricula = UUID.randomUUID().toString();

        } while (!this.matricula.equals(id));

    }

    public String getMatricula() {
        return matricula;
    }

    @Override
    public boolean equals(Object obj) {
        if (getId().equalsIgnoreCase(getMatricula())) {
            return true;
        } else {
            return false;
        }
    }

    private boolean verificador(String id, String matricula) {
        if (id.equals(matricula)) {
            return true;
        } else {
            return false;
        }
    }
}
