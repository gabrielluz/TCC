package com.gabrielluz.domain;

public class Produto {
    public Produto(int id, String descricao, Arquivo foto, double preco, String observacao) {
        this.id = id;
        this.descricao = descricao;
        this.foto = foto;
        this.preco = preco;
        this.observacao = observacao;
    }

    private int id;
    private String descricao;
    private Arquivo foto;
    private double preco;
    private String observacao;

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public Arquivo getFoto() {
        return foto;
    }

    public double getPreco() {
        return preco;
    }

    public String getObservacao() {
        return observacao;
    }
}
