package Exo01;

public class Test {
    public static void main(String[] args) {
        // créer une personne
        Personne jules = new Personne();
        jules.nom = "César";
        jules.prenom = "Jules";
        jules.parler("Bonjour");
        jules.sePresenter();
    }
}
