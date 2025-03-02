package AbstractFactory;

public class ElectricEngine extends Engine{
    @Override
    public void startEngine() {
        System.out.println("Electric engine working");
    }

    @Override
    public void stopEngine() {
        System.out.println("Electric engine stop working");
    }
}
