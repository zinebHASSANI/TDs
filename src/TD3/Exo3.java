package TD3;

    public class Exo3 {
    public static void main(String[] args) {

        Cercle A = new Cercle(3,6,'c',5);
        A.affiche();
    }
   }


            class Pointn {
    public Pointn(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void affCoord() {
        System.out.println("Coordonnees : " + x + "," + y);
    }
    public void affiche() {
        System.out.println("Coordonnees : " + x + "," + y);
    }
    private int x, y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
   }
    class Centre extends Pointn {

    public char Nom;
    public Centre (int x,int y,char Nom){ super(x,y);
        this.Nom=Nom;}
    public void affNom(){
        System.out.println("Nom:"+Nom);
    }
    @Override
    public void affiche() {
        affNom();
        super.affiche();
           }
      }

    class Cercle  extends Centre{
    private int rayon;
    public Cercle (int x,int y,char Nom,int rayon){ super(x,y,Nom);
        this.rayon=rayon;
    }

    @Override
    public void affiche() {
        super.affiche();
        System.out.println("rayon="+rayon);
    }
}










