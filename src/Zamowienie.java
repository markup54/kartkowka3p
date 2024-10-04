import java.util.ArrayList;

public class Zamowienie {
    private ArrayList<Produkt> produkty;

    public Zamowienie() {
        produkty = new ArrayList<>();
    }

    public void dodajProdukt (Produkt produkt){
        if(produkt.isDostepne())
        produkty.add(produkt);
    }

    public double cenaZamowienia(){
        double c =0;
        for (Produkt produkt: produkty
             ) {
            c= c+produkt.getCena();
        }
        return c;
    }
}
