package br.com.digitalhouse;

public class ContaPoupanca extends Contas {

    private Double juros;

    public void recolherJuros(){
        juros = juros - 1;
    }

    public Double getJuros(){
        return juros;
    }

    public void setJuros(Double novoJuros){
        juros = novoJuros;
    }

}
