package Exo03;

public class TestFemme {
    public static void main(String[] args) {
        Femme cleopatre = new Femme("D'Eypte", "Cleopatre");
        cleopatre.sePresenter();
        cleopatre.verifEstEnceinte();
        cleopatre.setEstEnceinte(true);
        cleopatre.verifEstEnceinte();
        cleopatre.accoucher();
        cleopatre.verifEstEnceinte();
    }
}
