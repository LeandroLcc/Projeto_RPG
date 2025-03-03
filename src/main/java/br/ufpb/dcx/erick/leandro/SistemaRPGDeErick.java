package br.ufpb.dcx.erick.leandro;

import java.io.IOException;
import java.util.*;

public class SistemaRPGDeErick implements SistemaRPG{
    private ArrayList<PersonagemRPG> listaDePersonagens;
    private ArrayList<Habilidade> listaDeHabilidades;
    private GravadorDePersonagens gravadorDePersonagens;

    public SistemaRPGDeErick(){
        this.listaDeHabilidades = new ArrayList<>();
        this.listaDePersonagens = new ArrayList<>();
        this.gravadorDePersonagens = new GravadorDePersonagens();
    }

    public void cadastrarPersonagem(PersonagemRPG personagemRpg) throws PersonagemJaExisteException{
        for(PersonagemRPG p : this.listaDePersonagens){
            if(p.equals(personagemRpg)){
                throw new PersonagemJaExisteException("Esse personagem já existe atualmente!");
            }
        }
        this.listaDePersonagens.add(personagemRpg);
    }

    public void cadastrarHabilidade(Habilidade habilidade) throws HabilidadeJaExisteException{
        for(Habilidade h : this.listaDeHabilidades){
            if(h.equals(habilidade)){
                throw new HabilidadeJaExisteException("Essa habilidade já existe");
            }
        }

        this.listaDeHabilidades.add(habilidade);

    }
    //Provavelmente vou retirar esse métdo pois já existe um na classe PersonagemRPG que tem a mesma função
    public String exibirDadosRoladosPeloPersonagem(String nomeDoPersonagem) throws PersonagemInexistenteException{
        for(PersonagemRPG p : this.listaDePersonagens){
            if(p.getNome().equalsIgnoreCase(nomeDoPersonagem)){
                return p.exibirDadosJogados();
            }
        }
        throw new PersonagemInexistenteException("Esse personagem não existe!");
    }

    public List<String> exibirTodasAsHabilidadesPeloNome(){
        List<String> exibir = new ArrayList<>();

        for(Habilidade h : this.listaDeHabilidades){
            String nomeHabilidade = h.getNome();
            exibir.add(nomeHabilidade);
        }
        return exibir;
    }

    public List<String> exibirTodosOsPersonagensPeloNome(){
        List<String> exibir = new ArrayList<>();

        for(PersonagemRPG p : this.listaDePersonagens){
            String nomePersonagem = p.getNome();
            exibir.add(nomePersonagem);
        }

        return exibir;
    }

    public List<PersonagemRPG> pesquisarPersonagemPeloNome(String nomeDoPersonagem) throws PersonagemInexistenteException{
        List<PersonagemRPG> listaDePersonagensEcontrados = new ArrayList<>();
        for(PersonagemRPG p : this.listaDePersonagens){
            if(p.getNome().equalsIgnoreCase(nomeDoPersonagem)){
                listaDePersonagensEcontrados.add(p);
            }
        }

        throw new PersonagemInexistenteException("Personagem não foi encontrado.");

    }

    public List<Habilidade> pesquisarHabilidades(String nomeDaHabilidade) throws HabilidadeInexistenteException{
        List<Habilidade> listaDeHabilidadesEncontradas = new ArrayList<>();
        for(Habilidade h : this.listaDeHabilidades){
            if(h.getNome().equalsIgnoreCase(nomeDaHabilidade)){
                listaDeHabilidadesEncontradas.add(h);
            }
        }

        return listaDeHabilidadesEncontradas;
    }

    public void alterarNomeDosAtributosDoPersonagem(String nomeDoPersonagem, String nomeDoJogador, String primeiroAtr, String segundoAtr, String terceiroAtr,
                                                    String quartoAtr, String quintoAtr, String sextoAtr) throws PersonagemInexistenteException{
        for(PersonagemRPG p : this.listaDePersonagens){
            if(p.getNome().equalsIgnoreCase(nomeDoPersonagem) && p.getNomeDoJogador().equalsIgnoreCase(nomeDoJogador)){
                p.renomearAtrDoPersonagem(primeiroAtr, segundoAtr, terceiroAtr, quartoAtr, quintoAtr, sextoAtr);
            }

        }

        throw new PersonagemInexistenteException("Esse personagem não existe!");

    }

    public void removerHabilidade(Habilidade habilidade) throws HabilidadeInexistenteException{
        boolean habExiste = false;
        for(Habilidade h : this.listaDeHabilidades){
            if(h.equals(habilidade)){
                this.listaDeHabilidades.remove(h);
                habExiste = true;
            }
        }

        if(!habExiste){
            throw new HabilidadeInexistenteException("Essa habilidade não existe");
        }

    }
    public void removerPersonagem(PersonagemRPG personagem) throws PersonagemInexistenteException{
        boolean persExiste = false;
        for(PersonagemRPG p : this.listaDePersonagens){
            if(p.equals(personagem)){
                this.listaDeHabilidades.remove(p);
                persExiste = true;
            }
        }
        if(!persExiste){
            throw new PersonagemInexistenteException("Esse personagem não existe");
        }
    }

    //Gravador e Recuperador

    public void recuperarPersonagens() throws IOException, PersonagemJaExisteException{
        Collection<PersonagemRPG> personagemAchados = this.gravadorDePersonagens.recuperarPersonagem();
        for( PersonagemRPG r : personagemAchados){
            this.cadastrarPersonagem(r);
        }
    }

    public void salvarPersonagens() throws IOException{
        this.gravadorDePersonagens.gravarPersonagem(this.listaDePersonagens);
    }
}