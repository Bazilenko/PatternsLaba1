package FactoryMethod;

public abstract class DataBaseConnection {
    public Users users;
    public abstract boolean connect(User user);
    public abstract void makeQuery(String command);
    public abstract boolean disconnect();
}
