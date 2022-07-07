package Exo09;


public class TestInterface {
    public static void main(String[] args) {
        Femme cleopatre = new Femme("D'Eypte", "Cleopatre");
        Homme jules = new Homme("César", "Jules");
        cleopatre.sePresenter();
        cleopatre.voir();
        cleopatre.entendre();

        jules.sePresenter();
        jules.voir();
        jules.entendre();
    }
}
