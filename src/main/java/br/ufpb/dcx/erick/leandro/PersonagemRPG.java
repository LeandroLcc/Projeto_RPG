package br.ufpb.dcx.erick.leandro;

import java.io.Serializable;
import java.util.*;

public class PersonagemRPG implements Serializable {
    private String nome;
    private String nomeDoJogador;
    private String descricao;
    private int pontosDeVida;
    private int nivel;
    private int forca;
    private int destreza;
    private int constituicao;
    private int inteligencia;
    private int sabedoria;
    private int carisma;
    private boolean nomeAtrAlterado;
    private List<String> dadosJogados = new ArrayList<>();
    private List<String> nomesDosAtr = new ArrayList<>();

    public PersonagemRPG(String nome, String nomeDoJogador,String descricao){
        this.nome = nome;
        this.nomeDoJogador = nomeDoJogador;
        this.descricao = descricao;
        this.pontosDeVida = 0;
        this.nivel = 0;
        this.forca = 0;
        this.destreza = 0;
        this.constituicao = 0;
        this.inteligencia = 0;
        this.sabedoria = 0;
        this.carisma = 0;
        this.nomeAtrAlterado = false;
        this.nomesDosAtr.add("Força"); this.nomesDosAtr.add("Destreza"); this.nomesDosAtr.add("Constituição");
        this.nomesDosAtr.add("Inteligência"); this.nomesDosAtr.add("Sabedoria"); this.nomesDosAtr.add("Carisma");

    }

    public PersonagemRPG(){
        this("Nome Indefinido", "Jogador Indefinido", "Personagem da Classe assassino, aparência tal e tal");
        this.nomeAtrAlterado = false;
    }

    public void renomearAtrDoPersonagem(String primeiroAtr, String segundoAtr, String terceiroAtr,
                                        String quartoAtr, String quintoAtr, String sextoAtr){
        this.nomesDosAtr.set(0, primeiroAtr);
        this.nomesDosAtr.set(1, segundoAtr);
        this.nomesDosAtr.set(2, terceiroAtr);
        this.nomesDosAtr.set(3, quartoAtr);
        this.nomesDosAtr.set(4, quintoAtr);
        this.nomesDosAtr.set(5, sextoAtr);
        this.nomeAtrAlterado = true;


    }

    public String toString(){

        return "Jogador: " + this.getNomeDoJogador() + "\nNome: " + this.nome + "     |     Pontos de Vida: " + this.pontosDeVida + "     |     Nível: " + this.nivel + "     |     Atributos: \n" +
                "Descrição: " + this.getDescricao() + "\n" +
                this.nomesDosAtr.get(0) + "[" + this.forca + "]\n" +
                this.nomesDosAtr.get(1) + "[" + this.destreza + "]\n" +
                this.nomesDosAtr.get(2) + "[" + this.constituicao + "]\n" +
                this.nomesDosAtr.get(3) + "[" + this.inteligencia + "]\n" +
                this.nomesDosAtr.get(4) + "[" + this.sabedoria + "]\n" +
                this.nomesDosAtr.get(5) + "[" + this.carisma + "]";

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonagemRPG that = (PersonagemRPG) o;
        return Objects.equals(nome, that.nome) && Objects.equals(nomeDoJogador, that.nomeDoJogador) && Objects.equals(descricao, that.descricao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), nomeDoJogador, descricao);
    }

    //Joga um dado e retorna seu valor somado a um atributo do personagem
    public int rolarDado(int somarUmAtributo, int ladosDoDado){
        Random geradorAleatorio = new Random();
        int valorDado = geradorAleatorio.nextInt(ladosDoDado) + 1;

        dadosJogados.add(Integer.toString(valorDado));
        return valorDado + somarUmAtributo;
    }

    public int rolarDado(int somarUmAtributo){
        Random geradorAleatorio = new Random();
        int valorDado = geradorAleatorio.nextInt(20) + 1;

        dadosJogados.add(Integer.toString(valorDado));
        return valorDado + somarUmAtributo;
    }

    //Joga um dado e retorna seu valor puro
    public int rolarDado(){
        Random geradorAleatorio = new Random();
        int valorDado = geradorAleatorio.nextInt(20) + 1;

        dadosJogados.add(Integer.toString(valorDado));
        return valorDado;
    }

    public String exibirDadosJogados(){
        String exibir = "{";

        for(int i = 0; i < dadosJogados.size(); i++){
            String dado = dadosJogados.get(i);
            if(i == dadosJogados.size() - 1){
                exibir += dado + "}";
            }else{
                exibir += dado + ", ";
            }

        }

        return exibir;
    }


    //GET e SET
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

    public List<String> getDadosJogados() {
        return dadosJogados;
    }

    public boolean ehNomeAtrAlterado() {
        return nomeAtrAlterado;
    }

    public void setNomeAtrAlterado(boolean nomeAtrAlterado) {
        this.nomeAtrAlterado = nomeAtrAlterado;
    }

    public String getNomeDoJogador() {
        return nomeDoJogador;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<String> getNomesDosAtr() {
        return nomesDosAtr;
    }

    public void setNomesDosAtr(List<String> nomesDosAtr) {
        this.nomesDosAtr = nomesDosAtr;
    }

    //Gravador e Recuperador

}