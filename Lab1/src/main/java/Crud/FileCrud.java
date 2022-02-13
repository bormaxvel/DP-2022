package Crud;

import Gamepads.GamepadsClass;
import fileIO.FileIOInterface;
import fileIO.fileIO;

public class FileCrud implements Lab2CrudInterface {

	FileIOInterface fio;
	public FileCrud() {
		this.fio = new fileIO();
	}
	
	@Override
	public GamepadsClass readGamepads() {
		
		return (GamepadsClass) fio.loadFromFile();
	}

	@Override
	public void updateGamepads(GamepadsClass Gamepads) {
		fio.saveToFile(Gamepads);

	}

}
