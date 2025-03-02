package FactoryMethod;

public class ConnectionFactory{
    public static DataBaseConnection getConnection(DataBases dbType){
        switch (dbType){
            case DataBases.mySql -> {
                return new MySqlConnection();
            }
            case DataBases.microsoftSql -> {
                return new MicrosoftSqlConnection();
            }
            case DataBases.postgreSql -> {
                return new PostgreSqlConnection();
            }
            default -> System.out.println("Unknown data base");
        }
        return null;
    }
}
