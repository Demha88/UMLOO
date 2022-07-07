package Exo04;

import Assets.Color;

public abstract class Personne {
    // attributs
    protected String nom;
    protected String prenom;
    protected Personne fiance;
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

    public void demanderEnMariage(Personne personne){
        if(personne == this){
            System.out.println(Color.ANSI_RED + "Vous ne pouvez pas vous demander en mariage"+ Color.ANSI_RESET);
        }
        else{
            System.out.println("Veux-tu m'épouser "+personne.toString() + " ?");
            this.fiance = personne;
            personne.fiance = this;
        }
    }
}
