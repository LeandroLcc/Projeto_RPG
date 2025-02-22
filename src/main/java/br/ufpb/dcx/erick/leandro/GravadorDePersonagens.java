package br.ufpb.dcx.erick.leandro;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;

public class GravadorDePersonagens {
    private String arquivoRPG;

    public GravadorDePersonagens() {
        this.arquivoRPG = "RPG.dat";
    }

    public Collection<PersonagemRPG> recuperaRPG() throws IOException {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(this.arquivoRPG))) {
            Collection<PersonagemRPG> personagensAchados = (ArrayList<PersonagemRPG>) in.readObject();
            return personagensAchados;
        } catch (ClassNotFoundException | ClassCastException e) {
            throw new IOException(e);
        }

    }

    public void gravaRoupas(Collection<PersonagemRPG> roupas) throws IOException {
        ArrayList<PersonagemRPG> roupasArrayList = new ArrayList<>();
        roupasArrayList.addAll(roupas);
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(arquivoRPG))) {
            out.writeObject(roupasArrayList);
        }
    }
}
