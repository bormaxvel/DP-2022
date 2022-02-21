package crud;

import java.util.List;

import users.User;

public interface CrudInterface {
	public List<User> readList();
	public void updateList(List<User> user);

}
