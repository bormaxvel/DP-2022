package Gamepads;

import java.io.Serializable;

public class GamepadsClass implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	String title;
	int price;
	float weight;
	
	public GamepadsClass(String title, int price, float weight) {
		super();
		this.title = title;
		this.price = price;
		this.weight = weight;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "{\"title\": \""+title+"\", \"price\":"+ price+", \"weight\":" + weight+"}";
	}
	
}
