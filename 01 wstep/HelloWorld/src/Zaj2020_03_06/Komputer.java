public class Komputer {

    private String nazwaProcesora = "Intel i5 3750K";
    int ram = 16;
    String motherBoard = "ASUS GX7";
    double taktowanieProcesora = 4.2;

    //pusty konstruktor
    public Komputer (){

    }

    //konstruktor z dostępem do wszystkich pól
    public Komputer(String nazwaProcesora, int ram,
                    String motherBoard, double taktowanieProcesora){
        this.nazwaProcesora = nazwaProcesora;
        this.ram = ram;
        this.motherBoard = motherBoard;
        this.taktowanieProcesora = taktowanieProcesora;
    }

    // metoda typu void która nic nie zwraca jednak po wywołaniu wykonuje kod zawarty w sowim bloku kodu
    public void wydrukInformacjiOKomputerze(){
        System.out.println(nazwaProcesora + " " + ram + " " + motherBoard + " " + taktowanieProcesora);
    }

    // metoda typu double, która po wywołaniu zwraca (return) wartość typu double,
    // w poniższym przykładzie jest to wartość pola taktowanie procesora.
    public double getTaktowanieProcesora(){
        return this.taktowanieProcesora;
    }

}
