package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExercitoTest {

    @Test
    void deveRetornarGrupamentoExercito() {
        Divisao divisao1 = new Divisao("Divisão de São Paulo");
        Brigada brigada1 = new Brigada("Brigada 01 da Divisão de São Paulo", 900);
        divisao1.addGrupamento(brigada1);

        Divisao divisao2 = new Divisao("Divisão de Niterói");
        Brigada brigada5 = new Brigada("Brigada 05 da Divisão de Niterói", 500);
        Brigada brigada7 = new Brigada("Brigada 07 da Divisão de Niterói", 850);
        divisao2.addGrupamento(brigada5);
        divisao2.addGrupamento(brigada7);

        Divisao divisao3 = new Divisao("Divisão de Salvador");

        Divisao corpoMilitar = new Divisao("Corpo Militar do Exército Brasileiro");
        corpoMilitar.addGrupamento(divisao1);
        corpoMilitar.addGrupamento(divisao2);
        corpoMilitar.addGrupamento(divisao3);

        Exercito exercito = new Exercito();
        exercito.setCorpoMilitar(corpoMilitar);

        assertEquals("Divisão: Corpo Militar do Exército Brasileiro\n" +
                "Divisão: Divisão de São Paulo\n" +
                "Brigada: Brigada 01 da Divisão de São Paulo - Quantidade de Militares: 900\n" +
                "Divisão: Divisão de Niterói\n" +
                "Brigada: Brigada 05 da Divisão de Niterói - Quantidade de Militares: 500\n" +
                "Brigada: Brigada 07 da Divisão de Niterói - Quantidade de Militares: 850\n" +
                "Divisão: Divisão de Salvador\n", exercito.getCorpoMilitar());
    }

    @Test
    void deveRetornarExecaoExercitoSemCorpoMilitar() {
        try {
            Exercito exercito = new Exercito();
            exercito.getCorpoMilitar();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Exército sem corpo militar", e.getMessage());
        }
    }
}