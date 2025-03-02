package AbstractFactory;

public class GasEngine extends Engine {
    @Override
    public void startEngine() {
        System.out.println("Gas engine working");
    }

    @Override
    public void stopEngine() {
        System.out.println("Gas engine stop working");
    }
}
