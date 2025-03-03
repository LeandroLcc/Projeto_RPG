package br.ufpb.dcx.erick.leandro;

import java.io.IOException;
import java.util.List;

public interface SistemaRPG {
    public void cadastrarPersonagem(PersonagemRPG personagemRpg) throws PersonagemJaExisteException;
    public void cadastrarHabilidade(Habilidade habilidade) throws HabilidadeJaExisteException;
    public String exibirDadosRoladosPeloPersonagem(String nomeDoPersonagem) throws PersonagemInexistenteException;
    public List<String> exibirTodasAsHabilidadesPeloNome();
    public List<String> exibirTodosOsPersonagensPeloNome();
    public List<PersonagemRPG> pesquisarPersonagemPeloNome(String nomeDoPersonagem) throws PersonagemInexistenteException;
    public List<Habilidade> pesquisarHabilidades(String nomeDaHabilidade) throws HabilidadeInexistenteException;
    public void alterarNomeDosAtributosDoPersonagem(String nomeDoPersonagem, String nomeDoJogador, String primeiroAtr, String segundoAtr, String terceiroAtr,
                                                    String quartoAtr, String quintoAtr, String sextoAtr) throws PersonagemInexistenteException;
    public void removerHabilidade(Habilidade habilidade) throws HabilidadeInexistenteException;
    public void removerPersonagem(PersonagemRPG personagem) throws PersonagemInexistenteException;
    public void recuperarPersonagens() throws IOException, PersonagemJaExisteException;
    public void salvarPersonagens() throws IOException;


}