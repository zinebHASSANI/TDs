package TD3;

    public class Exo6 {


        public static void main(String[] args) {
            // Test du Disque
            Disque disque1 = new Disque();
            System.out.println(disque1.toString());
            System.out.println("Périmètre : " + disque1.getPerimeter());
            System.out.println("Aire : " + disque1.getArea());

            Disque disque2 = new Disque(new PointC(3, 4), 2.5, "Mon Disque");
            System.out.println(disque2.toString());
            System.out.println("Périmètre : " + disque2.getPerimeter());
            System.out.println("Aire : " + disque2.getArea());

            // Test du Rectangle
            Rectangle rectangle = new Rectangle(5, 7);
            System.out.println(rectangle.toString());
            System.out.println("Périmètre : " + rectangle.getPerimeter());
            System.out.println("Aire : " + rectangle.getArea());
        }
    }

abstract class Figure {
            String nom;

            // Méthode abstraite pour calculer le périmètre de la figure
            public abstract double getPerimeter();

            // Méthode abstraite pour calculer l'aire de la figure
            public abstract double getArea();

            // Méthode toString pour obtenir une représentation de la figure
            @Override
            public String toString() {
                return "Figure [nom=" + nom + "]";
            }
        }

        class Disque extends Figure {
            private PointC centre;
            private double rayon;

            // Constructeur par défaut
            public Disque() {
                this.centre = new PointC(0, 0);
                this.rayon = 1.0;
                this.nom = "Disque";
            }

            // Constructeur avec centre et rayon
            public Disque(PointC centre, double rayon) {
                this.centre = centre;
                this.rayon = rayon;
                this.nom = "Disque";
            }

            // Constructeur avec centre, rayon et nom
            public Disque(PointC centre, double rayon, String nom) {
                this.centre = centre;
                this.rayon = rayon;
                this.nom = nom;
            }

            // Accesseurs et mutateurs
            public PointC getCentre() {
                return centre;
            }

            public void setCentre(PointC centre) {
                this.centre = centre;
            }

            public double getRayon() {
                return rayon;
            }

            public void setRayon(double rayon) {
                this.rayon = rayon;
            }

            // Implémentation des méthodes abstraites de la classe Figure
            @Override
            public double getPerimeter() {
                return 2 * Math.PI * rayon;
            }

            @Override
            public double getArea() {
                return Math.PI * Math.pow(rayon, 2);
            }

            // Surcharge de la méthode toString pour inclure les détails spécifiques au Disque
            @Override
            public String toString() {
                return "Disque [nom=" + nom + ", centre=" + centre + ", rayon=" + rayon + "]";
            }
        }

        class Rectangle extends Figure {
            private double longueur;
            private double largeur;

            // Constructeur par défaut
            public Rectangle() {
                this.longueur = 1.0;
                this.largeur = 1.0;
                this.nom = "Rectangle";
            }

            // Constructeur avec longueur et largeur
            public Rectangle(double longueur, double largeur) {
                this.longueur = longueur;
                this.largeur = largeur;
                this.nom = "Rectangle";
            }

            // Constructeur avec longueur, largeur et nom
            public Rectangle(double longueur, double largeur, String nom) {
                this.longueur = longueur;
                this.largeur = largeur;
                this.nom = nom;
            }

            // Accesseurs et mutateurs
            public double getLongueur() {
                return longueur;
            }

            public void setLongueur(double longueur) {
                this.longueur = longueur;
            }

            public double getLargeur() {
                return largeur;
            }

            public void setLargeur(double largeur) {
                this.largeur = largeur;
            }

            // Implémentation des méthodes abstraites de la classe Figure
            @Override
            public double getPerimeter() {
                return 2 * (longueur + largeur);
            }

            @Override
            public double getArea() {
                return longueur * largeur;
            }

            // Surcharge de la méthode toString pour inclure les détails spécifiques au Rectangle
            @Override
            public String toString() {
                return "Rectangle [nom=" + nom + ", longueur=" + longueur + ", largeur=" + largeur + "]";
            }
        }

        // Point utilisé pour représenter le centre d'un disque
        class PointC {
            private double x;
            private double y;

            public PointC(double x, double y) {
                this.x = x;
                this.y = y;
            }

            @Override
            public String toString() {
                return "(" + x + ", " + y + ")";
            }
        }







