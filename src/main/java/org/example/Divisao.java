package org.example;

import java.util.ArrayList;
import java.util.List;

public class Divisao extends Grupamento {

    private List<Grupamento> grupamentos;

    public Divisao(String descricao) {
        super(descricao);
        this.grupamentos = new ArrayList<Grupamento>();
    }

    public void addGrupamento(Grupamento grupamento) {
        this.grupamentos.add(grupamento);
    }

    public String getGrupamento() {
        String saida = "";
        saida = "Divisão: " + this.getDescricao() + "\n";
        for (Grupamento grupamento : grupamentos) {
            saida += grupamento.getGrupamento();
        }
        return saida;
    }
}