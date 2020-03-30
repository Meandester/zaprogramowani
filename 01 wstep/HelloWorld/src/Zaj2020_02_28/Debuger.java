package Zaj2020_02_28;

public class Debuger {
    public static void main(String[] args) {
        // Tablica utworzona o typie String i wielkości 7
        String[] daysOfWeek = new String[7];
        daysOfWeek[0] = "poniedziałek";
        daysOfWeek[1] = "wtorek";
        daysOfWeek[2] = "środa";
        daysOfWeek[3] = "czwartek";
        daysOfWeek[4] = "piątek";
        daysOfWeek[5] = "sobota";
        daysOfWeek[6] = "niedziela";
        // Zmiana wartości tablicy o indeksie 0
        System.out.println("Ostatni dzień tygodnia: " + daysOfWeek[6]);
        daysOfWeek[6] = "Sunday";
        System.out.println("Ostatni dzień tygodnia: " + daysOfWeek[6]);
        System.out.println("Drugi dzień tygodnia: " + daysOfWeek[1]);
        // Tablica utworzona o typie String i wielkości 3
        String[] tablicaString = {"Kot", "Pies", "Słoń"};
        System.out.println(tablicaString[1]);

        System.out.println(tablicaString.length);
 //
        int[] number = new int[7];
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;
        number[3] = 4;
        number[4] = 5;
        number[5] = 6;
        number[6] = 7;

        for (int i = 0; i < number.length ; i++) {
            System.out.println(number[i]);
        }
        int someSum = number[0] + number [6];
      //
    }
}
