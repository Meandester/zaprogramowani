import java.util.concurrent.TimeUnit;

public class Petle {
    public static void main(String[] args) throws InterruptedException {

        int zmienna = 10;
        int zakresDolny = 0;
        int zakreGorny = 10;

        while (zakresDolny<zmienna){
            System.out.println("Odliczanie: " + zmienna);
            zmienna--;
            TimeUnit.SECONDS.sleep(1);
        }

        do{
            System.out.println("Zmienna to: " + zmienna);
            zmienna++;
            TimeUnit.SECONDS.sleep(1);
        }
        while(zmienna<zakreGorny);


    }
}
