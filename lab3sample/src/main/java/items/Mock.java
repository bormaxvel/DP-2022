package items;

import java.util.ArrayList;
import java.util.List;

public class Mock {
	
	private List<Gamepad> userList = new ArrayList<>();
	
	
	public Mock () {		
		this.userList.add(new Gamepad(0,"Dualsense",57, "DualSense, a innovative wireless controller for PS5 with tactile feedback and adaptive triggers", "bla bla blam"));
		this.userList.add(new Gamepad(1,"Xbox elite",100, "Xbox Elite Wireless Controller Series 2 features over 30 new ways to play like a pro", "bla bla blam"));
		this.userList.add(new Gamepad(2,"Nintendo pro",48, "Nintendo Switch Pro Controller is a game controller manufactured and released by Nintendo", "bla bla blam"));
	}

	public List<Gamepad> getUserList() {
		return userList;
	}

	public void setUserList(List<Gamepad> userList) {
		this.userList = userList;
	}
	
	

}
