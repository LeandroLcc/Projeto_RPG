package br.ufpb.dcx.erick.leandro;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;

public class GravadorDeHabilidades {
    private String arquivoHabilidade;

    public GravadorDeHabilidades() {
        this.arquivoHabilidade = "Habilidades.dat";
    }

    public Collection<Habilidade> recuperarHabilidade() throws IOException {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(this.arquivoHabilidade))) {
            Collection<Habilidade> habilidadesAchadas = (ArrayList<Habilidade>) in.readObject();
            return habilidadesAchadas;
        } catch (ClassNotFoundException | ClassCastException e) {
            throw new IOException(e);
        }

    }

    public void gravarHabilidade(Collection<Habilidade> habilidadesLista) throws IOException {
        ArrayList<Habilidade> habilidadeArrayList = new ArrayList<>();
        habilidadesLista.addAll(habilidadesLista);
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(arquivoHabilidade))) {
            out.writeObject(habilidadesLista);
        }
    }
}

