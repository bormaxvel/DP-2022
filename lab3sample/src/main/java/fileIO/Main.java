package fileIO;


import users.User;

public class Main {

  public static void main(String[] args) {
    User user = new User(0, "User", 15);
    FileIOInterface fio = new FileIO();
    fio.saveToFile(user);
    System.out.println((User)fio.loadFromFile());

  }

}