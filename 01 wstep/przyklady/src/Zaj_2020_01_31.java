import java.util.concurrent.TimeUnit;

public class Zaj_2020_01_31 {
    public static void main(String[] args) throws InterruptedException {
        /*
        zad 1. Wyświetl swoje imię 10 razy wykorzystując pętlę for
        zad 2. Napisz stoper odliczający do 30
        zad 3. Wyświetl wszystkie elementy tablicy wykorzystując pętlę for(pamiętaj
        o wykorzystaniu słowa kluczowego definijącego długość tablicy.
        zad 4. Wprowadź 10 liczb poprzez scanner tworząc tablicę 10 elementową.
        zad 5. Stwórz tablicę {1,2,3,4,5,6,7,8,9,10}.
        Wydrukuj na ekran liczbywiększe od 5 iterując po niej.
        zad 6. Napisz program który przyjmnie od Ciebie dziesięć
        imion i je zapisze do tablicy dziesięcio elementowej.
        Następnie po otrzymaniu dziesięciu imion wydrukuj je na ekran w
        następujący sposób: imię w rekordzie [nr rekordu] to [imię].
        zad 7. Zsumuj wszystkie wartości z tablicy int[] tab = {90,50,63,25}
        zad 8. Rozszerz zadanie 4 o wydruk elementów do konsoli po wprowadzeniu ich poprzez scanner.
         */

        /*
                zad 1. Wyświetl swoje imię 10 razy wykorzystując pętlę for
         */
        System.out.println("Zad1");
        for (int i = 0; i < 10 ; i++) {
            System.out.println("Filip " + i);
        }
        /*
                zad 2. Napisz stoper odliczający do 30
         */

//        for (int i = 30; i > 0 ; i--) {
//            System.out.println(i+1);
//            TimeUnit.SECONDS.sleep(1);
//        }

        /*
        zad 3. Wyświetl wszystkie elementy tablicy wykorzystując pętlę for(pamiętaj
            o wykorzystaniu słowa kluczowego definijącego długość tablicy.
         */

        int[] wartosci = {4,5,7,6};

        for (int i = 0; i < wartosci.length ; i++) {
            System.out.println(wartosci[i]);
        }
    }
}
