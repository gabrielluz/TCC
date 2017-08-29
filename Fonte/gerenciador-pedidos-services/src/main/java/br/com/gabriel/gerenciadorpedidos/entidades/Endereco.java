package br.com.gabriel.gerenciadorpedidos.entidades;

import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/**
 * Created by gabi_ on 14/08/2017.
 */
@Entity
public class Endereco {
    @Id
    @GeneratedValue
    private Long id;

    @NotNull(message = "É obrigatório informar a rua do endereço.")
    @Length(max = 100, message = "Não é permitido que o campo Rua possua maisque 100 caracteres.")
    private String rua;

    @Length(max = 400, message = "O complemento não pode ter mais que 400 caracteres.")
    private String complemento;

    @NotNull(message = "É obrigatório informar o número.")
    private Integer numero;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }
}
