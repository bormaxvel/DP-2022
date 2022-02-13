package fileIO;

import Gamepads.GamepadsClass;

public class Main {

	public static void main(String[] args) {
		GamepadsClass gamepad = new GamepadsClass("gamepad1", 300, 0.3f);
		FileIOInterface fio = new fileIO();
		fio.saveToFile(gamepad);
		System.out.println((GamepadsClass)fio.loadFromFile());
	}

}
