package org.serratec.trabalho_individual.domain;

import org.hibernate.validator.constraints.Length;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

@Embeddable
public class Endereco {
    @Column
    @NotBlank(message = "Rua não pode ser vazio")
    private String rua;

    @Column
    @NotBlank(message = "Cidade não pode ser vazia")
    private String cidade;

    @Column
    @NotBlank(message = "Estado não pode ser vazio")
    @Length(min = 2, max = 2, message = "Estado deve ter 2 caracteres")
    private String estado;

    @Column
    @NotBlank(message = "CEP não pode ser vazio")
    @Pattern(regexp = "\\d{5}-\\d{3}", message = "CEP somente no formato 00000-000")
    private String cep;
    
    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}
