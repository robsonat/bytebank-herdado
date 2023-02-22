package org.example;

public class TesteFuncionario {

    public static void main(String[] args) {

        Funcionario nelson = new Gerente();

        System.out.println(nelson.getNome());
        System.out.println(nelson.getBonificacao());

        Gerente ronaldo = new Gerente();
        ronaldo.setSenha(123123321);
        boolean autenticou = ronaldo.autentica(123123321);

        System.out.println(autenticou);

    }

}
