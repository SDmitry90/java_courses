package by.itacademy.java.dserbunou.home.practice7.datalayer.entity;

import java.util.Date;

public class Car {

	private Integer id;

	private String name;

	private Date created;

	private Date updated;

	private Integer model_id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getUpdated() {
		return updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}

	public Integer getModel_id() {
		return model_id;
	}

	public void setModel_id(Integer model_id) {
		this.model_id = model_id;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", name=" + name + "]";
	}

}
