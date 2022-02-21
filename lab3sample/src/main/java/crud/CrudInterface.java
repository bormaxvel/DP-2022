package crud;

import java.util.List;

import users.User;

public interface CrudInterface {
	public List<User> readGamepads();
	public void updateGamepads(List<User> user);

}
