package TD3;





interface Figure1 {
    double getPerimeter();
    double getAire ();
    String toString();
}

// Classe abstraite FigureAbstraite implémentant l'interface Figure
abstract class FigureAbstraite implements Figure1 {
    protected String nom;

    // Constructeur par défaut
    public FigureAbstraite() {
    }

    // Constructeur avec nom
    public FigureAbstraite(String nom) {
        this.nom = nom;
    }

    // Accesseurs et mutateurs pour le nom
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}

// Classe Disque héritant de FigureAbstraite
class Disque1 extends FigureAbstraite {
    private PointD centre;
    private double rayon;

    // Constructeurs
    public Disque1() {
    }

    public Disque1(PointD centre, double rayon) {
        this.centre = centre;
        this.rayon = rayon;
    }

    public Disque1(PointD centre, double rayon, String nom) {
        super(nom);
        this.centre = centre;
        this.rayon = rayon;
    }

    // Accesseurs et mutateurs pour le centre et le rayon
    public PointD getCentre() {
        return centre;
    }

    public void setCentre(PointD centre) {
        this.centre = centre;
    }

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    // Implémentation des méthodes de l'interface Figure
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * rayon;
    }

    @Override
    public double getAire() {
        return Math.PI * rayon * rayon;
    }

    @Override
    public String toString() {
        return "Disque [nom=" + nom + ", centre=" + centre + ", rayon=" + rayon + "]";
    }
}

// Classe Rectangle héritant de FigureAbstraite
class Rectangle1 extends FigureAbstraite {
    private double longueur;
    private double largeur;

    // Constructeurs
    public Rectangle1() {
    }

    public Rectangle1(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public Rectangle1(double longueur, double largeur, String nom) {
        super(nom);
        this.longueur = longueur;
        this.largeur = largeur;
    }

    // Accesseurs et mutateurs pour la longueur et la largeur
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

    // Implémentation des méthodes de l'interface Figure
    @Override
    public double getPerimeter() {
        return 2 * (longueur + largeur);
    }

    @Override
    public double getAire() {
        return longueur * largeur;
    }

    @Override
    public String toString() {
        return "Rectangle [nom=" + nom + ", longueur=" + longueur + ", largeur=" + largeur + "]";
    }
}

// Classe Point représentant un point dans l'espace
class PointD {
    private double x;
    private double y;

    // Constructeurs
    public PointD(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Accesseurs et mutateurs pour x et y
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    // Méthode toString pour afficher les coordonnées du point
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

// Classe de test TestFigure
public class Ex082 {
    public static void main(String[] args) {
        // Test des classes
        Disque1 disque = new Disque1(new PointD(3,5), 5, "Cercle A");
        System.out.println(disque.toString());
        System.out.println("Perimètre du disque : " + disque.getPerimeter());
        System.out.println("Aire du disque : " + disque.getAire());

        Rectangle1 rectangle = new Rectangle1(3, 4, "Rectangle B");
        System.out.println(rectangle.toString());
        System.out.println("Perimètre du rectangle : " + rectangle.getPerimeter());
        System.out.println("Aire du rectangle : " + rectangle.getAire());
    }
}
