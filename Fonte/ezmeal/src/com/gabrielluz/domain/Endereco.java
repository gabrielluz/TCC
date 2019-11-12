package com.gabrielluz.domain;

public class Endereco {
    public Endereco(int id, String logradouro, String cep, String cidade, String estado, String complemento) {
        this.id = id;
        this.logradouro = logradouro;
        this.cep = cep;
        this.cidade = cidade;
        this.estado = estado;
        this.complemento = complemento;
    }

    private int id;
    private String logradouro;
    private String cep;
    private String cidade;
    private String estado;
    private String complemento;

    public int getId() {
        return id;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getCep() {
        return cep;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public String getComplemento() {
        return complemento;
    }
}
