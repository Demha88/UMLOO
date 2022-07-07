package Exo08;


public class TestStatic {
    public static void main(String[] args) {
        Personne.afficherNbPersonnes();
        Femme cleopatre = new Femme("D'Eypte", "Cleopatre");
        Personne.afficherNbPersonnes();
        Homme jules = new Homme("César", "Jules");
        Homme jules2 = new Homme("César", "Jules");
        Personne.afficherNbPersonnes();
        Homme.afficherNbHommes();
        Femme.afficherNbFemmes();
    }
}
