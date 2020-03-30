import java.time.LocalDate;

public class Uczen {
    private String imie;
    private String nazwisko;
    private String numerLegitymacji;
    private LocalDate dataUrodzenia;

    public Uczen(String imie, String nazwisko, String numerLegitymacji, LocalDate dataUrodzenia) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numerLegitymacji = numerLegitymacji;
        this.dataUrodzenia = dataUrodzenia;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getNumerLegitymacji() {
        return numerLegitymacji;
    }

    public LocalDate getDataUrodzenia() {
        return dataUrodzenia;
    }
}
