package mock;

import Crud.Lab2CrudInterface;
import Gamepads.GamepadsClass;

public class Lab2CrudMock implements Lab2CrudInterface {

	@Override
	public GamepadsClass readGamepads() {
		// TODO Auto-generated method stub
		return new GamepadsClass("gamepad1", 300, 0.3f);
	}

	@Override
	public void updateGamepads(GamepadsClass Gamepads) {
		// TODO Auto-generated method stub

	}

}
