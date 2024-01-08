package TD2;

     public class Exo3 {
         public static void main(String[]Args){
         Livre l1=new Livre();
         l1.setTitre("Le Zahir");
         l1.setAuteur("Paulo coelho");
         l1.setPrix(60);
         l1.setAnnee(2005);

         Livre l2=new Livre("le zahir");
         Livre l3=new Livre("le zahir","Paulo coelho");
         Livre l4=new Livre("le zahir","paulo coelho",60);
         Livre l5=new Livre("le zahir","paulo coelho",60,2005);
         Livre l6=new Livre(l5);

             System.out.println(l1);
             System.out.println(l2);
             System.out.println(l3);
             System.out.println(l4);
             System.out.println(l5);
             System.out.println(l6);




         }}
       class Livre {
         private String titre,auteur;
         private  double prix;
         private int annee;
               //les constructeurs
          //par défaut
           public Livre() {
           }

           public Livre(String titre) {
               this.titre = titre;
           }

           public Livre(String titre, String auteur) {
               this.titre = titre;
               this.auteur = auteur;
           }

           public Livre(String titre, String auteur, double prix) {
               this.titre = titre;
               this.auteur = auteur;
               this.prix = prix;
           }

           public Livre(String titre, String auteur, double prix, int annee) {
               this.titre = titre;
               this.auteur = auteur;
               this.prix = prix;
               this.annee = annee;
           }
           public Livre(Livre l1){
               this.titre=l1.titre;
               this.auteur =l1.auteur;
               this.prix = l1.prix;
               this.annee = l1.annee;

           }

           //des accesseurs et mutateurs


           public String getTitre() {
               return titre;
           }

           public void setTitre(String titre) {
               this.titre = titre;
           }

           public String getAuteur() {
               return auteur;
           }

           public void setAuteur(String auteur) {
               this.auteur = auteur;
           }

           public double getPrix() {
               return prix;
           }

           public void setPrix(double prix) {
               this.prix = prix;
           }

           public int getAnnee() {
               return annee;
           }

           public void setAnnee(int annee) {
               this.annee = annee;
           }

           @Override
           public String toString() {
               return "Livre{" +
                       "titre='" + titre + '\'' +
                       ", auteur='" + auteur + '\'' +
                       ", prix=" + prix +
                       ", annee=" + annee +
                       '}';
           }
       }
