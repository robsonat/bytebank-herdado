package org.example;

public class TesteSaca {

    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente(123,123123);
        cc.deposita(200);
        cc.saca(300);

        System.out.println(cc.getSaldo());

    }
}
