     package TD3;

     abstract class Employe1 {
         private String nom;
         private String prenom;


         public Employe1() {
         }

         public Employe1(String nom, String prenom) {
             this.nom = nom;
             this.prenom = prenom;
         }


         public String getNom() {
             return nom;
         }

         public void setNom(String nom) {
             this.nom = nom;
         }

         public String getPrenom() {
             return prenom;
         }

         public void setPrenom(String prenom) {
             this.prenom = prenom;
         }


         @Override
         public String toString() {
             return "Employe [nom=" + nom + ", prenom=" + prenom + "]";
         }

         public abstract double gains();
     }


     class Patron1 extends Employe1 {
         private double salaire;

         public Patron1() {
         }

         public Patron1(String nom, String prenom, double salaire) {
             super(nom, prenom);
             this.salaire = salaire;
         }

         public double getSalaire() {
             return salaire;
         }

         public void setSalaire(double salaire) {
             this.salaire = salaire;
         }


         @Override
         public String toString() {
             return "Patron [nom=" + getNom() + ", prenom=" + getPrenom() + ", salaire=" + salaire + "]";
         }

         @Override
         public double gains() {
             return salaire;
         }
     }

     class TravailleurCommission1 extends Employe1 {
         private double salaire;
         private double commission;
         private int quantite;


         public TravailleurCommission1() {
         }

         public TravailleurCommission1(String nom, String prenom, double salaire, double commission) {
             super(nom, prenom);
             this.salaire = salaire;
             this.commission = commission;
         }


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

         // Méthodes
         @Override
         public String toString() {
             return "TravailleurCommission [nom=" + getNom() + ", prenom=" + getPrenom() + ", salaire=" + salaire
                     + ", commission=" + commission + ", quantite=" + quantite + "]";
         }

         @Override
         public double gains() {
             return salaire + commission * quantite;
         }
     }


     class TravailleurHoraire1 extends Employe1 {
         private double retribution;
         private double heures;


         public TravailleurHoraire1() {
         }

         public TravailleurHoraire1(String nom, String prenom, double retribution) {
             super(nom, prenom);
             this.retribution = retribution;
         }


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

         // Méthodes
         @Override
         public String toString() {
             return "TravailleurHoraire [nom=" + getNom() + ", prenom=" + getPrenom() + ", retribution=" + retribution
                     + ", heures=" + heures + "]";
         }

         @Override
         public double gains() {
             return retribution * heures;
         }
     }

     // Classe de test TestEmploye
     public class Ex07{
         public static void main(String[] args) {

             Patron1 p = new Patron1("DALE", "jack", 20000);
             System.out.println(p.toString());
             System.out.println("Salaire du patron : " + p.gains());

             TravailleurCommission travailleurCommission = new TravailleurCommission("lila", "lila", 12000, 4);
             travailleurCommission.setQuantite(100);
             System.out.println(travailleurCommission.toString());
             System.out.println("Salaire du travailleur à la commission : " + travailleurCommission.gains());
         }}



























