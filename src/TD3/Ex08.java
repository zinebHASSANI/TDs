package TD3;

      interface Salaire {
            double gains();
       }

      // Interface Personne
       interface Personne {
        String getNom();
        String getPrenom();
        void setNom(String nom);
        void setPrenom(String prenom);
        String toString();
      }

      // Classe abstraite Employe implémentant Personne et Salaire
       abstract class Employe implements Personne, Salaire {
       private String nom;
       private String prenom;

      // Constructeurs
    public Employe() {
    }

    public Employe(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

     // Accesseurs et mutateurs (implémentation de Personne)
    @Override
      public String getNom() {
        return nom;
    }

    @Override
    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String getPrenom() {
        return prenom;
    }

    @Override
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    // Méthode toString (implémentation de Personne)
    @Override
    public String toString() {
        return "Employe [nom=" + nom + ", prenom=" + prenom + "]";
    }
}

   // Classe Patron implémentant Personne et Salaire
   class Patron extends Employe {
    private double salaire;

    // Constructeurs
    public Patron() {
    }

    public Patron(String nom, String prenom, double salaire) {
        super(nom, prenom);
        this.salaire = salaire;
    }

    // Accesseurs et mutateurs (implémentation de Salaire)
    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    // Méthode toString (implémentation de Personne)
    @Override
    public String toString() {
        return "Patron [nom=" + getNom() + ", prenom=" + getPrenom() + ", salaire=" + salaire + "]";
    }

    // Méthode gains (implémentation de Salaire)
    @Override
    public double gains() {
        return salaire;
    }
   }

    // Classe TravailleurCommission implémentant Personne et Salaire
    class TravailleurCommission extends Employe {
        private double salaire;
        private double commission;
        private int quantite;

    // Constructeurs
    public TravailleurCommission() {
    }

    public TravailleurCommission(String nom, String prenom, double salaire, double commission) {
        super(nom, prenom);
        this.salaire = salaire;
        this.commission = commission;
    }

    // Accesseurs et mutateurs (implémentation de Salaire)
    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    // Méthode toString (implémentation de Personne)
    @Override
    public String toString() {
        return "TravailleurCommission [nom=" + getNom() + ", prenom=" + getPrenom() + ", salaire=" + salaire
                + ", commission=" + commission + ", quantite=" + quantite + "]";
    }

    // Méthode gains (implémentation de Salaire)
    @Override
    public double gains() {
        return salaire + commission * quantite;
    }
}

// Classe TravailleurHoraire implémentant Personne et Salaire
class TravailleurHoraire extends Employe {
    private double retribution;
    private double heures;

    // Constructeurs
    public TravailleurHoraire() {
    }

    public TravailleurHoraire(String nom, String prenom, double retribution) {
        super(nom, prenom);
        this.retribution = retribution;
    }

    // Accesseurs et mutateurs (implémentation de Salaire)
    public double getRetribution() {
        return retribution;
    }

    public void setRetribution(double retribution) {
        this.retribution = retribution;
    }

    public double getHeures() {
        return heures;
    }

    public void setHeures(double heures) {
        this.heures = heures;
    }

    // Méthode toString (implémentation de Personne)
    @Override
    public String toString() {
        return "TravailleurHoraire [nom=" + getNom() + ", prenom=" + getPrenom() + ", retribution=" + retribution
                + ", heures=" + heures + "]";
    }

    // Méthode gains (implémentation de Salaire)
    @Override
    public double gains() {
        return retribution * heures;
    }
}

// Classe de test TestEmploye
public class Ex08 {
    public static void main(String[] args) {
        // Test des classes
        Patron patron = new Patron("Dupont", "Jean", 5000);
        System.out.println(patron.toString());
        System.out.println("Salaire du patron : " + patron.gains());

        TravailleurCommission travailleurCommission = new TravailleurCommission("Martin", "Marie", 2000, 5);
        travailleurCommission.setQuantite(100);
        System.out.println(travailleurCommission.toString());
        System.out.println("Salaire du travailleur à la commission : " + travailleurCommission.gains());

        TravailleurHoraire travailleurHoraire = new TravailleurHoraire("Durand", "Pierre", 20);
        travailleurHoraire.setHeures(40);
        System.out.println(travailleurHoraire.toString());
        System.out.println("Salaire du travailleur horaire : " + travailleurHoraire.gains());
    }
}





















