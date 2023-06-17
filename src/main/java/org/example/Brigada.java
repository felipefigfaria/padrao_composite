package org.example;

public class Brigada extends Grupamento {

    private int quantidadeMilitares;

    public Brigada(String descricao, int quantidadeMilitares) {
        super(descricao);
        this.quantidadeMilitares = quantidadeMilitares;
    }

    public int getQuantidadeMilitares() {
        return this.quantidadeMilitares;
    }

    public void setQuantidadeMilitares(int quantidadeMilitares) {
        this.quantidadeMilitares = quantidadeMilitares;
    }

    public String getGrupamento() {
        return "Brigada: " + this.getDescricao() + " - Quantidade de Militares: " + this.quantidadeMilitares + "\n";
    }
}