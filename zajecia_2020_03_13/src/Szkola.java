public class Szkola {
    private String adres;
    private String miasto;
    private Klasa[] klasy;

    public Szkola() {
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getMiasto() {
        return miasto;
    }

    public void setMiasto(String miasto) {
        this.miasto = miasto;
    }

    public Klasa[] getKlasy() {
        return klasy;
    }

    public void setKlasy(Klasa[] klasy) {
        this.klasy = klasy;
    }
}
