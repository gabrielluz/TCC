package br.com.gabriel.gerenciadorpedidos.entidades;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Created by gabi_ on 14/08/2017.
 */
@Entity
public class Restaurante {
    @Id
    @GeneratedValue
    private Long id;

    @NotNull(message = "O CNPJ deve ser informado.")
    private String cnpj;

    @NotNull(message = "A razão social deve ser informada.")
    private String razaoSocial;

    @Length(max = 16, message = "O campo telefone não pode ter mais que 16 caracteres.")
    private String telefone;

    @ManyToMany
    private List<Endereco> endereco;

    @OneToMany(fetch = FetchType.EAGER, orphanRemoval = true, cascade = CascadeType.ALL)
    private List<Categoria> categorias;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public List<Endereco> getEndereco() {
        return endereco;
    }

    public void setEndereco(List<Endereco> endereco) {
        this.endereco = endereco;
    }

    public List<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(List<Categoria> categorias) {
        this.categorias = categorias;
    }
}
