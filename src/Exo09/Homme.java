package Exo09;

public class Homme extends Personne implements Sens {
    // attribut
    private int longueurBarbe = 3;
    public static final Sexe SEXE = Sexe.Homme;
    private static int nbHommes = 0;

    public Homme(String prenom) {
        super(prenom);
        nbHommes++;
    }

    public Homme(String nom, String prenom) {
        super(nom, prenom);
        nbHommes++;
    }

    public Homme(String nom, String prenom, int longueurBarbe) {
        super(nom, prenom);
        this.longueurBarbe = longueurBarbe;
        nbHommes++;
    }

    public int getLongueurBarbe() {
        return longueurBarbe;
    }

    public void setLongueurBarbe(int longueurBarbe) {
        this.longueurBarbe = longueurBarbe;
    }

    public void seRaser(){
        this.longueurBarbe = 0;
    }

    public static void quiEsTu(){
        System.out.println("Je suis un homme");
    }

    public void sePresenter(){
        Personne.quiEsTu();
        quiEsTu();
        super.sePresenter();
    }
    public static void afficherNbHommes(){
        System.out.println("Il y a " + nbHommes + " homme" + ((nbHommes > 1)? "s":""));
    }

    @Override
    public void voir() {
        System.out.println("Je vois loin");
    }

    @Override
    public void entendre() {
        System.out.println("J'enends à ma façon");
    }
}
