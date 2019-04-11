package br.com.digitalhouse;

public class ContaCorrente extends Contas {



    public void depositarCheque(Double valorCheque) {
        saldo = saldo - valorCheque;
    }


}

