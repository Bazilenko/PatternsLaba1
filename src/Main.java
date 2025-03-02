import AbstractFactory.*;
import FactoryMethod.ConnectionFactory;
import FactoryMethod.DataBaseConnection;
import FactoryMethod.DataBases;
import FactoryMethod.User;
import Singleton.Customer;
import Singleton.Singleton;
import Prototype.Hero;
import Prototype.Monster;
import AbstractFactory.Car;
import AbstractFactory.EngineFactory;

public class Main {
    public static void main(String[] args){
        menuSingleton();
    }

    public static void menuSingleton(){
        Singleton barista = Singleton.getInstance("Petro", 9800, 5);
        //припустимо, що до цього працював інший бариста і клієнт покличе його
        Singleton newBarista = Singleton.getInstance("Vasyl", 11000, 9);
        Customer customer = new Customer();
        Customer customer1 = new Customer();

        customer.makeOrder("Latte", barista);
        System.out.println(customer);

        customer1.makeOrder("Espresso", newBarista);
        System.out.println(customer1);
    }


    public static void menuFactory(){
        DataBases type = DataBases.valueOf("mySql");
        DataBases type1 = DataBases.valueOf("microsoftSql");
        String query = "SELECT * FROM USERS";

        DataBaseConnection connection = ConnectionFactory.getConnection(type);
        DataBaseConnection connection1 = ConnectionFactory.getConnection(type1);
        User user = new User();
        connection.connect(user);
        connection.disconnect();
        connection.makeQuery(query);

        System.out.println();
        connection1.connect(user);
        connection1.disconnect();
    }

    public static void menuPrototype(){
        Monster zombie = new Monster("Zombie", 250, 25);
        Hero hero = new Hero();
        hero.killMonster(zombie);
        hero.killMonster(zombie);
        System.out.println("Hero killed " + hero.getKilledMonsters());
    }

    public static void menuAbstractFactory(){
        EngineFactory dieselFactory = new EngineFactory();
        EngineFactory electricFactory = new EngineFactory();

        Engine diesel = dieselFactory.createEngine(EngineTypes.valueOf("diesel"));
        Engine electric = electricFactory.createEngine(EngineTypes.valueOf("electric"));

        Car car = new Car(electric);
        Car car1 = new Car(diesel);

        car.engine.startEngine();
        car1.engine.startEngine();

        car.engine.stopEngine();
        car1.engine.stopEngine();
    }
}

