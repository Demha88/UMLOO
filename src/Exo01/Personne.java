package Exo01;

public class Personne {
    // attributs
    public String nom;
    public String prenom;
    // Méthodes
    public void sePresenter(){
        System.out.println("Je m'appelle " + this.prenom + " " + this.nom);
    }

    public void parler(String phrase){
        System.out.printf("%s %s dit : %s\n", nom, prenom, phrase);
    }
}
