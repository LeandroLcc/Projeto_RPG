package br.ufpb.dcx.erick.leandro;

import java.util.HashMap;
import java.util.Map;

public class SistemaRPGDeErick implements SistemaRPG{
    private Map<String, PersonagemRPG> listaDePersonagens;
    private Map<String, Habilidade> listaDeHabilidades;

    public SistemaRPGDeErick(){
        this.listaDeHabilidades = new HashMap<>();
        this.listaDePersonagens = new HashMap<>();
    }

    public void cadastrarPersonagem(String nome, int pontosDeVida, int nivel, int forca, int destreza,
                                    int constituicao, int inteligencia, int sabedoria, int carisma){
    }
    public void criarHabilidade(String nome, String descricao, int valoQueHabilidadeRetorna){

    }
    public String exibirDadosRoladosPeloPersonagem(String NomeDoPersonagem){
        //TODO
        return "";
    }
    public String exibirTodasAsHabilidadesPeloNome(){
        //TODO
        return "";
    }
    public String exibirTodosOsPersonagensPeloNome(){
        //TODO
        return "";
    }
    public PersonagemRPG pesquisarPersonagemPeloNome(String nomeDoPersonagem){
        //TODO
        return null;
    }
    public Habilidade pesquisarHabilidadePeloNome(String nomeDaHabilidade){
        //TODO
        return null;
    }
    public void alterarNomeDosAtributosDoPersonagem(String nomeDoPersonagem, String primeiroAtr, String segundoAtr, String terceiroAtr,
                                                    String quartoAtr, String quintoAtr, String sextoAtr){
        //TODO
    }
}
