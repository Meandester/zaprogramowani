/*
poradnik: https://javastart.pl/baza-wiedzy/java-podstawy-jezyka
- nazwa każdej klasy jest poprzedzana słowem class
- public jest modyfikatorem dostępu do klasy. Modyfikator oznacza czy klasa jest widzialna z zewnątrz.
 */
public class Main {
    /*
    + metoda main (poniżej) jest metodą rozruchową programu, od niej zaczyna się wykonywanie wszystkich instrukcji.
    + public - modyfikator dostępu
    + static - oznacza, że metoda jest statyczna. Komputer zarezerwował konkretne miejsce w pamięci dla metody.
    + void - oznacza, że metoda nic nie zwraca. Jest wykonywany cały kod i wraz z opuszczeniem bloku kodu kończy się.
    + main - nazwa metody wykonawczej
    + String[] args - Możliwość przyjęcia zestawu znaków przy wywoływaniu metody
    */
    public static void main(String[] args) {
        /*
        + Poniżej jest zapis strumienia znaków wysyłanego do konsoli
        + System - oznacza nasz program
        + out - oznacza, że chcemy wydostać jakąś informację z naszego programu
        + println - jest to wydruk do konsoli poprzez strumień drukowania (Print Stream)
         */
        System.out.println("Hello World!");

        //różne metody wyświetlania tekstu w konsoli / terminalu

        System.out.print("A");
        System.out.print("B");
        System.out.print("C");
        System.out.print("D\n");
        System.out.println("------");
        System.out.println("ABCD");
        System.out.println("------");
        System.out.println("A");
        System.out.println("B");
        System.out.println("C");
        System.out.println("D");
        System.out.println("------");
        System.out.println("A \nB \nC \nD"); // \n oznacza enter
        System.out.println("------");
        System.out.println("A \tB \tC \tD"); // \t oznacza tabulator

        // pierwszy sposób komentowania - jeden wiersz
        /*
        Komentowanie wielu wierszy bez wyróżnienia
        wiersz 2
         */
        /**
         * komentowanie wielu wierszy jako dokumentacja JAVA
         * wiersz 2
         */

    }
}
