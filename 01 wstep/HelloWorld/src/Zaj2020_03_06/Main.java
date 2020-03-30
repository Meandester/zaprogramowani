public class Main {

    public static void main(String[] args) {
        Komputer komputer = new Komputer();
        komputer.wydrukInformacjiOKomputerze();

        Komputer mojKomputer = new Komputer("moj Procesor",
                128,
                "plyta moja",
                9.0);

        mojKomputer.ram = 64;

        mojKomputer.wydrukInformacjiOKomputerze();

        double taktowanie = mojKomputer.getTaktowanieProcesora();
        System.out.println("Tatkowanie procka: " + taktowanie);

        Car car = new Car("bmw",4,2,"Combi",
                "Left",163,true);

        car.wydruk();
        car.setEngineForce(180);
        car.wydruk();
    }
}
