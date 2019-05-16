package by.itacademy.java.dserbunou.home.practice7.datalayer.xml.table;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import by.itacademy.java.dserbunou.home.practice7.datalayer.entity.Car;

@XmlRootElement
public class CarTable {

	private Integer nextId = 1;

	private List<Car> cars = new ArrayList<>();

	public Integer getNextId() {
		return nextId;
	}

	public void setNextId(Integer nextId) {
		this.nextId = nextId;
	}

	public List<Car> getCars() {
		return cars;
	}

	public void setCars(List<Car> cars) {
		this.cars = cars;
	}

	public Integer nextId() {
		nextId++;
		return nextId;
	}

}