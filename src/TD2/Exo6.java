package TD2;

public class Exo6 { public static void main(String[] args){
    Banque compte=new Banque(1, 5000.75F,"AB 1200");
    System.out.println(compte);
    System.out.println(compte.getSolde());
    compte.deposer(500);
    System.out.println(compte);
    System.out.println(compte.getSolde());
    compte.retirer(200);
    System.out.println(compte);
    System.out.println(compte.getSolde());

}
}
class Banque{
    int Ncompte;
    double Solde;
    String CIN;
    Banque (int Ncompte,float Solde,String CIN){
        this.Ncompte=Ncompte;
        this.Solde=Solde;
        this.CIN=CIN;
    }

    public int getNcompte() {
        return Ncompte;
    }

    public void setNcompte(int Ncompte) {
        Ncompte = Ncompte;
    }

    public double getSolde() {
        return Solde;
    }

    public void setSolde(float Solde) {
        Solde = Solde;
    }

    public String getCIN() {
        return CIN;
    }

    public void setCIN(String CIN) {
        this.CIN = CIN;
    }
    void deposer(float Somme){
        this. Solde+=Somme;
    }
    void retirer(float Somme){
        this.Solde-=Somme;
    }

    @Override
    public String toString() {
        return "Banque{" +
                "Ncompte=" + Ncompte +
                ", Solde=" + Solde +
                ", CIN='" + CIN + '\'' +
                '}';
    }
}

