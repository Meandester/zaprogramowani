package Zaj2019_12_20;

public class IfElseIf {
    public static void main(String[] args) {
        /*
         * Napisz instrukcję sterującą dla kosztu przeglądu rocznego:
         * AUDI = 800.00 PLN, BMW = 1100.00 PLN , FIAT = 500.00 PLN, SKODA = 600.00 PLN
         */
        String auto = "BMW";
        String audi = "AUDI";
        String bmw = "BMW";
        String fiat = "FIAT";
        String skoda = "SKODA";

        if (auto==audi){
            System.out.println("Koszt " + audi + " wynosi: " + 800.00 + "PLN");
        } else if(auto==bmw) {
            System.out.println("Koszt " + bmw + " wynosi: " + 1100.00 + "PLN");
        } else if(auto==fiat){
            System.out.println("Koszt " + fiat + " wynosi: " + 500.00 + "PLN");
        } else if(auto==skoda){
            System.out.println("Koszt " + skoda + " wynosi: " + 600.00 + "PLN");
        }
    }
}
