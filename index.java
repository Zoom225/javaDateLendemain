import java.util.Scanner;

public class index {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Demande à l'utilisateur de saisir une date
    System.out.print("Entrez une date (jj mm aaaa) : ");
    int jour = sc.nextInt();
    int mois = sc.nextInt();
    int annee = sc.nextInt();

    // Vérifie si l'année est bissexte
    boolean estBissexte = (annee % 4 == 0 && annee % 100 != 0) || annee % 400 == 0;

    // Détermine le nombre de jours dans le mois courant
    int nbJoursMois;
    if (mois == 2) {
      // Février a 28 jours, sauf en année bissexte où il a 29 jours
      nbJoursMois = estBissexte ? 29 : 28;
    } else if (mois == 4 || mois == 6 || mois == 9 || mois == 11) {
      // Avril, juin, septembre et novembre ont 30 jours
      nbJoursMois = 30;
    } else {
      // Les autres mois ont 31 jours
      nbJoursMois = 31;
    }

    // Incrémente la date
    jour++;
    if (jour > nbJoursMois) {
      jour = 1;
      mois++;
      if (mois > 12) {
        mois = 1;
        annee++;
      }
    }

    // Affiche la date du lendemain
    System.out.println("Demain nous serons le " + jour + " " + mois + " " + annee);
  }
}
