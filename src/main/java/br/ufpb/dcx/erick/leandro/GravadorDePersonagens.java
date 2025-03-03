package br.ufpb.dcx.erick.leandro;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;

public class GravadorDePersonagens {
    private String arquivoRPG;

    public GravadorDePersonagens() {
        this.arquivoRPG = "RPG.dat";
    }

    public Collection<PersonagemRPG> recuperarPersonagem() throws IOException {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(this.arquivoRPG))) {
            Collection<PersonagemRPG> personagensAchados = (ArrayList<PersonagemRPG>) in.readObject();
            return personagensAchados;
        } catch (ClassNotFoundException | ClassCastException e) {
            throw new IOException(e);
        }

    }

    public void gravarPersonagem(Collection<PersonagemRPG> personagensLista) throws IOException {
        ArrayList<PersonagemRPG> personagensArrayList = new ArrayList<>();
        personagensArrayList.addAll(personagensLista);
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(arquivoRPG))) {
            out.writeObject(personagensArrayList);
        }
    }
}
