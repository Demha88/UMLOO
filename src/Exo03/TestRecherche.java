package Exo03;

import Assets.Color;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class TestRecherche {
    public static Scanner scanner = new Scanner(System.in);
    public static ArrayList<Homme> hommes = new ArrayList<Homme>();
    public static ArrayList<Femme> femmes = new ArrayList<Femme>();
    public static ArrayList<Personne> favoris = new ArrayList<Personne>();

    public static void main(String[] args) {

        // créer une liste d'hommes

        hommes.add(new Homme("César", "Jules"));
        hommes.add(new Homme("De Belgique", "Philippe"));

        femmes.add(new Femme("D'Egypte", "Cleopatre"));
        femmes.add(new Femme("Curie", "Marie"));

        int reponse = afficherMenu();


        if(reponse==1){
            System.out.println("Notre système recherche un homme");
        }
        else {
            System.out.println("Notre système recherche une femme");
        }

        // faire la sélection
        String aime;

        do{
            System.out.println("Appuyer sur Q pour quitter, 1 pour aime, 0 pour n'aime pas");
            aime = ajouterFavoris(reponse);


        }while(!aime.equals("q"));

        // afficher les favoris
        afficherFavoris();

        System.out.println("A bientot :-)");
    }

    public static String ajouterFavoris(int choixSexe){
        if(choixSexe == 1 && hommes.size() == 0 || choixSexe==2 && femmes.size()==0){
            return "q";
        }
        String aime;
        if(choixSexe==1 ){
            Homme f = hommes.get(0);
            hommes.remove(0);
            System.out.println("Le prétendant est : "+ f.toString());

            aime = scanner.nextLine().toLowerCase();
            if(aime.equals("1")){
                // ajouter à la liste des favoris
                favoris.add(f);
            }
            else if(aime.equals("q")){
                return "q";
            }

        }
        else {
            Femme f = femmes.get(0);
            femmes.remove(0);
            System.out.println("La prétendante est : "+ f.toString());

            aime = scanner.nextLine();
            if(aime.equals("1")){
                // ajouter à la liste des favoris
                favoris.add(f);
            }
            else if(aime.equals("q")){
                return "q";
            }
        }
        return aime;
    }

    public static int afficherMenu(){
        // demander
        System.out.println("Par quoi êtes-vous intéressé(e) ?\n1 - Homme\n2 - Femme");
        String reponse = scanner.nextLine();
        while (!reponse.equals("1") && !reponse.equals("2")){
            System.out.println(Color.ANSI_RED + "Erreur : choix inconnu" + Color.ANSI_RESET);
            reponse = scanner.nextLine();
        }
        return Integer.parseInt(reponse);
    }

    public static void afficherFavoris(){
        if(favoris.size()>0){
            System.out.println(Color.ANSI_PURPLE + "Vous avez aimé" +Color.ANSI_RESET);
            for (Personne p:favoris) {
                System.out.println(p.toString());
            }
        }

    }
}
