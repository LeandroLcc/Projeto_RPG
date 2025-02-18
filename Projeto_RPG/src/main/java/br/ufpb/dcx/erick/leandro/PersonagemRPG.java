package br.ufpb.dcx.erick.leandro;

import java.util.Objects;
import java.util.Random;

public class PersonagemRPG {
    private String nome;
    private int pontosDeVida;
    private int nivel;
    private int forca;
    private int destreza;
    private int constituicao;
    private int inteligencia;
    private int sabedoria;
    private int carisma;

    public PersonagemRPG(String nome, int pontosDeVida, int nivel, int forca, int destreza, int constituicao,
                         int inteligencia, int sabedoria, int carisma){
        this.nome = nome;
        this.pontosDeVida = pontosDeVida;
        this.nivel = nivel;
        this.forca = forca;
        this.destreza = destreza;
        this.constituicao = constituicao;
        this.inteligencia = inteligencia;
        this.sabedoria = sabedoria;
        this.carisma = carisma;

    }

    public PersonagemRPG(){
        this("Nome Indefinido", 0, 0,0, 0, 0, 0, 0,0 );
    }

    public String toString(){
        return "O personagem " + this.nome + ";  Pontos de Vida: " + this.pontosDeVida + ";  Nível: " + this.nivel + ";  com os atributos: \n" +
                "Força[" + this.forca + "]\n" +
                "Destreza[" + this.destreza + "]\n" +
                "Constiruição[" + this.constituicao + "]\n" +
                "Inteligência[" + this.inteligencia + "]\n" +
                "Sabedoria[" + this.sabedoria + "]\n" +
                "Carisma[" + this.carisma + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonagemRPG that = (PersonagemRPG) o;
        return nivel == that.nivel && Objects.equals(nome, that.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, nivel);
    }

    public int rolarDado(int somarUmAtributo){
        Random geradorAleatorio = new Random();

        int valorDado = geradorAleatorio.nextInt(21);
        return valorDado + somarUmAtributo;
    }


    //GET's e SET's
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPontosDeVida(){
        return this.pontosDeVida;
    }

    public void setPontosDeVida(int pontosDeVida){
        this.pontosDeVida = pontosDeVida;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getDestreza() {
        return destreza;
    }

    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }

    public int getConstituicao() {
        return constituicao;
    }

    public void setConstituicao(int constituicao) {
        this.constituicao = constituicao;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public int getSabedoria() {
        return sabedoria;
    }

    public void setSabedoria(int sabedoria) {
        this.sabedoria = sabedoria;
    }

    public int getCarisma() {
        return carisma;
    }

    public void setCarisma(int carisma) {
        this.carisma = carisma;
    }
}
