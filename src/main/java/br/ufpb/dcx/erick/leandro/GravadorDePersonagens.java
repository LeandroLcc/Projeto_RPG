package br.ufpb.dcx.erick.leandro;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;

public class GravadorDePersonagens {
    private String arquivoPersonagem;

    public GravadorDePersonagens() {
        this.arquivoPersonagem = "Personagens.dat";
    }

    public Collection<PersonagemRPG> recuperarPersonagem() throws IOException {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(this.arquivoPersonagem))) {
            Collection<PersonagemRPG> personagensAchados = (ArrayList<PersonagemRPG>) in.readObject();
            return personagensAchados;
        } catch (ClassNotFoundException | ClassCastException e) {
            throw new IOException(e);
        }

    }

    public void gravarPersonagem(Collection<PersonagemRPG> personagensLista) throws IOException {
        ArrayList<PersonagemRPG> personagensArrayList = new ArrayList<>();
        personagensArrayList.addAll(personagensLista);
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(arquivoPersonagem))) {
            out.writeObject(personagensArrayList);
        }
    }
}
