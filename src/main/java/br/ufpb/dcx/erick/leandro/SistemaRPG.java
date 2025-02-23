package br.ufpb.dcx.erick.leandro;

import java.util.List;

public interface SistemaRPG {
    public void cadastrarPersonagem(PersonagemRPG personagemRpg) throws PersonagemJaExisteException;
    public void cadastrarHabilidade(Habilidade habilidade) throws HabilidadeJaExisteException;
    public String exibirDadosRoladosPeloPersonagem(String nomeDoPersonagem) throws PersonagemInexistenteException;
    public String exibirTodasAsHabilidadesPeloNome();
    public String exibirTodosOsPersonagensPeloNome();
    public PersonagemRPG pesquisarPersonagemPeloNome(String nomeDoPersonagem) throws PersonagemInexistenteException;
    public List<Habilidade> pesquisarHabilidades(String nomeDaHabilidade) throws HabilidadeInexistenteException;
    public void alterarNomeDosAtributosDoPersonagem(String nomeDoPersonagem, String primeiroAtr, String segundoAtr, String terceiroAtr,
                                         String quartoAtr, String quintoAtr, String sextoAtr) throws PersonagemInexistenteException;


}
