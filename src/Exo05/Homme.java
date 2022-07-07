package Exo05;

public class Homme extends Personne {
    // attribut
    private int longueurBarbe = 3;

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
}
