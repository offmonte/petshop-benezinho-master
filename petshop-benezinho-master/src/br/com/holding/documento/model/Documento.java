package br.com.holding.documento.model;

import br.com.holding.pessoa.model.Pessoa;

import java.util.Collection;
import java.util.Collections;
import java.util.Vector;

public class Documento{

    private Long id;
    private String numero;
    private Pessoa pessoa;


    public Documento() {
    }

    public Documento(Long id, String numero, Pessoa pessoa) {
        this.id = id;
        this.numero = numero;
        this.pessoa = pessoa;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + numero + '\'' +
                ", pessoa=" + pessoa +
                '}';
    }
}
