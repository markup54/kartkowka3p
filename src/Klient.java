import java.util.ArrayList;

public class Klient {
    private String imie;
    private String nazwisko;
    private ArrayList<Zamowienie> zamowienia;

    public Klient(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        zamowienia = new ArrayList<>();
    }

    public void dodajZamowienie (Zamowienie zamowienie){
        zamowienia.add(zamowienie);
    }

    public double obliczIleZaplacil(){
        double c=0;
        for (int i = 0; i < zamowienia.size(); i++) {
            c =c +zamowienia.get(i).cenaZamowienia();
        }
        return c;
    }
}
