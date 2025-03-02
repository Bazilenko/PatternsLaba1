package AbstractFactory;

public class Car {
    public Engine engine;
    public String fuelType;

    public Car(Engine engine){
        this.engine = engine;
    }
}
