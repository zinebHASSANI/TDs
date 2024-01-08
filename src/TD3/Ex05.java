package TD3;

public class Ex05 {


        public static void main(String[] args) {
            Vehicule voiture = new Vehicule(4);
            System.out.println(voiture.toString());

            Moto moto = new Moto(55);
            System.out.println(moto.toString());

            Avion avion1 = new Avion(150);
            System.out.println(avion1.toString());

            Avion avion2 = new Avion(200, 4);
            System.out.println(avion2.toString());

            Triporteur triporteur = new Triporteur(5);
            System.out.println(triporteur.toString());
        }
    }
    // Classe Vehicule
    class Vehicule {
        private int nbPassager;

        // Constructeur
        public Vehicule(int n) {
            nbPassager = n;
        }

        // Méthode toString
        public String toString() {
            return "Nombre de passagers : " + nbPassager;
        }
    }

    // Classe Moto héritant de Vehicule
    class Moto extends Vehicule {
        private int nbRoues = 2;
        public Moto (int n){
            super(n);
        }


    }

    // Classe Avion héritant de Vehicule
    class Avion extends Vehicule {
        private int nbMoteur;

        // Constructeur avec un paramètre
        public Avion(int nbP) {
            super(nbP); // Appel du constructeur de la classe parente
        }

        // Constructeur avec deux paramètres
        public Avion(int nbP, int nbM) {
            super(nbP); // Appel du constructeur de la classe parente
            nbMoteur = nbM;
        }
    }

    // Classe Triporteur héritant de Moto
    class Triporteur extends Moto {
        public Triporteur (int n){
            super(n);
        }


    }





