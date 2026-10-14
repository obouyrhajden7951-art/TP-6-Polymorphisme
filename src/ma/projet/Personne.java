package ma.projet;

public abstract class Personne {
    protected String nom;
    protected double salaireBase;

    public Personne(String nom, double salaireBase) {
        this.nom = nom;
        this.salaireBase = salaireBase;
    }

    // chaque sous-classe calcule son salaire
    public abstract double calculerSalaire();

    public void affiche() {
        System.out.printf("Je suis %s, salaire = %.2f%n", nom, calculerSalaire());
    }
}
