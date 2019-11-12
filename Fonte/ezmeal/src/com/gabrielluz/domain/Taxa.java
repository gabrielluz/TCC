package com.gabrielluz.domain;

import java.time.LocalDateTime;

public class Taxa {

    public Taxa(int id, double valor, TipoTaxa tipoTaxa, String descricao, boolean ativa) {
        this.id = id;
        this.valor = valor;
        this.tipoTaxa = tipoTaxa;
        this.descricao = descricao;
        this.ativa = ativa;
        this.dataCriacao = LocalDateTime.now();
    }

    private int id;
    private double valor;
    private TipoTaxa tipoTaxa;
    private String descricao;
    private boolean ativa;
    private LocalDateTime dataCriacao;

    public int getId() {
        return id;
    }

    public double getValor() {
        return valor;
    }

    public TipoTaxa getTipoTaxa() {
        return tipoTaxa;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public LocalDateTime getDataInsercao() {
        return dataCriacao;
    }
}
