package br.com.gabriel.gerenciadorpedidos.entidades;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by gabi_ on 14/08/2017.
 */
@Entity
@Table(name = "pedido_item")
public class PedidoXItem {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne(optional = false)
    private Pedido pedido;

    @ManyToOne(optional = false)
    private Item item;

    @NotNull(message = "A quantidade de itens deve ser informada.")
    private int quantidadeItens;

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getQuantidadeItens() {
        return quantidadeItens;
    }

    public void setQuantidadeItens(int quantidade) {
        this.quantidadeItens = quantidade;
    }
}
