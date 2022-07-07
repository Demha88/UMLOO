package Exo04;


public class TestDemandeMariage {
    public static void main(String[] args) {
        Homme jules = new Homme("César", "Jules");
        Femme cleopatre = new Femme("D'Eypte", "Cleopatre");
        jules.demanderEnMariage(jules);
        jules.demanderEnMariage(cleopatre);
    }
}
