package br.com.digitalhouse;

public abstract class Contas extends Clientes {

    public Double saldo = 0.00;


    public void depositarDinheiro(Double valorDeposito){
        saldo = saldo + valorDeposito;
    }

    public void sacarDinheiro(Double valorSaque){
        //getSaldo();
        if(saldo >= valorSaque){
            saldo = saldo - valorSaque;
            setSaldo(saldo);
        } else{
            System.out.println("Saldo Insuficiente");
        }
    }

    public Double getSaldo(){
        return saldo;
    }

    public void setSaldo(Double novoSaldo){
        saldo = novoSaldo;
    }
}
