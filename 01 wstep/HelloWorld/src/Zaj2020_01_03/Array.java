package Zaj2020_01_03;

public class Array {
    public static void main(String[] args) {
        // Tablica jednowymiarowa
        {
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
        }
        //Tablica wielowymiarowa
        {
            int[][] multiArr = new int[5][];

        }
    }
}
