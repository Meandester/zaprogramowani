public class Klasa {
    private String profilKlasy;
    private String klasa;
    private Uczen[] uczniowie;

    public Klasa(){

    }

    public Klasa(String profilKlasy, String klasa, Uczen[] uczniowie) {
        this.profilKlasy = profilKlasy;
        this.klasa = klasa;
        this.uczniowie = uczniowie;
    }

    public String getProfilKlasy() {
        return profilKlasy;
    }

    public void setProfilKlasy(String profilKlasy) {
        this.profilKlasy = profilKlasy;
    }

    public String getKlasa() {
        return klasa;
    }

    public void setKlasa(String klasa) {
        this.klasa = klasa;
    }

    public Uczen[] getUczniowie() {
        return uczniowie;
    }

    public void setUczniowie(Uczen[] uczniowie) {
        this.uczniowie = uczniowie;
    }
}
