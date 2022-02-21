package crud;

import java.util.List;

import fileIO.FileIOInterface;
import fileIO.FileIO;
import users.User;

public class FileCrud implements CrudInterface {

	FileIOInterface fio;
	public FileCrud() {
		this.fio = new FileIO();
	}
	
	@Override
	public List<User> readList() {
		// TODO Auto-generated method stub
		return (List<User>) fio.loadFromFile();
	}

	@Override
	public void updateList(List<User> user) {
		fio.saveToFile(user);

	}

}
