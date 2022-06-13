package Exam.items;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="table_2")

public class table2 implements Serializable{
	
	@Id
	@GeneratedValue
	int id;
	String name;
	int price;
	String description;
	String link;
	
	
	public table2() {
		
	}
	
	
	public table2(int id, String name, int price, String description, String link) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.description = description;
		this.link = link;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getLink() {
		return link;
	}


	public void setLink(String link) {
		this.link = link;
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




}

