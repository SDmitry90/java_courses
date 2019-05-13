package by.itacademy.java.dserbunou.home.practice7.datalayer.xml.table;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import by.itacademy.java.dserbunou.home.practice7.datalayer.entity.Brand;

@XmlRootElement
public class BrandTable {

	private Integer nextId = 1;

	private List<Brand> brands = new ArrayList<>();

	public List<Brand> getBrands() {
		return brands;
	}

	public void setBrands(List<Brand> brands) {
		this.brands = brands;
	}

	public Integer getNextId() {
		return nextId;
	}

	public void setNextId(Integer nextId) {
		this.nextId = nextId;
	}

	public Integer nextId() {
		nextId++;
		return nextId;
	}
}
