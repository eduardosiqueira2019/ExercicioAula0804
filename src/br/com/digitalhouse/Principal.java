package br.com.digitalhouse;

public class Principal {

    public static void main(String[] args) {

        Clientes cliente = new Clientes();
        ContaPoupanca poupanca = new ContaPoupanca();
        ContaCorrente contacorrente = new ContaCorrente();


        cliente.setNumeroCliente(1);
        cliente.setCpf("12334330986");
        cliente.setRg("2133443543");
        poupanca.setNumeroCliente(1);
        poupanca.setJuros(10.1);

        poupanca.setSaldo(10000.10);
        contacorrente.setSaldo(15000.10);



        poupanca.depositarDinheiro(100.50);
        //contacorrente.depositarDinheiro(450.40);




    }
}
