package by.itacademy.java.dserbunou.home.practice7.datalayer;

import java.util.List;

import by.itacademy.java.dserbunou.home.practice7.datalayer.entity.Brand;

public interface IBrandDao {

	Brand get(Integer id);

	Brand insert(final Brand entity);

	void update(final Brand entity);

	void delete(final Integer id);

	List<Brand> getAll();

}
