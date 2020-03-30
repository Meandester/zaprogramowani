import java.util.Scanner;

public class Warunki {
    public static void main(String[] args) {

        // dwie zmienne a i b typy int
        // i przypisali do nich 5 i 7
//
//        int a = 8;
//        int b = 7;
//
//        if(a > b){
//            System.out.println("Liczba " +  a +
//                    " jest większa od liczby " + b);
//        }
//        System.out.println("-------------------------------");
//        boolean opis = false ;
//        if(opis){
//            System.out.println("To jest opis");
//        }
//
//        boolean wyjscieDoKafejki = false;
//        if(wyjscieDoKafejki){
//            System.out.println("Gramy w CSa");
//        } else {
//            System.out.println("Nie mam pieniędzy więc nie gram");
//        }
//        System.out.println("Jestem w domu gdzie nie mam netu :(");

        /*
         *program sprawdzający czy mnożenie dwóch cyfr jest większe od warunku
         * Jeżeli jest mniejsze to wyświetl informacje, że jest mniejsze
         */

        int a;
        int b;
        int warunek;

        a = 10;
        b = 1;
        warunek = 15;
        int obliczenia;

        if (b == 0) {
            System.out.println("Nie dziel przez 0 !");
        } else if(b != 0){
            obliczenia = a / b;
            if (obliczenia > warunek) {
                System.out.println(obliczenia + " sa większe od warunku: " + warunek);
            } else if (obliczenia < warunek) {
                System.out.println(obliczenia + " sa mniejsze od warunku: " + warunek);
            } else if (obliczenia == warunek) {
                System.out.println(obliczenia + " sa równe warunkowi: " + warunek);
            }
        }


        {
            int c = 2;
            int d = 2;
            int mnozenie = c * d;
            int warunku = 5;
//
//            if (mnozenie > warunku) {
//                System.out.println(mnozenie + " większe od warunku: " + warunku);
//            } else {
//                System.out.println(
//                        mnozenie + " mniejszey od warunku: " + warunku);
//            }
//
        }

        // Conditions

//        if (2 == 2) {
//            // blok kodu wykonywany jeżeli jest prawda
//            System.out.println("Liczby są sobie równe");
//        }
    }
}


// } else {
//            // blok kodu wykonywany jeżeli jest fałsz
//            System.out.println("Liczby sa sobie nierówne");
//        }