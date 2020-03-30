package Zaj2020_01_03;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("System weryfikujący czy jesteś pełnoletni:");
        System.out.println("Podaj swoje imię:");
        String name = scanner.nextLine();
        scanner.close();
        System.out.println("Moje imię to: " + name);
//
//        System.out.println("Podaj swoje nazwisko:");
//        String nazwisko = scanner.nextLine();
//
//        System.out.println("Podaj swój wiek: ");
//        int age = scanner.nextInt();
//        scanner.close();
//
//        int adultAge = 18;
//        boolean isAdult= age >= adultAge;
//
//        System.out.println("Obywatel: " + name + " " + nazwisko);
//        System.out.println("Wiek: " + age + " lat");
//        System.out.println("Czy jest pełnoletni(a): " + isAdult);
    }
}
