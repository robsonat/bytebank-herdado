package org.example;

//Um gerente é um Funcionario, logo, herda da class Funcionario. Ele também implementa a interface Autenticável.

public class Gerente extends Funcionario implements Autenticavel {


    private AutenticacaoUtil autenticador;

    public Gerente() {
        this.autenticador = new AutenticacaoUtil();
    }

    public double getBonificacao() {
        System.out.println("Chamando o método de bonificação do GERENTE!");
        return super.getSalario();
    }

    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);
    }
}