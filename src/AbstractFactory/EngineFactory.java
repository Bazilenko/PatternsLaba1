package AbstractFactory;

public class EngineFactory {
    public Engine createEngine(EngineTypes type){
        switch (type){
            case gas -> {
                return new GasEngine();
            }
            case diesel -> {
                return new DieselEngine();
            }
            case electric -> {
                return new ElectricEngine();
            }
            default -> {return null;}
        }
    }
}
