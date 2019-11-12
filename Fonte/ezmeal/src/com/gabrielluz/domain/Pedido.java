package com.gabrielluz.domain;

import java.time.LocalDateTime;
import java.util.Collection;

public class Pedido {
    public Pedido(int id, Collection<Produto> produtos, String observacao, StatusPedido status, LocalDateTime dataHora, LocalDateTime ultimaAtualizacaoDeStatus, Usuario destinatario, Avaliacao avaliacao) {
        this.id = id;
        this.produtos = produtos;
        this.observacao = observacao;
        this.status = status;
        this.dataHora = dataHora;
        this.ultimaAtualizacaoDeStatus = ultimaAtualizacaoDeStatus;
        this.destinatario = destinatario;
        this.avaliacao = avaliacao;
    }

    private int id;
    private Collection<Produto> produtos;
    private String observacao;
    private StatusPedido status;
    private LocalDateTime dataHora;
    private LocalDateTime ultimaAtualizacaoDeStatus;
    private Usuario destinatario;
    private Avaliacao avaliacao;

    public int getId() {
        return id;
    }

    public Collection<Produto> getProdutos() {
        return produtos;
    }

    public String getObservacao() {
        return observacao;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public LocalDateTime getUltimaAtualizacaoDeStatus() {
        return ultimaAtualizacaoDeStatus;
    }

    public Usuario getDestinatario() {
        return destinatario;
    }

    public Avaliacao getAvaliacao() {
        return avaliacao;
    }
}
