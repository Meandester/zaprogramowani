//package MateuszStankiewicz;

/*
 *Zad 2 - W systemie rejestrującym na zawody z łucznictwa dla młodzieży należy napisać
 *  program sprawdzający do jakiej klasy strzeleckiej ma być przypisany uczestnik.
 * Napisz program w którym będziesz podawał: wiek, płeć, imię.
 * Jeżeli będziesz chłopcem poniżej 16 roku życia a powyżej
 * lub równy 12 lat w konsoli ma być wyświetlony tekst:
 * Klasa: junior, [imię uczestnika], grupa chłopców.
 * Jeżeli będziesz chłopcem poniżej 18 roku życia a powyżej lub w wieku 16 lat w
 * konsoli ma być wyświetlony tekst:
 * Klasa: mid, [imię uczestnika], grupa chłopców.
 * Poniżej 12 roku ma być komunikat, jesteś za młody na te zawody
 * spróbuj za [ilość lat kiedy osiągnie minimalny wiek uczestnika]
 * Powyżej lub równy 18 lat jesteś już za stary na zawody młodzieżowe!
 */

/*
 * Do poprawienia:
 * zmień nazwy wszystkich zmiennych tak aby nie używały polskich znaków np.: płeć
 */

/*
 * Dodatkowa treść cz1:
 * zamiast przypisywać zmienne w programie typu płeć, imię, wiek, podaj je w konsoli wykorzystując scanner
 * skorzystaj z poradnika: https://javastart.pl/baza-wiedzy/java-podstawy-jezyka/podstawowe-wejscie-wyjscie
 * będziesz mógł wpisywać dane z konsoli.
 * Dodaj objaśnienia jakie dane można wpisać dla użytkownika.
 * W razie pytań pisz.
 */

/*
 * Dodatkowa treść cz2:
 * utwórz klasę poprzez polecenie javac z konsoli i urochom ją z konsoli.
 * w razie pytań pisz
 */

public class Zad2 {
    public static void main(String[] args) {
        //            \/\/\/-tu wpisz "chłopak" lub "dziewczyna"
        String płeć = "chłopak";
        String imię = "Mateusz Stankiewicz";
        int wiek = 17;
        if (wiek >= 0) {
            if (wiek < 12) {
                int wiekmały = 12 - wiek;
                System.out.println("Masz dopiero " + wiek + " lat, spróbuj za " + wiekmały + " lat!");
            }
        }
        if (wiek < 0) {
            System.out.println("NIE DA SIĘ MIEĆ " + wiek + " LAT!!!");
        }
        if (wiek >= 18) {
            System.out.println("Jesteś już za stary!");
        }
        if (płeć != "chłopak") {
            if (płeć != "dziewczyna") {
                System.out.println("NIE MA TAKIEJ PŁCI JAK ,," + płeć + "''!!!");
            }
        }
        if (wiek >= 12) {
            if (wiek < 18) {
                if (płeć == "chłopak" || płeć == "dziewczyna") {
                    if (wiek >= 12) {
                        if (wiek < 16) {
                            System.out.print("Klasa: Junior, ");
                        }
                    }
                    if (wiek >= 16) {
                        if (wiek < 18) {
                            System.out.print("Klasa: Mid, ");
                        }
                    }
                    System.out.print(imię + ", ");
                    if (płeć == "chłopak") {
                        System.out.println("grupa chłopców.");
                    }
                    if (płeć == "dziewczyna") {
                        System.out.println("grupa dziewcząt.");
                    }
                }
            }
        }
    }
}