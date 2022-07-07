package Exo03;

public class TestHomme {
    public static void main(String[] args) {
        Homme jules = new Homme("César", "Jules");
        System.out.println("Ma barbe fait : "+jules.getLongueurBarbe() + " cm");
        jules.seRaser();
        System.out.println("Ma barbe fait : "+jules.getLongueurBarbe() + " cm");

        Homme noel = new Homme("Pere", "Noel", 7);
        System.out.println("Ma barbe fait : "+noel.getLongueurBarbe() + " cm");
        noel.seRaser();
        System.out.println("Ma barbe fait : "+noel.getLongueurBarbe() + " cm");
    }
}
