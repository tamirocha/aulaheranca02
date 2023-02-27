package org.example;

public class Professor extends Pessoa {

    private String especialidade;
    private double salario;

    public void receberAumento(double aumento) {
        this.salario += aumento;
        System.out.println("Parabéns " + this.nome + ", seu salário aumentou!");
        System.out.println("Seu salário agora é " + getSalario());
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo='" + sexo + '\'' +
                ", especialidade='" + especialidade + '\'' +
                ", salário='" + salario + '\'' +
                '}';
    }
}
