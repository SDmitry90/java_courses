package by.itacademy.java.dserbunou.home.practice7.datalayer.entity;

import java.util.Date;

public class Model {
	private Integer id;

	private String name;

	private Date created;

	private Date updated;

	private Integer brand_id;

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

	public Integer getBrand_id() {
		return brand_id;
	}

	public void setBrand_id(Integer brand_id) {
		this.brand_id = brand_id;
	}

	@Override
	public String toString() {
		return "Model [id=" + id + ", name=" + name + ", brand_id=" + brand_id + "]";
	}

}
