package br.com.revisaoexercicio3;

public class Estoque {

    private String nome;
    private int qtdAtual;
    private int qtdMinima;

    public Estoque(){

    }

    public Estoque(String nome, int qtdAtual, int qtdMinima) {
        this.nome = nome;
        this.qtdAtual = qtdAtual;
        this.qtdMinima = qtdMinima;
    }

    public String setNome (String nome) {
        this.nome = nome;
    }

    public void vaiMudarNome (String nome){

    }

    public void mudarQtdMinima (int qtdMinima){

    }

    public void repor (int qtd){

    }

}



