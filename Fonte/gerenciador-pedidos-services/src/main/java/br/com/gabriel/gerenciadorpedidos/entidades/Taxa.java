package br.com.gabriel.gerenciadorpedidos.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by gabi_ on 14/08/2017.
 */
@Entity
public class Taxa {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private Float valor;

    @Column(length = 255)
    private String observacao;

    private TipoTaxa tipoTaxa;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Float aplicar(Float valorBase) {
        return valorBase + this.valor;
    }
}
