import br.ufpb.dcx.erick.leandro.PersonagemInexistenteException;
import br.ufpb.dcx.erick.leandro.PersonagemRPG;
import br.ufpb.dcx.erick.leandro.SistemaRPGDeErick;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TesteSistemaRPGDeErick {
    public static void main(String [] args) {
        SistemaRPGDeErick sistema = new SistemaRPGDeErick();

        PersonagemRPG p1 = new PersonagemRPG("Aa", "E", "rapaz");
        PersonagemRPG p2 = new PersonagemRPG("Aa", "A", "rapaz");

        //assertTrue(sistema.exibirT);
        try {
            sistema.cadastrarPersonagem(p1);
            sistema.cadastrarPersonagem(p2);
            System.out.println(sistema.exibirTodosOsNomesDosPersonagens());
            p1.rolarDado();
            p1.rolarDado(p1.getForca());
            List<PersonagemRPG> personagensAchados = sistema.pesquisarPersonagemPeloNome("Aa");
            System.out.println(p1.toString());
            assertTrue( personagensAchados.size() == 2);
            System.out.println(sistema.exibirDadosRoladosPeloPersonagem(p1.getNome()));
            p1.setCarisma(3);
            sistema.alterarNomeDosAtributosDoPersonagem(p1, "For", "Des","Cons","Int", "Sab", "Car");
            System.out.println(p1.exibirDadosJogados());
            System.out.println(p1.toString());

        } catch ( PersonagemInexistenteException e) {
            throw new RuntimeException(e);
        }
    }
}
