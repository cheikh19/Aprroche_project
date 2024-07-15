// Dans le package


package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {
    private double tauxRemuneration;

    public CompteTaux(String numeroCompte, double solde, double tauxRemuneration) {
        super(numeroCompte, solde);
        this.tauxRemuneration = tauxRemuneration;
    }

    public double getTauxRemuneration() {
        return tauxRemuneration;
    }

    public void setTauxRemuneration(double tauxRemuneration) {
        this.tauxRemuneration = tauxRemuneration;
    }

    @Override
    public String toString() {
        return super.toString() + ", tauxRemuneration=" + tauxRemuneration + "}";
    }
}