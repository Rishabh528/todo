package io.rishabh528.todo.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class ToDo {
	
	//Private members for todo Entities(matched to database columns)
	
	@Id
	private long id;
	
	private String description;
	private Date targetDate;
	
	//Constructors
	
	
	
	public ToDo(long id, String description, Date targetDate) {
		super();
		this.id = id;
		this.description = description;
		this.targetDate = targetDate;
	}
	
	public ToDo() {
		super();
	}

	
	// Getters & Setters
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getTargetDate() {
		return targetDate;
	}
	public void setTargetDate(Date targetDate) {
		this.targetDate = targetDate;
	}
	
	
}
