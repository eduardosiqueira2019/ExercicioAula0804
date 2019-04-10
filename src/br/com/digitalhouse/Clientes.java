package br.com.digitalhouse;

public class Clientes {

    private Integer numeroCliente;
    private String sobrenome;
    private String rg;
    private String cpf;

    public Integer getNumeroCliente(){
        return numeroCliente;
    }
    public void setNumeroCliente(Integer novoMumeroCliente){
        numeroCliente = novoMumeroCliente;
    }

    public String getSobrenome(){
        return sobrenome;
    }
    public void setSobrenome(String novoSobrenome){
        sobrenome = novoSobrenome;
    }

    public String getRg(){
        return rg;
    }
    public void setRg(String novoRg){
        rg=novoRg;
    }

    public String getCpf(){
        return cpf;
    }
    public void setCpf(String novoCpf){
        cpf = novoCpf;
    }
}
