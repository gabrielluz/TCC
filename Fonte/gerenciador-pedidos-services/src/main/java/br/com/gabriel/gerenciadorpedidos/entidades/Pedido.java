package br.com.gabriel.gerenciadorpedidos.entidades;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

/**
 * Created by gabi_ on 14/08/2017.
 */
@Entity
public class Pedido {
    @Id
    @GeneratedValue
    private Long id;

    @Length(max = 400, message = "A observação do pedido não pode ultrapassar 400 caracteres.")
    private String observacao;

    @OneToMany
    @JoinColumn(name="pedido_id", referencedColumnName="id")
    private List<PedidoXItem> pedidosXItem;

    @ManyToMany
    private List<Taxa> taxas;

    private Date data;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public List<PedidoXItem> getPedidosXItem() {
        return pedidosXItem;
    }

    public void setPedidosXItem(List<PedidoXItem> pedidosXItem) {
        this.pedidosXItem = pedidosXItem;
    }

    public List<Taxa> getTaxas() {
        return taxas;
    }

    public void setTaxas(List<Taxa> taxas) {
        this.taxas = taxas;
    }
}
