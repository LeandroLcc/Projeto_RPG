package br.ufpb.dcx.erick.leandro;

import java.util.Objects;

public class Habilidade extends PersonagemRPG{

 private String nome;
 private String descricao;
 private int valor;

 public Habilidade(String nome, String descricao, int valor){
     this.nome = nome;
     this.descricao = descricao;
     this.valor = valor;

 }
    @Override
    public String toString(){
     return  "Nome: " + this.nome +
             "Descrição: " + this.descricao +
             "Resultado: " + this.valor;
    }
    //HashCode e Equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Habilidade that = (Habilidade) o;
        return Objects.equals(nome, that.nome) && Objects.equals(descricao, that.descricao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nome, descricao);
    }

    //Get's e Set's
    @Override
    public String getNomeDoPersonagem() {
        return nome;
    }

    @Override
    public void setNomeDoPersonagem(String nomeDoPersonagem) {
        this.nome = nomeDoPersonagem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}
