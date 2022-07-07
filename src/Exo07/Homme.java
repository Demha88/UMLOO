package Exo07;

public class Homme extends Personne {
    // attribut
    private int longueurBarbe = 3;
    public static final Sexe SEXE = Sexe.Homme;

    public Homme(String prenom) {
        super(prenom);
    }

    public Homme(String nom, String prenom) {
        super(nom, prenom);
    }

    public Homme(String nom, String prenom, int longueurBarbe) {
        super(nom, prenom);
        this.longueurBarbe = longueurBarbe;
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
}
