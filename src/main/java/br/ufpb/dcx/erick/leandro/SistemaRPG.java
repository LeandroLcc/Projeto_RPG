package br.ufpb.dcx.erick.leandro;

public interface SistemaRPG {
    public void cadastrarPersonagem(String nome, int pontosDeVida, int nivel, int forca, int destreza,
                                    int constituicao, int inteligencia, int sabedoria, int carisma);
    public void criarHabilidade(String nome, String descricao, int valoQueHabilidadeRetorna);
    public String exibirDadosRoladosPeloPersonagem(String NomeDoPersonagem);
    public String exibirTodasAsHabilidadesPeloNome();
    public String exibirTodosOsPersonagensPeloNome();
    public PersonagemRPG pesquisarPersonagemPeloNome(String nomeDoPersonagem);
    public Habilidade pesquisarHabilidadePeloNome(String nomeDaHabilidade);
    public void alterarNomeDosAtributosDoPersonagem(String nomeDoPersonagem, String primeiroAtr, String segundoAtr, String terceiroAtr,
                                         String quartoAtr, String quintoAtr, String sextoAtr);


}
