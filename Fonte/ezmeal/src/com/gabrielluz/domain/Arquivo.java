package com.gabrielluz.domain;

import java.time.LocalDateTime;

public class Arquivo {
    public Arquivo(int id, String caminho, TipoArmazenamento tipoArmazenamento, LocalDateTime dataInsercao, TipoArquivo tipoArquivo) {
        this.id = id;
        this.caminho = caminho;
        this.tipoArmazenamento = tipoArmazenamento;
        this.dataInsercao = dataInsercao;
        this.tipoArquivo = tipoArquivo;
    }

    private int id;
    private String caminho;
    private TipoArmazenamento tipoArmazenamento;
    private LocalDateTime dataInsercao;
    private TipoArquivo tipoArquivo;

    public int getId() {
        return id;
    }

    public String getCaminho() {
        return caminho;
    }

    public TipoArmazenamento getTipoArmazenamento() {
        return tipoArmazenamento;
    }

    public LocalDateTime getDataInsercao() {
        return dataInsercao;
    }

    public TipoArquivo getTipoArquivo() {
        return tipoArquivo;
    }
}
