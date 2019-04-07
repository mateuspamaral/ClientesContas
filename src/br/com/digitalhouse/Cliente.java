package br.com.digitalhouse;

public class Cliente {
    //Attributes
    private String nome;
    private String sobrenome;

    //Construct methods
    public Cliente(){

    }

    public Cliente(String nome, String sobrenome){
        nome = nome;
        sobrenome = sobrenome;
    }

    //Getters & Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
}
