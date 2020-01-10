public class OperatoryLogiczneILub {
    public static void main(String[] args) {
        System.out.println("Napisz warunki dla 'a' większego od 'b' i/lub mniejszego od 'c'.");
        int a = 18;
        int b = 17;
        int c = 19;
        boolean warunekAWiekszeOdB = a > b;
        boolean warunekAmniejszeOdC = a < c;
        boolean warunekAWiekszeOdBIMniejszeOdC = warunekAWiekszeOdB && warunekAmniejszeOdC;
        boolean warunekAWiekszeOdBLubMniejszeOdC = warunekAWiekszeOdB || warunekAmniejszeOdC;

        String warunekI = "Warunek 'a' wieksze od 'b' i mniejsze od 'c': ";
        String warunekLub = "Warunek 'a' wieksze od 'b' lub mniejsze od 'c': ";
        if (warunekAWiekszeOdBIMniejszeOdC) {
            System.out.println(warunekI + warunekAWiekszeOdBIMniejszeOdC);
            System.out.println("c: " + c + " > a: " + a + " > b: " + b);
        } else {
            System.out.println(warunekI + warunekAWiekszeOdBIMniejszeOdC);
        }
        if (warunekAWiekszeOdBLubMniejszeOdC) {
            System.out.println(warunekLub + warunekAWiekszeOdBLubMniejszeOdC);
            System.out.println("Warunek 'a' wieksze od 'b': " + warunekAWiekszeOdB + " : a: " + a + " >b: " + b);
            System.out.println("Warunek 'a' mniejsze od 'c': " + warunekAmniejszeOdC + " : c: " + c + " >a: " + a);
        } else {
            System.out.println(warunekLub + warunekAWiekszeOdBLubMniejszeOdC);
        }
    }
}
