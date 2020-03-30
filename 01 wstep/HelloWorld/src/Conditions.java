public class Conditions {
    public static void main(String[] args) {
        /*
         *Zad 1 - Do systemu weryfikującego gości do lokalu dla dorosłych należy
         * dodać funkcjonalność sprawdzania wieku:
         * napisz program w którym będziesz podawał wiek (int wiekOsoby)
         * i sprawdzał czy jest on większy lub równy 18 roku życia.
         * Jeżeli wiek uczestnika będzie większy wydrukuj do konsoli:
         * "możesz wejść do lokalu", jeżeli nie to ma podać informację:
         * "jesteś jeszcze za młody"
         */
        {
            int wiekOsoby = 6;
            int adultAge = 18;

            if (adultAge <= wiekOsoby) {
                System.out.println("Możesz wejść do lokalu");
            } else {
                System.out.println("Jesteś jeszcze za młody");
            }
        }
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
        {

            int wiek = 8;
            String imie = "Tomek";
            String plec = "M";

            String grupaM = " Grupa chlopców";

            if (wiek < 16) {
                if (wiek >= 12) {
                    System.out.println("Klasa Junior, imie: " + imie + grupaM);
                } else if (wiek < 12) {
                    int zaIleLat = 12 - wiek;
                    System.out.println("Spróbuj za " + zaIleLat + " lata");
                }
            } else if (wiek < 18) {
                if (wiek >= 16) {
                    System.out.println("Klasa Mid, imie: " + imie + grupaM);
                }
            }

        }

        /*
         *Zad 3 - napisz program w którym można podać cyfry od 1 do 5, w zależności od podanej cyfry na ekranie ma
         * się wyświetlić:
         * podana cyfrą jest [nazwa podanej cyfry od 1 do 10]
         * Jeżeli cyfra jest poza zasięgiem to:
         * podana cyfrą jest z poza zasięgu od 1 do 5. Cyfra to: [podana cyfra]
         */

        {

            int cyfra = 8;

            switch (cyfra) {
                case 1:
                    System.out.println("podaną cyfrą jest " + cyfra);
                    break;
                case 2:
                    System.out.println("podaną cyfrą jest " + cyfra);
                    break;
                case 3:
                    System.out.println("podaną cyfrą jest " + cyfra);
                    break;
                case 4:
                    System.out.println("podaną cyfrą jest " + cyfra);
                    break;
                case 5:
                    System.out.println("podaną cyfrą jest " + cyfra);
                    break;
                default:
                    System.out.println("podana cyfrą jest z poza zasięgu od 1 do 5. Cyfra to: " + cyfra);
                    break;
            }
        }

    }
}
