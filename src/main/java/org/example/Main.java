package org.example;

public class Main {
    public static void main(String[] args) {
        Visitante v1 = new Visitante();
        Aluno a1 = new Aluno();
        Bolsista b1 = new Bolsista();
        Tecnico t1 = new Tecnico();
        Professor p1 = new Professor();

        v1.setNome("Juvenal");
        v1.setIdade(22);
        v1.setSexo("M");
        System.out.println(v1.toString());
        v1.fazerAniversario();

        a1.setNome("Cláudio");
        a1.setMatricula(1111);
        a1.setCurso("Informática");
        a1.setIdade(16);
        a1.setSexo("M");
        System.out.println(a1.toString());
        a1.pagarMensalidade();

        b1.setMatricula(1112);
        b1.setNome("Jubileu");
        b1.setIdade(23);
        b1.setBolsa(12.5);
        b1.setSexo("M");
        System.out.println(b1.toString());
        b1.pagarMensalidade();
        b1.renovarBolsa();

        p1.setNome("Tamiris");
        p1.setIdade(35);
        p1.setSexo("F");
        p1.setEspecialidade("Tecnologia");
        p1.setSalario(3500.25);
        System.out.println(p1.toString());
        p1.receberAumento(620.63);
        p1.fazerAniversario();

        t1.setNome("Arnaldo");
        t1.setIdade(33);
        t1.setSexo("M");
        t1.setMatricula(1113);
        t1.setCurso("Informática Aplicada para Técnicos");
        System.out.println(t1.toString());
        t1.setRegistroProfissional(259803);
        t1.praticar();
        t1.pagarMensalidade();
    }
}