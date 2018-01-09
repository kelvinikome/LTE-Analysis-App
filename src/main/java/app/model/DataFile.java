package app.model;


import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "files")
public class DataFile {

	@Id
	@Column(name = "id")
	private int id;
	
	@Column(name = "name")
	private String fileName;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "owner")
	private String owner;
	
	@Column(name = "date")
	private Date date;

	public DataFile() {
		
	}
	
	public DataFile(String fileName, String description, String owner) {
		this.id++;
		this.fileName = fileName;
		this.description = description;
		this.owner = owner;
		this.date = new Date();
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}