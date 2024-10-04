public class Produkt {
    private  String nazwa;
    private  double cena;
    private  boolean dostepne;

    public Produkt(String nazwa, double cena, boolean dostepne) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.dostepne = dostepne;
    }

    public String getNazwa() {
        return nazwa;
    }

    public double getCena() {
        return cena;
    }

    public boolean isDostepne() {
        return dostepne;
    }
}


