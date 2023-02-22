package org.example;

public class TesteSaca {

    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente(123,123123);
        cc.deposita(200);
        try {
            cc.saca(300);
        } catch (SaldoInsuficienteException ex) {
            System.out.println("Ex: " + ex.getMessage());
        }

        System.out.println(cc.getSaldo());

    }
}
