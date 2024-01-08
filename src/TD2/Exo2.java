package TD2;

      public class Exo2 {
          public static void main(String[]Args){
              Point1 p1=new Point1();
              p1.setNom('A');
              p1.setX(3);
              p1.setY(20);
              p1.norme();
              System.out.println(p1);
              Point1 p2=new Point1('B',4,5.6);
              p2.norme();
              System.out.println(p2);
          }

      }
      class Point1{
          private char nom;
          private double x,y;

          public Point1() {
          }

          public Point1(char nom, double x, double y) {
              this.nom = nom;
              this.x = x;
              this.y = y;
          }

          public char getNom() {
              return nom;
          }

          public void setNom(char nom) {
              this.nom = nom;
          }

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
          public double norme(){
              return Math.sqrt(x*x+y*y);
          }

          @Override
          public String toString() {
              return "Point:" +
                      "nom:" + nom +
                      ", x:" + x +
                      ", y:" + y +" ,norme="+norme()+
                      '}';
          }
      }