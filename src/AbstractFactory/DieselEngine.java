package AbstractFactory;

public class DieselEngine extends Engine {
    @Override
    public void startEngine() {
        System.out.println("Diesel engine working");
    }

    @Override
    public void stopEngine() {
        System.out.println("Diesel engine stop working");
    }
}
