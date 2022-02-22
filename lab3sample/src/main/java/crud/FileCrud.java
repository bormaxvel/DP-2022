package crud;

import java.util.List;

import fileIO.FileIOInterface;
import items.Gamepad;
import fileIO.FileIO;

public class FileCrud implements CrudInterface {

	FileIOInterface fio;
	public FileCrud() {
		this.fio = new FileIO();
	}
	
	@Override
	public List<Gamepad> readList() {
		// TODO Auto-generated method stub
		return (List<Gamepad>) fio.loadFromFile();
	}

	@Override
	public void updateList(List<Gamepad> user) {
		fio.saveToFile(user);

	}

}
