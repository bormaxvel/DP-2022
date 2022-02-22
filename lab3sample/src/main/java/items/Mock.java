package items;

import java.util.ArrayList;
import java.util.List;

public class Mock {
	
	private List<Gamepad> userList = new ArrayList<>();
	
	
	public Mock () {		
		this.userList.add(new Gamepad(0,"Roman",40));
		this.userList.add(new Gamepad(1,"Olena",24));
		this.userList.add(new Gamepad(2,"Stephan",19));
	}

	public List<Gamepad> getUserList() {
		return userList;
	}

	public void setUserList(List<Gamepad> userList) {
		this.userList = userList;
	}
	
	

}
