package Zaj2019_12_20;

public class Zaj19_12_20 {
        /*
        zad 2 - napisz instrukcję sprawdzającą jaki jest miesiąc.
        * Miesiąc podaj liczbą całkowitą do warunku a wydruk do konsoli
        * niech będzie słowną nazwą miesiąca.
        zad 3 - mamy podane liczby całkowite: 1,2,3.
        * Napisz instrukcje sterującą która
        * dla liczby 1 wydrukuje na ekran liczby 1,2,3 .
        * Dla liczby 2 wydrukuje na ekran liczby 2,3 .
        * Dla liczby 3 wydrukuje na ekran liczbę 3.
        */

    public static void main(String[] args) {
        /*
         *zad 1 - napisz instrukcje sprawdzającą jaka jest pora roku.
         * Pory roku podaj liczbami całkowitymi od 1 do 4,
         * a następnie wydrukuj na ekran porę roku.
         */
        /*{
            int poraRoku = 3;

            int wiosna = 1;
            int lato = 2;
            int jesien = 3;
            int zima = 4;

            if(poraRoku==wiosna){
                System.out.println("Wskazana pora roku to wiosna");
            } else if(poraRoku==lato){
                System.out.println("Wskazana pora roku to lato");
            }else if(poraRoku==jesien){
                System.out.println("Wskazana pora roku to j");
            }else if(poraRoku==zima) {
                System.out.println("Wskazana pora roku to z");
            }
        }
*/
        int poraRoku = 2;

        switch (poraRoku) {
            case 1:
                System.out.println("Jest wiosna");
                break;
            case 2:
                System.out.println("Jest lato");
                break;
            case 3:
                System.out.println("Jest jesień");
                break;
            case 4:
                System.out.println("Jest zima");
                break;
            default:
                System.out.println("Nie ma takiej pory roku!");
        }

        /*
        zad 3 - mamy podane liczby całkowite: 1,2,3.
* Napisz instrukcje sterującą która
* dla liczby 1 wydrukuje na ekran liczby 1,2,3 .
* Dla liczby 2 wydrukuje na ekran liczby 2,3 .
* Dla liczby 3 wydrukuje na ekran liczbę 3.
         */

        int liczba = 3;
        switch (liczba) {
            case 1:
                System.out.print("1,");
            case 2:
                System.out.print("2,");
            case 3:
                System.out.println("3");
                break;
            default:
                System.out.println("nie jest to licza od 1 do 3");
        }

    }
}
