package org.example;

public class TesteContas {


    public static void main(String[] args) {


        ContaCorrente cc = new ContaCorrente(123,111);
        cc.deposita(100);

        ContaPoupanca cp = new ContaPoupanca(123123, 123312);
        cp.deposita(250);

        cc.transfere(50,cp);



        System.out.println(cc.getSaldo());
        System.out.println(cp.getSaldo());

    }
}
