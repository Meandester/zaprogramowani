public class Switch {
    public static void main(String[] args) {
        System.out.println("Program mający na celu sprawdzenie, czy podana liczba jest 1 lub 2.");
        int number = 0; // sprawdzany numer
        switch (number) {
            case 1: // przypadek pierwszy kiedy liczba jest równa wartości jeden.
                System.out.println("jeden"); // w tym przypadku wydruk do konsoli informacji.
                break; // oznacza zakończenie wykonywania się dalszej części switcha.
            case 2: // przypadek drugi kiedy liczba jest równa wartości dwa.
                System.out.println("dwa");
                break;
            default: // przypadek domyślny tzn dla wszystkich wartości nie wymienionych powyżej
                System.out.println("liczba inna niż 1 i 2");
        }
    }
}
