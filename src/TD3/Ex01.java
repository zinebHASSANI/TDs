package TD3;

public class Ex01 {
    public static void main(String[] args) {
        // Création d'un objet PointA
        PointA pointA = new PointA();

        pointA.Point(3,5);
        pointA.deplace(5, 2);

        // Utilisation de la méthode affiche de la classe PointA
        pointA.affiche();
    }
}

class  Point {
    private int x, y;

    // Constructeur correct
    public void Point(int x,int y){
        this.x=x;
        this.y=y;
    }

    public void deplace(int dx, int dy) {
        x += dx;
        y += dy;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
class PointA extends Point1 {


    // Méthode pour afficher les coordonnées du point
    public void affiche() {
        System.out.println("Coordonnées du point : (" + getX() + ", " + getY() + ")");
    }
}


