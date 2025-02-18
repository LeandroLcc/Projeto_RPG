package br.ufpb.dcx.erick.leandro;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        List<PersonagemRPG> listaDePersonagens = new ArrayList<>();
        PersonagemRPG personagem1 = new PersonagemRPG();
        PersonagemRPG personagem2 = new PersonagemRPG("Lamar", 14, 1, 3, 0, 2, -1, 2, -2);
        PersonagemRPG personagem3 = new PersonagemRPG("Alexander II", 18, 2, 0, 2, 1, 4, -1, 2);
        System.out.println("Personagem 1 - Nome: " + personagem1.getNome());
        personagem1.setNome("Priezot");
        System.out.println("Personagem 1 - Nome: " + personagem1.getNome());
        System.out.println("Personagem 2 - Nome: " + personagem2.getNome());
        personagem2.setNome("Kendrick");

        try {
            personagem2.setPontosDeVida(21);
            System.out.println("Personagem 3 - Nome: " + personagem3.getNome() + ", Rolando o dado... O resultado foi: \n" + personagem3.rolarDado(personagem3.getForca()));
        }catch(NumberFormatException e){
            System.out.println("Algum valor informado não está num formato válido.");
        }

        System.out.println("Personagem 2 - Nome: " + personagem2.getNome() + "; Pontos de Vida: " + personagem2.getPontosDeVida());
    }
}
