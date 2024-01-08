package TD3;

   public class Exo4 {

       public static void main(String[] args) {


           Batiment batiment = new Batiment("40 Rue hassan2");
           System.out.println(batiment);

           // Test Maison
           Maison maison = new Maison("67 Avenue mohammed6", 4);
           System.out.println(maison);

           // Test Immeuble
           Immeuble immeuble = new Immeuble("777 RUE 5", 5);
           System.out.println(immeuble);
       }
   }
class Batiment {
    private String adresse;

    public Batiment() {
    }

    public Batiment(String adresse) {
        this.adresse = adresse;
    }


    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "Bâtiment [adresse=" + adresse + "]";
    }
}

class Maison extends Batiment {
    private int nbChambres;

    public Maison() {

    }

    public Maison(String adresse, int nbChambres) {
        super(adresse);
        this.nbChambres = nbChambres;
    }

    // Accesseurs et mutateurs pour le nombre de chambres
    public int getNbChambres() {
        return nbChambres;
    }

    public void setNbChambres(int nbChambres) {
        this.nbChambres = nbChambres;
    }

    @Override
    public String toString() {
        return "Maison [adresse=" + getAdresse() + ", nbChambres=" + nbChambres + "]";
    }
}

class Immeuble extends Batiment {
    private int nbAppart;

    public Immeuble() {

    }

    public Immeuble(String adresse, int nbAppart) {
        super(adresse);
        this.nbAppart = nbAppart;
    }

    // Accesseurs et mutateurs pour le nombre d'appartements
    public int getNbAppart() {
        return nbAppart;
    }

    public void setNbAppart(int nbAppart) {
        this.nbAppart = nbAppart;
    }

    @Override
    public String toString() {
        return "Immeuble [adresse=" + getAdresse() + ", nbAppart=" + nbAppart + "]";
    }
}



