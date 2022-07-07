package Exo06;


public class TestSePresenter {
    public static void main(String[] args) {
        Homme jules = new Homme("César", "Jules");
        Femme cleopatre = new Femme("D'Eypte", "Cleopatre");

        Personne.quiEsTu();
        Homme.quiEsTu();
        Femme.quiEsTu();
        System.out.println("---");
        jules.sePresenter();
        System.out.println("---");
        cleopatre.sePresenter();
    }
}
