package Exam.items;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="amount")

public class table2 implements Serializable{
	
	@Id
	@GeneratedValue
	int id;
	int amount;
	@ManyToOne
	@JoinColumn(name = "itemid", nullable = false)
	private Gamepad gamepad;
	
	public table2() {
		
	}
	
	
	public table2(int id, int amount) {
		this.id = id;
		
		this.amount = amount;
	}


	


	public int getAmount() {
		return amount;
	}


	public void setAmount(int amount) {
		this.amount = amount;
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}




}

