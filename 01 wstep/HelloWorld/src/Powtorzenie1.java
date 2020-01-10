// Zadanie 0 - Zadeklaruj zmienne typu:
//  String,
//  int,
//  boolean,
//  double
// dla wartości:
//   false,
//   100,
//   35.96,
//   maly dom
public class Powtorzenie1 {
    public static void main(String[] args) {
        String slowo = "auto";
        int x = 9;
        boolean prawda = true;
        double pi = 3.14;

        System.out.println(slowo);
        System.out.println(x);
        System.out.println(prawda);
        System.out.println(pi);


        //Zadanie 1 – Napisz program który
        // będzie liczył pole prostokąta.

        double a = 5.5;
        double b = 3;

        double wynik = a * b;
        String opis = "Wynik: ";

        System.out.println(opis + wynik);
        //oblicz pole trapezu o dowolnych bokach i wysokości

        double aa = 5;
        double bb = 3;
        double h = 13;

        double poleTrapezu = (aa+bb)*h/2;

        System.out.println("Trapez " + opis + poleTrapezu);

        // Zadanie 2 - Napisz program który zsumuje wiek
        // wszystkich uczestników zajęć i wypisze z osobna ile kto ma lat.

        int szymonWiek = 12;
        int mateuszWiek = 14;
        int kacperWiek = 12;
        int marekWiek = 13;
        int mateuszSWiek = 14;
        int karinaWiek = 12;

        int sumaWieku = szymonWiek + mateuszWiek + kacperWiek + marekWiek
                + mateuszSWiek + karinaWiek;

        String opisWiek = "Wiek: ";

        System.out.println(opisWiek + "Kariny " + karinaWiek);
        System.out.println(opisWiek + "Kariny " + karinaWiek);
        System.out.println(opisWiek + "Kariny " + karinaWiek);
        System.out.println(opisWiek + "Kariny " + karinaWiek);
        System.out.println(opisWiek + "Kariny " + karinaWiek);
        System.out.println(opisWiek + "Kariny " + karinaWiek);
        System.out.println(opisWiek + "Kariny " + karinaWiek);

        //Policz obwód prostokąta, wypisz jaką długość ma każdy bok
        // wypisz jaki prostokąt ma obwód

    }
}
