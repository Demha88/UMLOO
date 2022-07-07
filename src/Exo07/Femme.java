package Exo07;

import Assets.Color;

import java.util.Random;

public class Femme extends Personne {
    // attribut
    private boolean estEnceinte = false;
    public static final Sexe SEXE = Sexe.Femme;

    // constructeur
    public Femme(String prenom) {
        super(prenom);
        this.e = "e";
    }

    public Femme(String nom, String prenom) {
        super(nom, prenom);
        this.e = "e";
    }

    public Femme(String nom, String prenom, boolean estEnceinte) {
        super(nom, prenom);
        this.estEnceinte = estEnceinte;
        this.e = "e";
    }

    public void verifEstEnceinte(){
        if(this.estEnceinte){
            System.out.println("Je suis enceinte");
        }
        else {
            System.out.println("Je ne suis pas enceinte");
        }
    }

    public void setEstEnceinte(boolean estEnceinte) {
        this.estEnceinte = estEnceinte;
    }

    public void accoucher(){
        System.out.println("J'accouche");
        this.estEnceinte = false;
        // générer sexe enfant
        Random random = new Random();
        boolean estFille = random.nextBoolean();
        if(estFille){
            System.out.println(Color.ANSI_RED + "C'est une fille" + Color.ANSI_RESET);
        }
        else {
            System.out.println(Color.ANSI_BLUE + "C'est un garçon" + Color.ANSI_RESET);
        }
    }
    public static void quiEsTu(){
        System.out.println("Je suis une femme");
    }

    public void sePresenter(){
        Personne.quiEsTu();
        quiEsTu();
        super.sePresenter();
    }
}
