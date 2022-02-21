package crud;

import users.User;
import fileIO.fileIOInterface;

import java.util.List;

import fileIO.FileIO;


public class FileCrud implements CrudInterface {

	fileIOInterface fio;
	public FileCrud() {
		this.fio = new FileIO();
	}
	
	@Override
	public List<User> readGamepads() {
		
		return (List<User>) fio.loadFromFile();
	}

	@Override
	public void updateGamepads(List<User> Gamepads) {
		fio.saveToFile(Gamepads);

	}

}
