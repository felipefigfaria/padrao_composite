package org.example;

public abstract class Grupamento {

    private String descricao;

    public Grupamento(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public abstract String getGrupamento();
}
