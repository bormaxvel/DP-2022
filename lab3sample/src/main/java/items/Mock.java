package items;

import java.util.ArrayList;
import java.util.List;

public class Mock {
	
	private List<Gamepad> userList = new ArrayList<>();
	
	
	public Mock () {		
		this.userList.add(new Gamepad(0,"Roman",40, "bla bla blam", "bla bla blam"));
		this.userList.add(new Gamepad(1,"Olena",24, "bla bla blam", "bla bla blam"));
		this.userList.add(new Gamepad(2,"Stephan",19, "bla bla blam", "bla bla blam"));
	}

	public List<Gamepad> getUserList() {
		return userList;
	}

	public void setUserList(List<Gamepad> userList) {
		this.userList = userList;
	}
	
	

}
