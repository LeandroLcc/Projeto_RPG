package br.ufpb.dcx.erick.leandro;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SistemaRPGDeErick implements SistemaRPG{
    private Map<String, PersonagemRPG> listaDePersonagens;
    private Map<String, Habilidade> listaDeHabilidades;

    public SistemaRPGDeErick(){
        this.listaDeHabilidades = new HashMap<>();
        this.listaDePersonagens = new HashMap<>();
    }

    public void cadastrarPersonagem(PersonagemRPG personagemRpg) throws PersonagemJaExisteException{
        if(!this.listaDePersonagens.containsKey(personagemRpg.getNome())) {
            this.listaDePersonagens.put(personagemRpg.getNome(), personagemRpg);
        }else{
            throw new PersonagemJaExisteException("Um personagem com esse nome já existe atualmente!");
        }

    }

    public void cadastrarHabilidade(Habilidade habilidade) throws HabilidadeJaExisteException{
        for(Habilidade h : this.listaDeHabilidades.values()) {
            if(h.equals(habilidade)){
                throw new HabilidadeJaExisteException("Essa habilidade já existe");
            }
        }

        this.listaDeHabilidades.put(habilidade.getNome(), habilidade);

    }
    //Provavelmente vou retirar esse métdo pois já existe um na classe PersonagemRPG que tem a mesma função
    public String exibirDadosRoladosPeloPersonagem(String nomeDoPersonagem) throws PersonagemInexistenteException{
        if(this.listaDePersonagens.containsKey(nomeDoPersonagem)) {
            PersonagemRPG dadosRoladosDoPersonagem = this.listaDePersonagens.get(nomeDoPersonagem);
            return dadosRoladosDoPersonagem.exibirDadosJogadosDoPersonagem();
        }else{
            throw new PersonagemInexistenteException("Esse personagem não existe!");
        }
    }

    public String exibirTodasAsHabilidadesPeloNome(){
        String exibir = "{";

        for(Habilidade h : this.listaDeHabilidades.values()){
            String nomeHabilidade = h.getNome();
            exibir += nomeHabilidade + ";";
        }
        exibir += "}";

        return exibir;
    }

    public String exibirTodosOsPersonagensPeloNome(){
        String exibir = "{";

        for(PersonagemRPG p : this.listaDePersonagens.values()){
            String nomePersonagem = p.getNome();
            exibir += nomePersonagem + ";";
        }
        exibir += "}";

        return exibir;
    }

    public PersonagemRPG pesquisarPersonagemPeloNome(String nomeDoPersonagem) throws PersonagemInexistenteException{
        if(this.listaDePersonagens.containsKey(nomeDoPersonagem)){
            PersonagemRPG personagemPesquisado = this.listaDePersonagens.get(nomeDoPersonagem);
            return personagemPesquisado;
        }else{
            throw new PersonagemInexistenteException("Personagem não foi encontrado.");
        }

    }

    public List<Habilidade> pesquisarHabilidades(String nomeDaHabilidade) throws HabilidadeInexistenteException{
        List<Habilidade> listaDeHabilidadesEncontradas = new ArrayList<>();
        for(Habilidade h : this.listaDeHabilidades.values()){
            if(h.getNome().equalsIgnoreCase(nomeDaHabilidade)){
                listaDeHabilidadesEncontradas.add(h);
            }
        }

        return listaDeHabilidadesEncontradas;
    }

    public void alterarNomeDosAtributosDoPersonagem(String nomeDoPersonagem, String primeiroAtr, String segundoAtr, String terceiroAtr,
                                                    String quartoAtr, String quintoAtr, String sextoAtr) throws PersonagemInexistenteException{
        if(this.listaDePersonagens.containsKey(nomeDoPersonagem)){
            this.listaDePersonagens.get(nomeDoPersonagem).renomearAtrDoPersonagem(primeiroAtr, segundoAtr, terceiroAtr, quartoAtr, quintoAtr, sextoAtr);
        }else{
            throw new PersonagemInexistenteException("Esse personagem não existe!");
        }
    }
}
