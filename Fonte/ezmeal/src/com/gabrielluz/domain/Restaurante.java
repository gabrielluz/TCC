package com.gabrielluz.domain;

import java.time.OffsetTime;
import java.util.Collection;

public class Restaurante {
    public Restaurante(int id, String nome, String cnpj, OffsetTime horarioAtendimento, boolean abreFinaisDeSemana, Arquivo foto, Collection<Produto> produtos) {
        this.id = id;
        this.nome = nome;
        this.cnpj = cnpj;
        this.horarioAtendimento = horarioAtendimento;
        this.abreFinaisDeSemana = abreFinaisDeSemana;
        this.foto = foto;
        this.produtos = produtos;
    }

    private int id;
    private String nome;
    private String cnpj;
    private OffsetTime horarioAtendimento;
    private boolean abreFinaisDeSemana;
    private Arquivo foto;
    private Collection<Produto> produtos;
    private Collection<Avaliacao> avaliacoes;

    public String getNome() {
        return nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public OffsetTime getHorarioAtendimento() {
        return horarioAtendimento;
    }

    public boolean isAbreFinaisDeSemana() {
        return abreFinaisDeSemana;
    }

    public Arquivo getFoto() {
        return foto;
    }

    public int getId() {
        return id;
    }

    public Collection<Produto> getProdutos() {
        return produtos;
    }
}
