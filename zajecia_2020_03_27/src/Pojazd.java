public class Pojazd {
    int pasazerowie; //liczba pasażerów
    int pojemnoscZbiornikaPaliwa; // pojemność zbiornika w litrach
    double lkm; // zużycie paliwa w litrach na 100 kilometrów

    // pusty kontruktor inicjalizujący klasę
    public Pojazd() {
    }

    // konstruktor wykorzystywany przy tworzeniu obiektu razem z trzema parametrami
    public Pojazd(int pasazerowie, int pojemnoscZbiornikaPaliwa, double lkm) {
        // przypisanie parametru int pasażerowie do zmiennej składowej klasy int pasażerowie
        // przedrostek this oznacza, że przypisujemy do zmiennej w tej klasie
        this.pasazerowie = pasazerowie;
        this.pojemnoscZbiornikaPaliwa = pojemnoscZbiornikaPaliwa;
        this.lkm = lkm;
    }

    //metoda zasieg zwracajaca ile kilometrow przejedzie pojazd, bez parametru
    int zasieg(){
        int wynik =(int) (pojemnoscZbiornikaPaliwa / lkm * 100);
        return wynik;
    }

    //metoda void wykonująca operację wydruku do konsoli z ciała metody
    void danePojazdu() {
        System.out.println("Pojazd{" +
                "pasazerowie=" + pasazerowie +
                ", pojemnoscZbiornikaPaliwa=" + pojemnoscZbiornikaPaliwa +
                ", lkm=" + lkm +
                '}');
    }

    //metody z zajęć:
    void zasiegVoid(){
        System.out.println((int) (pojemnoscZbiornikaPaliwa / lkm * 100) + " km");
    }

    void zasiegSprawdzenieVoid(int pojemnoscZbiornikaPaliwa, double lkm){
        System.out.println("miniVan zasięg z parametrów void: " + (int) (pojemnoscZbiornikaPaliwa / lkm * 100) + " km");
    }

    int zasiegSprawdzenie(int pojemnoscZbiornikaPaliwa, double lkm){
        int wynik =(int) (pojemnoscZbiornikaPaliwa / lkm * 100);
        return wynik;
    }
}
