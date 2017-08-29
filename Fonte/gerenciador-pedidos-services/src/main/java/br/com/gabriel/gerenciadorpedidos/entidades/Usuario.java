package br.com.gabriel.gerenciadorpedidos.entidades;

import org.hibernate.annotations.Fetch;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Created by gabi_ on 14/08/2017.
 */
@Entity
public class Usuario {
    @Id
    @GeneratedValue
    private Long id;

    @NotNull(message = "O login deve ser informado.")
    @Length(min = 6, max = 40, message = "O login deve possuir entre 6 e 40 caracteres.")
    private String login;

    @NotNull(message = "A senha deve ser informada.")
    @Length(min = 6, max = 40, message = "A senha deve possuir entre 6 e 40 caracteres.")
    private String senha;

    @NotNull(message = "O e-mail deve ser informado.")
    private String email;

    @ManyToMany
    private List<Endereco> enderecos;

    @ManyToMany
    private List<Pedido> pedidos;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
}
