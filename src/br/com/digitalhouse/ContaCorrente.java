package br.com.digitalhouse;

public class ContaCorrente extends Contas {

    private Double saldo;

    public void depositarCheque (Double valorCheque) {
        saldo = saldo - valorCheque;
    }

    @Override
    public Double getSaldo() {
        return saldo;
    }

    @Override
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
