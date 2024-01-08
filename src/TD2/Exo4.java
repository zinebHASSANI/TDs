package TD2;

public class Exo4 {
    public static void main(String[] args) {
        Temps temps1 = new Temps();
        System.out.println(temps1);
        Temps temps2=new Temps(12);
        System.out.println( "l'heure est :"+temps2.getHeures());
        Temps temps3=new Temps(18,8);
        System.out.println(temps3);
        Temps temps4= new Temps (21,70,60);
        System.out.println(temps4);
        Temps temps5=new Temps(temps4);
        System.out.println(temps5);
        temps4.ajoutHeures(0);
        temps4.ajoutMinutes(0);
        temps4.ajoutSecondes(1);
        System.out.println( temps4);

    }
}

class Temps {
    private int heures;
    private int minutes;
    private int secondes;

    // Constructeur par défaut
    Temps() {
    }

    // Constructeur avec heures seulement
    Temps(int heures) {
        this.heures= heures;
    }

    // Constructeur avec heures et minutes
    Temps(int heures, int minutes) {
        this.heures=heures;
        this.minutes=minutes;
    }

    // Constructeur avec heures, minutes et secondes
    Temps(int heures, int minutes, int secondes) {
        this.heures = heures;
        this.minutes = minutes;
        this.secondes = secondes;
    }

    // Constructeur de copie
    Temps(Temps temps) {
        this(temps.heures, temps.minutes, temps.secondes);
    }

    public int getHeures() {
        return heures;
    }

    public void setHeures(int heures) {
        this.heures = heures;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSecondes() {
        return secondes;
    }

    public void setSecondes(int secondes) {
        this.secondes = secondes;
    }
    void ajoutHeures(int heures){
        this.heures+=heures;
        this.heures %=24;
    }
    void ajoutMinutes(int minutes){
        this.minutes+=minutes;
        this.heures+=this.minutes/60;
        this.minutes%=60;
        this.heures%=24;
    }
    void ajoutSecondes(int secondes ){
        this.secondes +=secondes;
        this.minutes+= this.secondes/60;
        this.heures+=this.minutes/60;
        this.secondes%=60;
        this.minutes%=60;
        this.heures%=24;
    }


    @Override
    public String toString() {
        return "Temps: " + String.format("%02d", heures) +
                ":" + String.format("%02d", minutes) +
                ":" + String.format("%02d", secondes);
    }
}

