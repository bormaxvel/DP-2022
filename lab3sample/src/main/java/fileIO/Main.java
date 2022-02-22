package fileIO;


import java.util.ArrayList;
import java.util.List;

import items.Gamepad;

public class Main {

  public static void main(String[] args) {
    Gamepad user = new Gamepad(0, "User", 15);
    Gamepad user2 = new Gamepad(1, "User22", 1522);
    List<Gamepad> userList = new ArrayList<>();
    userList.add(user);
    userList.add(user2);
    FileIOInterface fio = new FileIO();
    
    fio.saveToFile(userList);
    System.out.println((List<Gamepad>)fio.loadFromFile());

  }

}