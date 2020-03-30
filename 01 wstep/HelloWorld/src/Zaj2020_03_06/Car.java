//zad
        /*
        Stwórz obiekt Car
        Obiekt ma zawierać takie informacje:
        * marka - String
        * ilość drzwi - int
        * napęd na ile kół - int
        * typ nadwozia - String
        * po której stronie kierownica - String
        * moc silnika - double
        * czy ma abs -  boolean

        będzie miał zawierać metody:
        * wydruk wszystkich pól z obiektu - void
        * zmień tylko moc silnika - double
        * wydruk o mocy silnika - double
         */

public class Car {
    String mark;
    int doorNo;
    int propulsionOnNoOfWheels;
    String typeOfCar;
    String whereIsSteringWheel;
    double engineForce;
    boolean absSystem;

    public Car(String mark, int doorNo, int propulsionOnNoOfWheels,
               String typeOfCar, String whereIsSteringWheel, double engineForce,
               boolean absSystem) {
        this.mark = mark;
        this.doorNo = doorNo;
        this.propulsionOnNoOfWheels = propulsionOnNoOfWheels;
        this.typeOfCar = typeOfCar;
        this.whereIsSteringWheel = whereIsSteringWheel;
        this.engineForce = engineForce;
        this.absSystem = absSystem;
    }

    public String wydruk() {
        return "Car{" +
                "mark='" + mark + '\'' +
                ", doorNo=" + doorNo +
                ", propulsionOnNoOfWheels=" + propulsionOnNoOfWheels +
                ", typeOfCar='" + typeOfCar + '\'' +
                ", whereIsSteringWheel='" + whereIsSteringWheel + '\'' +
                ", engineForce=" + engineForce +
                ", absSystem=" + absSystem +
                '}';
    }

    public double getEngineForce(){
        return this.engineForce;
    }

    public void setEngineForce(double engineForce) {
        this.engineForce = engineForce;
    }

}
