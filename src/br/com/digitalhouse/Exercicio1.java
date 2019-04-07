package br.com.digitalhouse;

public class Exercicio1 {
    public static void main(String[] args) {

        //Instanciando
        Cliente mateus = new Cliente("Mateus", "Amaral");
        Conta contaMateus = new Conta(357951, 0.00, mateus);

        Cliente carolina = new Cliente("Carolina", "Meira");
        Conta contaCarolina = new Conta(123456, 5000000.00, carolina);

        //Actions
        contaMateus.deposito(357.00);
        contaMateus.saque(300.00);
        contaCarolina.saque(10000.00);
    }
}
