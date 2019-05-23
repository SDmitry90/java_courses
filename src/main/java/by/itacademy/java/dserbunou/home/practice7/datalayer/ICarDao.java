package by.itacademy.java.dserbunou.home.practice7.datalayer;

import java.util.List;

import by.itacademy.java.dserbunou.home.practice7.datalayer.entity.Car;

public interface ICarDao {

	Car get(Integer id);

	Car get1(String vin);

	Car get2(Integer model_id);

	Car insert(final Car entity);

	void update(final Car entity);

	void delete(final Integer id);

	List<Car> getAll();

}
