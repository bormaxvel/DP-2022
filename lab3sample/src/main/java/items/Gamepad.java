package items;

import java.io.Serializable;

public class Gamepad implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int id;
	String name;
	int price;
	
	
	public Gamepad() {
		
	}
	
	
	public Gamepad(int id, String name, int price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return price;
	}
	public void setAge(int price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "{\"id\":"+id+",\"name\":\""+name+"\", \"price\":"+price+"}";
	}
	
	
	
	

}

