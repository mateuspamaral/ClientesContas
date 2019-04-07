package br.com.digitalhouse;

public class Conta {
    //Attributes
    private Integer numeroConta;
    private Double saldo;
    private Cliente titular;

    //Construct methods
    public Conta(){

    }

    public Conta(Integer numeroConta, Double saldo, Cliente titular){
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.titular = titular;
    }

    //Getters & Setters
    public Integer getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(Integer numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void Double(Double saldo) {
        this.saldo = saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    //Class methods
    public void deposito(Double quantiaDinheiro) {
        saldo += quantiaDinheiro;
        System.out.println("Depostio em dinheiro realizado com sucesso.\nNovo Saldo: " + saldo);
    }

    public void saque(Double quantiaDinheiro) {
        if (saldo < quantiaDinheiro) {
            System.out.println("Saldo insuficiente");
        } else {
            saldo -= quantiaDinheiro;
            System.out.println("Saque realizado com sucesso.\nNovo saldo: " + saldo);
        }
    }
}
