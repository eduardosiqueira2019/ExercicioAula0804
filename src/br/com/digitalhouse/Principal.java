package br.com.digitalhouse;

public class Principal {

    public static void main(String[] args) {

        Clientes cliente = new Clientes();
        ContaPoupanca poupanca = new ContaPoupanca();
        ContaCorrente contacorrente = new ContaCorrente();


        cliente.setNumeroCliente(1);
        cliente.setCpf("12334330986");
        cliente.setRg("2133443543");
        cliente.setSobrenome("Silva");

        poupanca.setJuros(0.1);
        poupanca.setSaldo(10000.00);
        contacorrente.setSaldo(15000.00);

        poupanca.depositarDinheiro(100.00);
        System.out.println(poupanca.getSaldo());

        contacorrente.depositarDinheiro(100.00);
        System.out.println(contacorrente.getSaldo());




    }
}
