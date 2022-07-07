package Exo07;

import Assets.Color;

public abstract class Personne {
    // attributs
    protected String nom;
    protected String prenom;
    protected Personne fiance;
    protected boolean estFiance = false;
    protected String e = "";
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
    public void repondreDemandeEnMariage(boolean reponse){
        // vérifier demande en cours
        if(this.fiance == null){
            System.out.println(Color.ANSI_RED+ "Il n'y a pas de demande en cours"+ Color.ANSI_RESET);
        }
        else {
            System.out.println("La reponse est : "+((reponse)?"oui": "non"));
            // vérfifier la reponse
            if(this.estFiance){
                System.out.println("La réponse vérifiée est : Désolé"+this.e+ ", je suis déjà fiancé"+e);
            }
            else {
                if(reponse){
                    System.out.println("La réponse vérifiée est : Je te dis oui");
                    estFiance = true;
                    this.fiance.estFiance=true;
                }
                else {
                    System.out.println("La réponse vérifiée est : C'est non");
                    this.fiance.fiance = null;
                    this.fiance = null;
                }
            }
        }
    }
    public void  donnerStatusMariage(){
        if(this.estFiance){
            System.out.println(this.prenom + " est fiancé"+e);
            System.out.println("Fiancé"+e + " est : "+this.fiance.toString());
        }
        else {
            System.out.println(this.prenom + " n'est pas fiancé"+e);
        }

    }

    public static void quiEsTu(){
        System.out.println("Je suis une personne");
    }
}
