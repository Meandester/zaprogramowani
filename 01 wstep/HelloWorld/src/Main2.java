public class Main2 {
    public static void main(String[] args) {

        boolean warunek = true;
        String warunekTekstowy = "warunek";
        int warunekLiczbowy = 5;

        if(warunek){
            System.out.println(" wyświetl warunek ");
        }

        if(warunekTekstowy == "warunek"){
            System.out.println(" wyświetl warunek tekstowy " + warunekTekstowy);
        }

        if(warunekLiczbowy > 4){
            System.out.println(" wyświetl warunek liczbowy " + warunekLiczbowy);
        }
    }
}
