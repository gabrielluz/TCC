package com.gabrielluz.domain;

public class Avaliacao {
    public Avaliacao(int id, int nota, String comentario, Usuario autor) {
        this.id = id;
        this.nota = nota;
        this.comentario = comentario;
        this.autor = autor;
    }

    private int id;
    private int nota;
    private String comentario;
    private Usuario autor;

    public int getId() {
        return id;
    }

    public int getNota() {
        return nota;
    }

    public String getComentario() {
        return comentario;
    }

    public Usuario getAutor() {
        return autor;
    }
}
