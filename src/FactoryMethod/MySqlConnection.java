package FactoryMethod;

public class MySqlConnection extends DataBaseConnection {

    public boolean connect(User user) {
        try {
            PrintString.print("Connecting to MySql database"); //думав, що кастомна функція виводу буде краще, але ні
            return true;
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }

    }

    public boolean disconnect(){
        try {
            PrintString.print("Disconnecting from MySql database");//ну в реальному проекті буде складніша логіка
            return true;
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }

    }

    public void makeQuery(String command){
        System.out.println("Executing command " + command);
    }
}
