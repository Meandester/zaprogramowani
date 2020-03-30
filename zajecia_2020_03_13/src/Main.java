import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

    Uczen uczen0 = new Uczen("Filip","Kowalski","15/2020", LocalDate.of(2008,12,5));
    Uczen uczen1 = new Uczen("Tomek","Nowak","16/2020", LocalDate.of(2009,12,5));
    Uczen uczen2 = new Uczen("Jan","Czombor","17/2020", LocalDate.of(2010,12,5));
    Uczen uczen3 = new Uczen("Julia","Pietek","18/2020", LocalDate.of(2011,12,5));
    Uczen uczen4 = new Uczen("Ania","Nowak","19/2020", LocalDate.of(2012,12,5));
    Uczen uczen5 = new Uczen("Róża","Bąk","20/2020", LocalDate.of(2013,12,5));

    Uczen[] uczniowieKlasa1 = new Uczen[]{uczen0,uczen1,uczen2,uczen3,uczen4,uczen5};

    Klasa klasa1 = new Klasa();
    klasa1.setKlasa("1a");
    klasa1.setProfilKlasy("Humanistyczna");
    klasa1.setUczniowie(uczniowieKlasa1);

    Klasa[] klasyWSzkole1 = new Klasa[]{klasa1};

    Szkola szkola1 = new Szkola();
    szkola1.setAdres("Poniatowskiego 50");
    szkola1.setMiasto("Szczecin");
    szkola1.setKlasy(klasyWSzkole1);

    InformacjeOSzkole informacjeOSzkole = new InformacjeOSzkole();

        System.out.println(informacjeOSzkole.ileJestKlasWSzkole(szkola1));

    informacjeOSzkole.jakieSaWSzkoleProfile(szkola1);
    informacjeOSzkole.listaUczniowKlasy(klasa1);
    }
}
