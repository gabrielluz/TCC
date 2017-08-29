package br.com.gabriel.gerenciadorpedidos.entidades;

import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

/**
 * Created by gabi_ on 14/08/2017.
 */
@Entity
public class Categoria {
    @Id
    @GeneratedValue
    private Long id;

    @NotNull(message = "O nome da categoria deve ser informado.")
    @Length(max = 60, message = "O nome da categoria não pode ter mais que 60 caracteres.")
    private String nome;

    @ManyToOne
    private Restaurante restaurante;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Restaurante getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(Restaurante restaurante) {
        this.restaurante = restaurante;
    }
}
