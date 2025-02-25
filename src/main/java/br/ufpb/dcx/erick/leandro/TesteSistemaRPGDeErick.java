package br.ufpb.dcx.erick.leandro;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TesteSistemaRPGDeErick {
    public static void main(String [] args) {
        SistemaRPGDeErick sistema = new SistemaRPGDeErick();

        PersonagemRPG p1 = new PersonagemRPG("Aa", 0, 0, 3, 0, 0, 0, 0, 0);
        PersonagemRPG p2 = new PersonagemRPG("aA", 0, 0, 0, 0, 0, 0, 0, 0);

        //assertTrue(sistema.exibirT);
        try {
            sistema.cadastrarPersonagem(p1);
            sistema.cadastrarPersonagem(p2);

            p1.rolarDado();
            p1.rolarDado(p1.getForca());
            System.out.println(sistema.exibirDadosRoladosPeloPersonagem(p1.getNome()));
            System.out.println(p1.exibirDadosJogados());
        } catch (PersonagemJaExisteException | PersonagemInexistenteException e) {
            throw new RuntimeException(e);
        }
    }
}
