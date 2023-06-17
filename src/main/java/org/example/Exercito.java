package org.example;

public class Exercito {

    private Grupamento corpoMilitar;

    public void setCorpoMilitar(Grupamento corpoMilitar) {
        this.corpoMilitar = corpoMilitar;
    }

    public String getCorpoMilitar() {
        if (this.corpoMilitar == null) {
            throw new NullPointerException("Exército sem corpo militar");
        }
        return this.corpoMilitar.getGrupamento();
    }
}
