package TD2;

        public class Exo1 {
            public static void main(String[]Args){
                Point p1=new Point('A',5.2);
                p1.affich();
                p1.translate(4);
                p1.affich();
            }
}
        class Point{
            char nom;
            double abscisse;

            public Point(char nom, double abscisse) {
                this.nom = nom;
                this.abscisse = abscisse;
            }
            public void affich(){
                System.out.println("le nom est :"+nom+",l'abscisse est:"+abscisse);
            }
            public double translate(double x){
                 return this.abscisse+=x;
            }

        }
