import java.util.ArrayList;
import java.util.List;

public class InformacjeOSzkole {

    public int ileJestKlasWSzkole(Szkola szkola){
        return szkola.getKlasy().length;
    }

    public void jakieSaWSzkoleProfile(Szkola szkola){
        System.out.println("Profile klasy:");
        Klasa[] klasy = szkola.getKlasy();
        for (int i = 0; i < klasy.length; i++) {
            System.out.println(klasy[i].getProfilKlasy());
        }
        System.out.println("-----------");
    }

    public void listaUczniowKlasy(Klasa klasa){
        System.out.println("Lista uczniów:");
        for (int i = 0; i < klasa.getUczniowie().length; i++) {
            System.out.print(klasa.getUczniowie()[i].getImie() + " ");
            System.out.println(klasa.getUczniowie()[i].getNazwisko());
        }
        System.out.println("-----------");
    }

}
