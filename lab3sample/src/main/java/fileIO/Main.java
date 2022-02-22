package fileIO;


import java.util.ArrayList;
import java.util.List;

import users.User;

public class Main {

  public static void main(String[] args) {
    User user = new User(0, "User", 15);
    User user2 = new User(1, "User22", 1522);
    List<User> userList = new ArrayList<>();
    userList.add(user);
    userList.add(user2);
    FileIOInterface fio = new FileIO();
    
    fio.saveToFile(userList);
    System.out.println((List<User>)fio.loadFromFile());

  }

}