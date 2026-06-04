package Discussion7;

class Car {
    // Attributes
    String owner;
    String brandName;
    String serialNumber;
    int fuel;
    boolean isRunning;


    Car(String owner, String brandName, String serialNumber, int fuel) {
        this.owner = owner;
        this.brandName = brandName;
        this.serialNumber = serialNumber;
        this.fuel = fuel;
        this.isRunning = false;
    }

  
    void startCar() {
        if (fuel > 0) {
            isRunning = true;
            System.out.println("Car started.");
        } 
    }


    void stopCar() {
        isRunning = false;
        System.out.println("Car stopped.");
    }
    
    void checkFuel() {
        System.out.println("Fuel Level: " + fuel + "liters");
    }
}
public class carDemo {
    public static void main(String[] args) {
        Car car = new Car("Fuad","BMW","TY12345",41);

        car.checkFuel();
        car.startCar();
        car.stopCar();
    }
}
