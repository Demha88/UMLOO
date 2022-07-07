package Exo03;

public abstract class Personne {
    // attributs
    public String nom;
    private String prenom;
    // Méthodes
    public void sePresenter(){
        System.out.println("Je m'appelle " + this.prenom + " " + this.nom);
    }

    public void parler(String phrase){
        System.out.printf("%s %s dit : %s\n", nom, prenom, phrase);
    }

    public Personne(String prenom) {
        this.prenom = prenom;
    }

    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return nom + " " + prenom;
    }
}
