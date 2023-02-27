package org.example;

public class Tecnico extends Aluno {
    private int registroProfissional;

    public void praticar() {
        System.out.println("O técnico " + this.nome + " já iniciou as aulas práticas");
    }

    public int getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
        System.out.println("O técnico " + this.nome + " tem o registro profissional número: " + this.registroProfissional);
    }
}
