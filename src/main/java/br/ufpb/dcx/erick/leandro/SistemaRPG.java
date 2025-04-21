package br.ufpb.dcx.erick.leandro;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public interface SistemaRPG {
    public void cadastrarPersonagem(PersonagemRPG personagemRpg);
    public void cadastrarHabilidade(Habilidade habilidade) throws HabilidadeJaExisteException;
    public String exibirDadosRoladosPeloPersonagem(String nomeDoPersonagem) throws PersonagemInexistenteException;
    public ArrayList<String> exibirTodasAsHabilidadesPeloNome();
    public ArrayList<String> exibirTodosOsNomesDosPersonagens();
    public List<PersonagemRPG> pesquisarPersonagemPeloNome(String nomeDoPersonagem);
    public PersonagemRPG pesquisarPersonagemPeloIndice(int i);
    public List<Habilidade> pesquisarHabilidades(String nomeDaHabilidade);
    public void alterarNomeDosAtributosDoPersonagem(PersonagemRPG personagem, String primeiroAtr, String segundoAtr, String terceiroAtr,
                                                    String quartoAtr, String quintoAtr, String sextoAtr) throws PersonagemInexistenteException;
    public void removerHabilidade(Habilidade habilidade) throws HabilidadeInexistenteException;
    public void removerPersonagem(PersonagemRPG personagem) throws PersonagemInexistenteException;
    public void recuperar() throws IOException, PersonagemJaExisteException, HabilidadeJaExisteException;
    public void salvar() throws IOException;


}