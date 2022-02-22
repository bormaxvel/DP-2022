package crud;

import java.util.List;

import items.Gamepad;

public interface CrudInterface {
	public List<Gamepad> readList();
	public void updateList(List<Gamepad> user);

}
