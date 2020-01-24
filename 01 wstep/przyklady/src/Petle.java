import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class Petle {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Pętla while (odliczanie w dół):");

        int zmienna = 10;
        int zakresDolny = 0;

        while (zakresDolny < zmienna) {
            System.out.println("Odliczanie: " + zmienna);
            zmienna--;
            TimeUnit.SECONDS.sleep(1);
        }

        System.out.println("Pętla do while (odliczanie w górę):");

        int zakreGorny = 10;

        do {
            System.out.println("Zmienna to: " + zmienna);
            zmienna++;
            TimeUnit.SECONDS.sleep(1);
        } while (zmienna <= zakreGorny);

        System.out.println("Pętla while konczona słowem kluczowym break");

        int numer = 0;
        while (true){
            System.out.println(numer);
            numer++;
            if(numer==25){
                break;
            }
        }

        System.out.println("Wykorzystanie slowa kluczowego continue do ominiecia nie potrzebnych danych");

        int liczba = 0;

        while (liczba < 10){
            liczba++;
            if(liczba % 2 == 0){
                continue;
            }
            System.out.println("Liczba nieparzysta: " + liczba);
        }

        System.out.println("Pętla For (wylistowanie elementów tablicy)");

        int zbiorLiczby[] = {3,4,67,5};

        System.out.println("Długość tablicy wynosi: " + zbiorLiczby.length);
        System.out.println("Elementy tablicy to: " + Arrays.toString(zbiorLiczby));
        for (int i = 0; i < zbiorLiczby.length ; i++) {
            System.out.println("Wydruk liczby z indeksu " + i + " wynosi " + zbiorLiczby[i]);
        }

        System.out.println("Pętla for (odliczanie do 5)");
        for (int i = 1; i <=5 ; i++) {
            System.out.println("Odliczanie: " + i);
            TimeUnit.SECONDS.sleep(1);
        }

        System.out.println("Pętla for dla każdego elementu zbioru");
        for (int a: zbiorLiczby) {
            System.out.println("element: " + a);
        }

        int zbiorLiczbySuma = 0;
        System.out.println("Wykorzystanie pętli for do sumy elementów zbioru");
        for (int a: zbiorLiczby){
            zbiorLiczbySuma = zbiorLiczbySuma + a;
            System.out.println("Suma narastająco: " + zbiorLiczbySuma);
        }
    }
}
