package FactoryMethod;

import java.util.List;

//хотів реалізувати, але треба логіку міняти, тому скіп цей файл
public class Users {
    List<User> users;

    public void addUser(User user){
        users.add(user);
    }

    boolean isExistUser(User user){
        return users.contains(user);
    }
}
