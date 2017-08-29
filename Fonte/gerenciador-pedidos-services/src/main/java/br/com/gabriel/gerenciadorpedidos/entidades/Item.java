package br.com.gabriel.gerenciadorpedidos.entidades;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Created by gabi_ on 14/08/2017.
 */
@Entity
public class Item {
    @Id
    @GeneratedValue
    private Long id;

    @NotNull(message = "O preço do item deve ser informado.")
    private Double preco;

    @NotNull(message = "O nome do item deve ser informado.")
    @Length(max = 30, message = "O nome do item não pode ultrapassar 30 caracteres.")
    private String nome;

    @Length(max = 400, message = "A descrição do item não pode ultrapassar 400 caracteres.")
    private String descricao;

    @OneToMany
    @JoinColumn(name="item_id", referencedColumnName="id")
    private List<PedidoXItem> pedidosXItem;

    @ManyToOne
    private Categoria categoria;

    @ManyToMany
    private List<Taxa> taxas;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<PedidoXItem> getPedidosXItem() {
        return pedidosXItem;
    }

    public void setPedidosXItem(List<PedidoXItem> pedidosXItem) {
        this.pedidosXItem = pedidosXItem;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public List<Taxa> getTaxas() {
        return taxas;
    }

    public void setTaxas(List<Taxa> taxas) {
        this.taxas = taxas;
    }
}
