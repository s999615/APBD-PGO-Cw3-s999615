public class KlientKawiarni {

    private int idKlienta;
    private String imie;
    private String nazwisko;
    private String email;

    public KlientKawiarni(int idKlienta, String imie, String nazwisko, String email) {
        this.idKlienta = idKlienta;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.email = email;
    }


    public int getIdKlienta() {
        return idKlienta;
    }

    public void setIdKlienta(int idKlienta) {
        this.idKlienta = idKlienta;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String PokazDaneKlienta() {
        return "ID: " + idKlienta + "Imie: " + imie + "Nazwisko: " + nazwisko + "E-mail: " + email;
    }

    @Override
    public String toString() {
        return "ID: " + idKlienta + "Imie: " + imie + "Nazwisko: " + nazwisko + "E-mail: " + email;
    }

    @Override
    public boolean equals(Object obj) {
        // Krok 1: Czy porównuję obiekt z samym sobą?
        if (this == obj) return true;

        // Krok 2: Czy obj jest null lub innego typu?
        if (obj == null || getClass() != obj.getClass()) return false;

        // Krok 3: Rzutowanie — wiemy już, że obj jest typu Student
        KlientKawiarni other = (KlientKawiarni) obj;

        // Krok 4: Porównanie pól decydujących o "równości"
        return this.idKlienta == other.idKlienta
                || this.email.equals(other.email);
    }

}
