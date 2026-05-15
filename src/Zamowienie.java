import java.util.ArrayList;

public class Zamowienie {

    private int numerZamowienia;
    private KlientKawiarni klient;
    private ArrayList<ProduktMenu> produkty;
    private boolean oplacone;
    private static int kolejnyNumer;

    public Zamowienie(KlientKawiarni klient) {
        kolejnyNumer++;
        this.numerZamowienia = kolejnyNumer;

        this.klient = klient;
        this.produkty = new ArrayList<>();
        this.oplacone = false;
    }

    public int getNumerZamowienia() {
        return numerZamowienia;
    }

    public KlientKawiarni getKlient() {
        return klient;
    }

    public ArrayList<ProduktMenu> getProdukty() {
        return produkty;
    }

    public boolean isOplacone() {
        return oplacone;
    }

    public static int getKolejnyNumer() {
        return kolejnyNumer;
    }

    public void dodajProdukt(ProduktMenu produkt) {
        produkty.add(produkt);
    }

    public double policzWartosc(){
        double suma = 0.0;
        for (ProduktMenu produkt : produkty) {
            double cena = produkt.getCena();
            suma += cena;
        }
        return suma;
    }

    public int policzLiczbeProduktow(){
        return produkty.size();
    }

    public void oznaczJakoOplacone(){
        this.oplacone = true;
    }

    public static int pobierzKolejnyNumer(){
        return kolejnyNumer;
    }

    @Override
    public String toString() {
        String listaProduktow = "";
        for (ProduktMenu produkt : produkty) {
            listaProduktow += "\n- " + produkt.getNazwa() + " " + produkt.getCena();
        }
        return "Zamowienie Nr: " + numerZamowienia +
                "\nKlient: " + klient.getImie() + " " + klient.getNazwisko() +
                "\nProdukty: " + listaProduktow +
                "\nWartosc zamowienia: " + policzWartosc() +
                "\nStatus zamowienia: " + (oplacone ? "Oplacone" : "Nieoplacone");
    }
}


