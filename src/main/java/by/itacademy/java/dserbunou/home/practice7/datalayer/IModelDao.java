package by.itacademy.java.dserbunou.home.practice7.datalayer;

import java.util.List;

import by.itacademy.java.dserbunou.home.practice7.datalayer.entity.Model;

public interface IModelDao {

	Model get(Integer id);

	Model getBrand(Integer brand_id);

	Model insert(final Model entity);

	void update(final Model entity);

	void delete(final Integer id);

	List<Model> getAll();
}
