package Exo02;

public class Test {
    public static void main(String[] args) {
        // créer une personne avec son prénom
        Personne jules = new Personne("Jules");
        jules.nom = "Cesar";
        //jules.prenom = "";
        Personne cleopatre = new Personne("D'Egypte", "Cleopatre");
        jules.sePresenter();
        cleopatre.sePresenter();
    }
}
