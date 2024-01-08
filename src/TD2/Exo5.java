package TD2;

public class Exo5 {public static void main(String[] args) {
    Rectangle rectangle1=new Rectangle ();
    System.out.println(rectangle1);
    Rectangle rectangle2=new Rectangle (6,7);
    System.out.println(rectangle2);

    Rectangle rectangle3=new Rectangle (rectangle2);
    System.out.println(rectangle3);
    System.out.println("le perimètre ="+ rectangle2.perimetre());
    System.out.println("l'aire ="+ rectangle2.aire());
    rectangle2.isCarre();
}
}
class Rectangle {
    double longueur;
    double largeur;
    Rectangle() {};
    Rectangle(double longueur,double largeur){
        this.longueur=longueur;
        this.largeur=largeur;
    }
    Rectangle(Rectangle rectangle ){
        this.longueur= rectangle.getLongueur();
        this.largeur=rectangle.getLargeur();
    }

    double getLongueur() {
        return longueur;
    }

    void setLongueur(double longueur) {
        this.longueur = longueur;
    }

    double getLargeur() {
        return largeur;
    }

    void setLargeur(double largeur) {
        if(largeur>0)
            this.largeur = largeur;
    }
    double perimetre(){ return 2*(largeur + longueur );
    }
    double aire(){return largeur*longueur;}
    void isCarre(){if (longueur == largeur)
        System.out.println("ce rectangle est un carré");
    else System.out.println("ce rectangle n' est  pas un carré");}


    @Override
    public String toString() {
        return "Rectangle{" +
                "longueur=" + longueur +
                ", largeur=" + largeur +
                '}';
    }
}

