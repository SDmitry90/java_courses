package by.itacademy.java.dserbunou.home.practice7.datalayer.xml;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import by.itacademy.java.dserbunou.home.practice7.datalayer.ICarDao;
import by.itacademy.java.dserbunou.home.practice7.datalayer.entity.Car;
import by.itacademy.java.dserbunou.home.practice7.datalayer.entity.Car;
import by.itacademy.java.dserbunou.home.practice7.datalayer.xml.table.BrandTable;
import by.itacademy.java.dserbunou.home.practice7.datalayer.xml.table.CarTable;
import by.itacademy.java.dserbunou.home.practice7.datalayer.xml.table.CarTable;
import by.itacademy.java.dserbunou.home.practice7.datalayer.xml.table.CarTable;
import by.itacademy.java.dserbunou.home.practice7.datalayer.xml.table.CarTable;

public class CarXMLDaoIpml extends AbstractXMLDao<CarTable> implements ICarDao {

	private static final ICarDao INSTANCE = new CarXMLDaoIpml();

	public static ICarDao getInstance() {
		return INSTANCE;
	}

	@Override
	public Car get(Integer id) {
		throw new RuntimeException("not implemented");
	}

	@Override
	public Car get1(String vin) {
		throw new RuntimeException("not implemented");
	}

	@Override
	public Car get2(Integer model_id) {
		throw new RuntimeException("not implemented");
	}

	@Override
	public Car insert(Car entity) {
		CarTable table = read();

		Integer id = table.nextId();

		entity.setId(id);
		Date created = new Date();
		entity.setCreated(created);
		entity.setUpdated(created);
		table.getCars().add(entity);

		write(table);

		return entity;
	}

	@Override
	public void update(Car entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Integer id) {
		CarTable table = read();

		Iterator<Car> iterator = table.getCars().iterator();

		while (iterator.hasNext()) {
			Car car = iterator.next();
			if (car.getId().equals(id)) {
				iterator.remove();
			}
		}

		write(table);

	}

	@Override
	public List<Car> getAll() {
		CarTable table = read();
		return table.getCars();
	}

	@Override
	String getFileName() {
		return "cars-table.xml";
	}

	@Override
	Class<CarTable> getTableClass() {
		return CarTable.class;
	}

}
