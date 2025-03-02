package FactoryMethod;

public class PostgreSqlConnection extends DataBaseConnection {
    public boolean connect(User user){
        try{
            System.out.println("Connecting to PostgreSql database");
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public boolean disconnect() {
        try{
            System.out.println("Disconnecting from PostgreSql database");
            return true;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        return false;
        }
    }

    public void makeQuery(String command){
        System.out.println("Executing command " + command);
    }

}
