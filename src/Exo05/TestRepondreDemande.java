package Exo05;


public class TestRepondreDemande {
    public static void main(String[] args) {
        Homme jules = new Homme("César", "Jules");
        Femme cleopatre = new Femme("D'Eypte", "Cleopatre");
        jules.demanderEnMariage(jules);
        jules.donnerStatusMariage();
        jules.repondreDemandeEnMariage(true);
        System.out.println("----");
        jules.demanderEnMariage(cleopatre);
        cleopatre.repondreDemandeEnMariage(true);
        //cleopatre.repondreDemandeEnMariage(false);
        cleopatre.donnerStatusMariage();
        jules.donnerStatusMariage();

    }
}
