package org.example;

public class TesteFuncionario {

    public static void main(String[] args) {

        Funcionario nelson = new Funcionario("Nelson Jorge", "111.333.555-77", 1000);

        System.out.println(nelson.getNome());
        System.out.println(nelson.getBonificacao());

        Gerente ronaldo = new Gerente("Ronaldinho", "111.222.333.44", 15000);
        ronaldo.setSenha(123123321);
        boolean autenticou = ronaldo.autentica(123123321);

        System.out.println(autenticou);

    }

}
