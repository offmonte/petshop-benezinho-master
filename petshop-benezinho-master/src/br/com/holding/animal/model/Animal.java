package br.com.holding.animal.model;

import br.com.holding.servico.model.Servico;
import br.com.holding.pessoa.model.Pessoa;

import java.util.Collection;
import java.util.Collections;
import java.util.Vector;

public class Animal {

    private Long id;
    private String nome;
    private String raca;



    private Collection<Pessoa> responsaveis = new Vector<>();

    public Animal addResponsavel(Pessoa responsavel){
        this.responsaveis.add(responsavel);
        return this;
    }

    public Animal removeResponsavel(Pessoa responsavel){
        this.responsaveis.remove(responsavel);
        return this;
    }


    public Collection<Pessoa> getResponsaveis(){
        return Collections.unmodifiableCollection(this.responsaveis);
    }

    public Animal() {
    }

    public Animal(Long id, String nome, String raca, Collection<Pessoa> responsaveis) {
        this.id = id;
        this.nome = nome;
        this.raca = raca;
        this.responsaveis = responsaveis;
    }

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

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public String toString() {
        return "Sistema{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", sigla='" + raca + '\'' +
                ", responsaveis=" + responsaveis +
                '}';
    }
}
