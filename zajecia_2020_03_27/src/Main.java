public class Main {
    public static void main(String[] args) {

        Pojazd miniVan = new Pojazd();
        Pojazd sport = new Pojazd(2, 60, 11.5);

        miniVan.danePojazdu();
        sport.danePojazdu();

        Pojazd bus = new Pojazd(9, 90, 7.0);

        miniVan.pasazerowie = 8;
        miniVan.pojemnoscZbiornikaPaliwa = 89;
        miniVan.lkm = 9.8;

        miniVan.danePojazdu();

        System.out.println("Wydruk bez VOID:");
        System.out.println("MiniVan: " + miniVan.zasieg() + " km");
        System.out.println("Sport: " + sport.zasieg() + " km");
        System.out.println("Bus: " + bus.zasieg() + " km");

        int zasiegWszystkichPojazdow = miniVan.zasieg() + sport.zasieg() + bus.zasieg();

        System.out.println("Zasięg wszystkich pojazdów: " + zasiegWszystkichPojazdow + " km");
        System.out.println("Wydruk VOID:");
        miniVan.zasiegVoid();
        sport.zasiegVoid();
        bus.zasiegVoid();

        System.out.println("miniVan zasięg z parametrów: " + miniVan.zasiegSprawdzenie(100, 8.0) + " km");
        System.out.println("MiniVan: " + miniVan.zasieg() + " km");
        miniVan.zasiegSprawdzenieVoid(100,8.0);



//        int zasiegWszystkichPojazdowVoid = miniVan.zasiegVoid();
    }
}
