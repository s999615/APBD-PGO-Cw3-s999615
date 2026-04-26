public class ProduktMenu {

    private String kod;
    private String nazwa;
    private double cena;
    private String kategoria;
    private static int liczbaProduktow;

    public ProduktMenu(String kod, String nazwa, double cena, String kategoria) {
        this.kod = kod;
        this.nazwa = nazwa;
        this.cena = cena;
        this.kategoria = kategoria;

        liczbaProduktow++;
    }

    public String getKod() {
        return kod;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public String getKategoria() {
        return kategoria;
    }

    public void setKategoria(String kategoria) {
        this.kategoria = kategoria;
    }
    

    public static int pokazLiczbaProduktow() {
        return liczbaProduktow;
    }

    @Override
    public String toString() {
        return "Kod: " + kod + "Nazwa: " + nazwa + "Cena: " + cena + " zl " + "Kategoria: " + kategoria;
    }

    @Override
    public boolean equals(Object obj) {
        // Krok 1: Czy porównuję obiekt z samym sobą?
        if (this == obj) return true;

        // Krok 2: Czy obj jest null lub innego typu?
        if (obj == null || getClass() != obj.getClass()) return false;

        // Krok 3: Rzutowanie — wiemy już, że obj jest typu Student
        ProduktMenu other = (ProduktMenu) obj;

        // Krok 4: Porównanie pól decydujących o "równości"
        return this.kod.equals(other.kod);
    }
}
