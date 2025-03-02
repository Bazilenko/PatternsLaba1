package FactoryMethod;

public class MicrosoftSqlConnection extends DataBaseConnection {
    public boolean connect(User user){
        try {
            System.out.println("Connecting to MicrosoftSql database");
            return true;
        }
        catch (Exception e){
            System.out.println();
            return false;
        }
    }

    public boolean disconnect(){
        try {
            System.out.println("Disconnecting from MicrosoftSql database");
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
