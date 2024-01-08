package TD3;

public class Ex02 {

    public static void main(String[] args) {

        PointNom pointAvecNom = new PointNom();



        pointAvecNom.setPointNom(7, 9, 'B');
        pointAvecNom.setNom('D');



        pointAvecNom.affCoordNom();
    }
}


class Pointt {
    private int x, y;


    public  void Point(int x,int y) {
        this.x = x;
        this.y = y;
    }




    public void deplace(int dx, int dy) {
        x += dx;
        y += dy;
    }

    public void affich() {
        System.out.println("Coordonnees : " + x + "," + y);
    }
}
class PointNom extends Pointt {
    public char nom;



    public PointNom() {
        super();
        this.nom = ' ';
    }

    // Méthode pour définir les coordonnées et le nom
    public void setPointNom(int x, int y, char nom) {
        super.deplace(x, y);
        this.nom = nom;
    }

    // Méthode pour définir seulement le nom
    public void setNom(char nom) {
        this.nom = nom;
    }

    // Méthode pour afficher les coordonnées et le nom
    public void affCoordNom() {
        super.affich()  ;
        System.out.println("Nom : " + nom);
    }
}
